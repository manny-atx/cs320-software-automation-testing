package com.grandstrandsystems.mobile.test;
import com.grandstrandsystems.mobile.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ContactServiceTest {

	@Test
	void testAddDuplicateId() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			ContactService cs = new ContactService();
			Contact contact1 = new Contact("123456789", "long id", "manny", "Patino", "9566451475", "123 st");
			Contact contact2 = new Contact("123456789", "long id", "manny", "Patino", "9566451475", "123 st");
			cs.addContact(contact1);
			cs.addContact(contact2);
		});
	}

	
	@Test
	void testDeleteExistingContact() {
			ContactService cs = new ContactService();
			Contact contact1 = new Contact("123456789", "long id", "manny", "Patino", "9566451475", "123 st");
			Contact contact2 = new Contact("123456788", "long id", "manny", "Patino", "9566451475", "123 st");
			cs.addContact(contact1);
			cs.addContact(contact2);
			cs.deleteContact(contact1.getContactId());
	}
	
	@Test
	void testDeleteNonExistingContact() {
			ContactService cs = new ContactService();
			Contact contact1 = new Contact("123456789", "long id", "manny", "Patino", "9566451475", "123 st");
			Contact contact2 = new Contact("123456788", "long id", "manny", "Patino", "9566451475", "123 st");
			cs.addContact(contact1);
			cs.addContact(contact2);
			cs.deleteContact("123456786");
	}
	
	@Test
	void testUpdateContactId() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			ContactService cs = new ContactService();
			Contact contact1 = new Contact("123456789", "long id", "manny", "Patino", "9566451475", "123 st");
			cs.updateContact(contact1.getContactId(), "contactId", null);
		});
	}
}
