package com.capg.lab4.Exercise1;

public class Main {

	public static void main(String[] args)
	{
		Account accForSmith = new Account();
		Account accForKathy = new Account();
		
		Person p = new Person();
		
		p.setName("smith");
		accForSmith.setAccHolder(p);
		accForSmith.setBalance(2000);
		
		p.setName("kathy");
		accForKathy.setAccHolder(p);
		accForKathy.setBalance(9000);
	
		accForSmith.deposit(2000);
		accForKathy.withdraw(6900);
		
		System.out.println(accForSmith.getBalance());
		System.out.println(accForKathy.getBalance());
		
		Account savingAccForSmith = new SavingAccount();
		Account currentAccForSmith = new CurrentAccount();
		
		System.out.print("Transaction for smith :");
		savingAccForSmith.withdraw(accForSmith.getBalance());
		currentAccForSmith.withdraw(2000);
		
		Account savingAccForKathy = new SavingAccount();
		Account currentAccForKathy = new CurrentAccount();
		
		System.out.print("Transaction for Kathy :");
		savingAccForKathy.withdraw(accForKathy.getBalance());
		currentAccForKathy.withdraw(2000);
	}

}
