package com.grandstrandsystems.mobile;

import java.util.ArrayList;

public class ContactService {
	private final String FIRST_NAME = "firstName";
	private final String LAST_NAME = "lastName";
	private final String PHONE_NUMBER = "phoneNumber";
	private final String ADDRESS = "address";
	private ArrayList<Contact> contacts = new ArrayList<>();
	private ArrayList<String> updatableAttributes = new ArrayList<>();
	
	// Default Constructor
	public ContactService() {
		initializeUpdatables();
	}
	
	// add contacts with a unique ID
	public void addContact(Contact contact) {
		// Iterate through existing contacts
		for (Contact c: this.contacts) {
			// match on same contractID and raise exception
			if (contact.getContactId().equals(c.getContactId())) {
				throw new IllegalArgumentException("Duplicate Contact ID Found: " + c.getContactId());
			}
		}
		// no contact found, add to contacts
		this.contacts.add(contact);
	}
	
	// delete contacts per contact ID
	public void deleteContact(String contactId) {
		// Iterate through existing contacts
		for (Contact c: this.contacts) {
			// match on same contractID and delete if found
			// return when done
			if (c.getContactId().equals(contactId)) {
				this.contacts.remove(c);
				System.out.println("Successfully removed contactId: " + contactId);
				return;
			}
		}
		System.out.println("No matching contactId to remove");
	}
	
	// update contact fields per contact ID
	public void updateContact(String contactId, String field, String updateField) {
		if (!this.updatableAttributes.contains(field)) {
			throw new IllegalArgumentException(field + " is not an updatable field.");
		}
		for (Contact c: this.contacts) {
			if (c.getContactId().equals(contactId)) {
				if (this.updatableAttributes.contains(field)) {
					if (field.equals(FIRST_NAME)) {
						c.setFirstName(updateField);
					}
					if (field.equals(LAST_NAME)) {
						c.setLastName(updateField);
					}
					if (field.equals(PHONE_NUMBER)) {
						c.setPhoneNumber(updateField);
					}
					if (field.equals(ADDRESS)) {
						c.setAddress(updateField);
					}
				}
			}

			else {
				System.out.println("No matching contact to update with ID: " + c.getContactId());
			}
		}
		
	}
	
	// initialize updateable fields
	private void initializeUpdatables() {
	// Only firstName, lastName, Number, Address are updatable
		this.updatableAttributes.add(FIRST_NAME);
		this.updatableAttributes.add(LAST_NAME);
		this.updatableAttributes.add(PHONE_NUMBER);
		this.updatableAttributes.add(ADDRESS);
	}
	
}
