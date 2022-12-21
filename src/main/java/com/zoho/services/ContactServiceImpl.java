package com.zoho.services;

import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entities.Contact;

import com.zoho.repositories.ContactRepository;


@Service
public class ContactServiceImpl implements ContactService {

		@Autowired
		private ContactRepository contactRepo;

	@Override
	public List<Contact> getAllContact() {
	List<Contact> findAll = contactRepo.findAll();
			return findAll;
		}

		@Override
	public Contact findContactById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
		
	}
	@Override
	public void saveContactInformation(Contact contact) {
		Contact contact1 = contactRepo.save(contact);

		
	}

}
