package com.kh.iag.attend.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.iag.attend.entity.AttendDTO;
import com.kh.iag.attend.entity.AttendPageDTO;
import com.kh.iag.attend.entity.AttendWTDTO;
import com.kh.iag.attend.service.attendService;
import com.kh.iag.user.entity.UserDto;

@Controller
@RequestMapping("attend")
public class AttendStateController 
{
	@Autowired
	private attendService service;
	
	@GetMapping(value = {"/attendstate/{page}", "/attendstate"})
	public String attendState(Model model, HttpServletRequest req, @PathVariable(required = false) String page) throws Exception
	{
		if(page == null) 
		{
			return "redirect:attendstate/1";
		}
		
		int cntPerPage = 10;
		int pageBtnCnt = 5; 
		int totalRow = service.getAttendStateCnt();
		AttendPageDTO AttendpageDTO = new AttendPageDTO(page, cntPerPage, pageBtnCnt, totalRow);
		
		List<AttendWTDTO> attendWTList = service.getWorktimeList(AttendpageDTO);
		model.addAttribute("list", attendWTList);
		model.addAttribute("page", AttendpageDTO);
		
		AttendDTO attendDTO = new AttendDTO();
		AttendWTDTO attendWTDTO = new AttendWTDTO();
		
		UserDto loginUser = (UserDto) req.getSession().getAttribute("loginUser");
		String userNo = loginUser.getUserNo();
		
		attendDTO.setUser_no(userNo);
		attendWTDTO.setUser_no(userNo);
		
		List<AttendDTO> ATList = service.getAllAttendINfo(attendDTO);
		List<AttendWTDTO> WTList = service.getAllAttendWTInfo(attendWTDTO);
		
		model.addAttribute("ATInfo", ATList);
		model.addAttribute("WTInfo", WTList);
		
		return "attend/attendstate";
	}
	
	@PostMapping("attendstatesearch")
	public String attendStateSearch(HttpServletRequest req)
	{
		AttendWTDTO attendWTDTO = new AttendWTDTO();
		
		UserDto loginUser = (UserDto) req.getSession().getAttribute("loginUser");
		String userNo = loginUser.getUserNo();
		
		attendWTDTO.setUser_no(userNo);
		
		
//		List<AttendWTDTO> WTList = service.searchAttendWTInfo(attendWTDTO);
		
		
		
		return "attend/attendstate";
	}
}
