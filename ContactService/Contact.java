package com.grandstrandsystems.mobile;

import java.util.ArrayList;

public class Contact {
	private final Integer DEFAULT_LENGTH = 10;
	private final Integer ADDRESS_LENGTH = 30;
	private final String contactId;
	private final String name;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	public ArrayList<String> required = new ArrayList<>();


	public Contact(String contactId, String name, String firstName, String lastName, String phoneNumber, String address) {
		this.contactId = contactId;
		this.name = name;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		validateRequired();
	}

	private boolean validateLength(String name, Integer length) {
		if (name == null) {
			throw new IllegalArgumentException(this.name + " can't be empty");
		}
		if (name.length() > length) {
			throw new IllegalArgumentException(this.name + " too long.");
		}
		return true;
	}
	
	private void initializeRequired() {
		this.required.add(this.contactId);
		this.required.add(this.name);
		this.required.add(this.firstName);
		this.required.add(this.lastName);
		this.required.add(this.phoneNumber);

	}

	 private void validateRequired() {
		initializeRequired();
		for (String info: this.required) {
			validateLength(info, this.DEFAULT_LENGTH);
		}
		validateLength(this.address, this.ADDRESS_LENGTH);
	}
	 
	public String getContactId() {
		return this.contactId;
	}
	
	
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public void setLastName(String name) {
		this.lastName = name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
