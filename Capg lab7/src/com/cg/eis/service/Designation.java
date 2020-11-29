package com.cg.eis.service;

public enum Designation {

	System_Associate("System Associate"),
	Programmer("Programmer"),
	Manager("Manager"),
	Clerk("Clerk");

	private String designation;
	
	private Designation(String designation) {
		this.designation=designation;
	}
	
	public String getDesignation() {
		return designation;
	}
}



