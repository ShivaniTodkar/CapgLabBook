package com.capg.lab4.Exercise1;

public class SavingAccount extends Account{

public final double minimumBalance = 100;
	
	@Override
	public void withdraw(double amountWithdraw) {
		
		
		if(amountWithdraw >= minimumBalance) {
			System.out.println("Allow withdraw");
		}else {
			System.out.println("Denied withdraw as this transaction exceeds minimum balance");
		}

	}


	
}
