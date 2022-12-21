package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entities.Contact;
import com.zoho.entities.Lead;
import com.zoho.services.ContactService;
import com.zoho.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	// http://localhost:8080/create
	@RequestMapping("/create")
	public String viewCreateLeadForm() {
		return "create_lead";
			
	}
	@RequestMapping(value = "/save" ,method=RequestMethod.POST)
	public String saveLeadInformation(@ModelAttribute ("lead") Lead lead ,ModelMap model) {
		leadService.saveLeadInfo(lead);
		model.addAttribute("lead", lead);
		model.addAttribute("msg", "lead Saved !!");
				return "lead_info";
		}
	
	@RequestMapping("/listleads")
	public String listLead(Model model){
		List<Lead> leads = leadService.getAllLeads();
		
		model.addAttribute("lead", leads);
		return "list_leads";
		
	}
	@RequestMapping("/leadinfo")
	public String leadInfo(@RequestParam("id") long id, Model model) {
		Lead lead = leadService.findLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
		}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam ("id") long id , Model model) {
		Lead lead = leadService.findLeadById(id);
		Contact contact = new Contact ();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		contactService.saveContactInformation(contact);
		
		leadService.deleteOneId(id);
		List<Contact> contact1 = contactService.getAllContact();
		model.addAttribute("contacts", contact1);
				return "list_contacts";
		
		
	}
}
