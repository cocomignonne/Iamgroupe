package com.kh.iag.attend.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.iag.attend.entity.AttendModDTO;
import com.kh.iag.attend.service.attendService;

@Controller
@RequestMapping("attend")
public class AttendManageController 
{
	@Autowired
	private attendService service;
	
	@GetMapping("/attendmanage")
	public String attendmanage(Model model) throws Exception 
	{
		List<AttendModDTO> atModList = service.getModList();
		model.addAttribute("atModList", atModList);
		
		return "attend/attendmanage";
	}
	
	@GetMapping("/approvemanageok")
	public String approvemanageok(AttendModDTO attendModDTO) throws Exception 
	{
		int result = service.approveManageOK(attendModDTO);
		
		return "redirect:/attend/attendmanage";
	}
	
	@GetMapping("/approvemanagenone")
	public String approvemanagenone(AttendModDTO attendModDTO) throws Exception 
	{
		int result = service.approveManageNone(attendModDTO);

		return "redirect:/attend/attendmanage";
	}
}