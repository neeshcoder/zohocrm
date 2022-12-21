package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zoho.entities.Contact;
import com.zoho.services.ContactService;
@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/contactInfo")
	public String listContacts(Model model) {
		List<Contact> contact = contactService.getAllContact();
		model.addAttribute("contacts", contact);
				return "list_contacts";
		
	}
}
