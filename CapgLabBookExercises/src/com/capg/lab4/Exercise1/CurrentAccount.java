package com.capg.lab4.Exercise1;

public class CurrentAccount extends Account{
	
public double overdraftLimt = 5000;
	
	@Override
	public void withdraw(double amountWithdraw) {
		
		
		if(amountWithdraw > overdraftLimt) {
			System.out.println("OverdraftLimit exceed for current Account");
		}



}}
