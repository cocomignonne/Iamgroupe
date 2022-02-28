package com.kh.iag.attend.entity;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class AttendModDTO 
{
	private long attend_mod_num;
	private String user_no;
	private String req_date;
	private String mod_reason;
	private String attach_file;
	private String approve_state;
	private MultipartFile file;
}