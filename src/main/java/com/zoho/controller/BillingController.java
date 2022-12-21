package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entities.Billing;
import com.zoho.entities.Contact;
import com.zoho.services.BillingService;
import com.zoho.services.ContactService;

@Controller
public class BillingController {
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/billingForm")
	public String viewBillingForm(@RequestParam ("contactId") long id ,Model model) {
		Contact contact = contactService.findContactById(id);
		model.addAttribute("contact", contact);
		return "create_bill";
		
	}
	@RequestMapping("/generateBill")
	public String generateBill(@ModelAttribute ("billing") Billing billing ,@RequestParam ("amount") long amount, Model model) {
		billingService.generateInvoice(billing);
		long gst = calculateGST(amount);
		model.addAttribute("gst", gst);
		model.addAttribute("billed", billing);
		return "list_bills";
		}
	@RequestMapping("/billsGenerated")
	public String listBillsGenerated(Model model) {
		List<Billing> list = billingService.listGeneratedBills();
		model.addAttribute("list", list);
		return "list_allBills";
	
	}
	
	public long calculateGST(long amount) {
		long total =(amount*18)/100;
		return total;
		
	}
}
