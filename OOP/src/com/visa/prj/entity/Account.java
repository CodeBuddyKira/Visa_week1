package com.visa.prj.entity;
/**
 * This is an entity class to represent 
 * account business data.
 * 
 * @author Amrendra
 * @version 1.0
 *
 */
public class Account {
	
	private double balance;
	/**
	 * method to credit amount into account.
	 * 
	 * @param amt amount to be credited
	 */
	public void deposit(double amt) { // deposit(Account this, double amt)
		this.balance += amt;									// this.deposit += amt;
	}
	/**
	 * gives the status of current balance.
	 * 
	 * @return current balance
	 */
	public double getBalance() {
		return this.balance;
	}
}
