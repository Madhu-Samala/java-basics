package com.qa.java.strings;

public class StringTest {

	public static void main(String[] args) {

		
		String str1 = new String();
		System.out.println(str1);
		String str2 = new String("abcd");
		System.out.println(str2);
		String str3 = new String("abcd");
		System.out.println(str3);
		System.out.println(str2 == str3);
		
		String str4;
		str4 = str2;
		System.out.println(str4 == str2);
		//char ch = 'a';//97 ASCII code
		
		System.out.println(str2.charAt(2));
		System.out.println(str2.compareTo("ABCD"));
		System.out.println(str2.compareToIgnoreCase("aBcD"));
		System.out.println(str2.concat("hello"));
		if(str2.equals(str3))
			System.out.println("true");
		
		System.out.println(str2.replace('a', 'A'));
		System.out.println(str2.length());
		String str5 = new String("Hello,How,Are,you");
		String[] strs = str5.split(",");
		for(String s : strs) {
			System.out.println(s);
		}
		
		String subString = str2.substring(2);
		System.out.println(subString);
		
		char[] chs = str2.toCharArray();
		for(char ch : chs) {
			System.out.println(ch);
		}
		
		System.out.println(str2.toUpperCase());
		String username = new String("   abcd      ");
		if(username.trim().equals("abcd"))
			System.out.println("Login success");
		else
			System.out.println("invalid username");
		
		System.out.println(String.valueOf(true));
		int salary = 242323;
		System.out.println(String.valueOf(salary));
		
		String password = "abcd"; //String literal
		String password1 = "abcd"; //dupliate literal , no new object gets created
		System.out.println(password == password1);
		System.out.println(password.equals(password1));
		
		
	}

}
