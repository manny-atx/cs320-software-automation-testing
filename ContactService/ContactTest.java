package com.grandstrandsystems.mobile.test;
import com.grandstrandsystems.mobile.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ContactTest {
	
	@Test
	void testContactIdExist() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact(null, "long id", "manny", "Patino", "9566451475", "123 st");
		});
			
	}

	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("12345678910", "long id", "manny", "Patino", "9566451475", "123 st");
		});
			
	}
	
	@Test
	void testNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456789", "namenamenamename", "manny", "Patino", "9566451475", "123 st");
		});
			
	}
	
	@Test
	void testNameExists() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456789", null, "manny", "Patino", "9566451475", "123 st");
		});
			
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456789", null, "mannymannymanny", "Patino", "9566451475", "123 st");
		});
			
	}
	
	@Test
	void testFirstNameExists() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456789", "123456789", null, "Patino", "9566451475", "123 st");
		});
			
	}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456789", null, "Manny", "PatinoPatinoPatino", "9566451475", "123 st");
		});
			
	}
	
	@Test
	void testLastNameExists() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456789", "123456789", "Manny", null, "9566451475", "123 st");
		});
			
	}
	
	@Test
	void testPhoneNumberLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456789", null, "Manny", "PatinoPatinoPatino", "95664514759566451475", "123 st");
		});
			
	}
	
	@Test
	void testPhoneNumberExists() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456789", "123456789", "Manny", "Patino", null, "123 st");
		});
			
	}
	
	@Test
	void testAddressLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456789", null, "Manny", "PatinoPatinoPatino", "9566451475", "12345678901234567890123456789012345678901234567890");
		});
			
	}
	
	@Test
	void testAddressExists() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456789", "123456789", "Manny", "Patino", "9566451475", null);
		});
			
	}

}
