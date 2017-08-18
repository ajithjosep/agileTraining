package com.jo.banking.agiltraining;

public class Palindrome {
	
public static void main(String[] args) {
	String a = "mala yalam";
	System.out.println(a+" is Palindrome:"+isPalindrome(a));
	
}


public static Boolean isPalindrome(String a) {
	StringBuffer b = new StringBuffer(a.replace(" ", ""));
	b.reverse();
	return b.toString().equals(a.replace(" ", ""));
	
}
}
