package com.InsideList.Object;

import java.util.ArrayList;
import java.util.List;

public class ListContainsTest {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<User>();
		userList.add(new User("Faiz", "Akram", "abcd@gg.com"));
		userList.add(new User("Nadim", "Khan", "abcd2@gg.com"));
		userList.add(new User("Ali", "Mirza", "abcd5@gg.com"));
		// create a custom object
		 User user1 = new User("Faiz", "Akram", "abcd@gg.com");
		System.out
				.println("The list contains user with name ani bha and email id: abcd@gg.com : "
						+ userList.contains(user1));
		User user2 = new User("aa", "bb", "aa@bb.com");
		System.out
				.println("The list contains user with name ani bha and email id: aa@bb.com : "
						+ userList.contains(user2));
		
		try {
			//Find Email Address
			int a = userList.indexOf(new User("abcd5@gg.com"));
			User usr = userList.get(a);
			System.out.println(usr);
			
		} catch (Exception e) {
			System.out.println("Data Found");
			
		}
	}

}
