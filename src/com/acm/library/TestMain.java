package com.acm.library;

import java.security.NoSuchAlgorithmException;

import com.acm.library.service.PasswordHash;

public class TestMain {
	public static void main(String[] args) throws NoSuchAlgorithmException {

		String myPassword = "GoodStrongPassword!1234";
		String hashedPassword = PasswordHash.hashPassword(myPassword);

		Boolean testPass = PasswordHash.checkPassword(myPassword, "string");

		System.out.println(hashedPassword);
		System.out.println(testPass);
	}
}
