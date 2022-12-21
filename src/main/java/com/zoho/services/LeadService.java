package com.zoho.services;

import java.util.List; 

import com.zoho.entities.Lead;

public interface LeadService {
 

void saveLeadInfo(Lead lead);

List<Lead> getAllLeads();

Lead findLeadById(long id);

void deleteOneId(long id);
 
}
