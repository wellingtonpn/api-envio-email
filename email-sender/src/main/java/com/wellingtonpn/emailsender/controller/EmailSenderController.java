package com.wellingtonpn.emailsender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellingtonpn.emailsender.repository.EmailSenderRepository;

@RestController
@RequestMapping("/v1/emailSender")
public class EmailSenderController {
	
	@Autowired
	private EmailSenderRepository emailSenderRepository;
	
	
}
