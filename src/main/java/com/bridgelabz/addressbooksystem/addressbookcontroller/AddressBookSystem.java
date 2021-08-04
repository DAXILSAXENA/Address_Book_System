package com.bridgelabz.addressbooksystem.addressbookcontroller;

import com.bridgelabz.addressbooksystem.addressbookmodel.PersonInfo;

public class AddressBookSystem {
	public static void main(String args[]) {
		System.out.println("Welcome to Address Book Program:");

		PersonInfo personInfo = new PersonInfo("DAXIL", "SAXENA", "RAJNAGAR EXTENSION", "GHAZIABAD", "UTTAR PRADESH",
				201017, "123456789", "abc@gmail.com");
		System.out.println(personInfo);
	}
}
