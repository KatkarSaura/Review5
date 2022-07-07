package com.bridgelabz;

import java.util.ArrayList;

public class AddressBookFileIO {
	public String name,lastname,address,number;
	
	public void Contact(String name,String lastname,String address) {
		this.name = name;
		this.lastname = lastname;
		this.address = address;
		this.number = number;
	}
	public boolean equals(Contact c) {
		if(name.equals(c.name) && lastname.equals(c.lastname) && address.equals(c.address) && number.equals(c.number))
			return true;
		return false;
	}
	public String toString() {
		return name+","+lastname+","address","+"+number+",";"
	}
}
public class ContactDriver {
	public ArrayList<Contact> contacts = new ArrayList<Contact>();
		
	}

}
