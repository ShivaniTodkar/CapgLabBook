package com.cg.eis.service;

public enum InsuranceScheme {

	Scheme_A("Scheme A"),
	Scheme_B("Scheme B"),
	Scheme_C("Scheme C"),
	No_Scheme("No Scheme");

	private String scheme;
	
	private InsuranceScheme(String scheme) {
		this.scheme=scheme;
	}
	
	public String getScheme() {
		return scheme;
	}
	
}
