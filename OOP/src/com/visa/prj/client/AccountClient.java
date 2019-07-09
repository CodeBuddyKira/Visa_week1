package com.visa.prj.client;

import com.visa.prj.entity.Account;

public class AccountClient {

	public static void main(String[] args) {
		Account first = new Account();
		Account second = new Account();

		first.deposit(5000); //deposit(first,5000)
		second.deposit(5000);//deposit(second, 5000)
		
		System.out.println("first account");
		System.out.println("Balance: " + first.getBalance());
		
		System.out.println("Second account");
		System.out.println("Balance: " + second.getBalance());
		
	}

}
