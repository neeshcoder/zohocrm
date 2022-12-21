package com.zoho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zoho.entities.Lead;
import com.zoho.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

		@Autowired
		private LeadRepository leadRepo;
		
	@Override
	public void saveLeadInfo(Lead lead) {
		Lead lead2 = leadRepo.save(lead);

	}

	@Override
	public List<Lead> getAllLeads() {
	List<Lead> findAll = leadRepo.findAll();
			return findAll;
		}

	@Override
	public Lead findLeadById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
		
	}

	@Override
	public void deleteOneId(long id) {
		leadRepo.deleteById(id);
		
	}

}
