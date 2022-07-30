package com.cab.management.helper;

import org.springframework.beans.factory.annotation.Autowired;

import com.cab.management.helper.impl.BookPreferingName;
import com.cab.management.helper.impl.BookPreferingTrip;

public class BookFactory {
	
	@Autowired
	static BookPreferingName impl;
	
	
	
	public static IBookCab getBookImplementation(String name) {
		switch (name) {
		case "byName":
			return impl;
		case "byTrip":
			return new BookPreferingTrip();
		default:
			return null;
		}
	}

}
