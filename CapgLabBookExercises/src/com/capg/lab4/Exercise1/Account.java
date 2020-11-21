package com.capg.lab4.Exercise1;

public class Account 
{

	private long accNum;
	private double balance;
	private Person accHolder;
	
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double amountDeposit) {
		
		double finalDepositAmount = getBalance() + amountDeposit;
		setBalance(finalDepositAmount);
		
	}
	
	public void withdraw(double amountWithdraw) {
		
		double finalAmount = getBalance() - amountWithdraw;
		setBalance(finalAmount);

	}
	
	public double getTotalBalance() {
		
		
		return 0;
	}

}
