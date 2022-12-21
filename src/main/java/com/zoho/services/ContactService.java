package com.zoho.services;

import java.util.List;

import com.zoho.entities.Contact;


public interface ContactService {


Contact findContactById(long id);

List<Contact> getAllContact();

void saveContactInformation(Contact contact);
 
}
