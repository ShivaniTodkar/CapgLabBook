package com.capg.lab4.Exercise3;


public class Item {

	private int idNum;
	private String title;
	private int numCopies;
	
	public Item(int idNum, String title, int numCopies){
		this.idNum = idNum;
		this.title = title;
		this.numCopies = numCopies;
	}
	
	public int getIdNum() {
		return idNum;
	}
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getNumCopies() {
		return numCopies;
	}
	public void setNumCopies(int numCopies) {
		this.numCopies = numCopies;
	}
	public void checkIn() {
		numCopies = numCopies + 1;
	}
	
	public void checkOut() {
		numCopies = numCopies - 1;
	}
	
	@Override
	public String toString(){
		return "ID: " + idNum + " Title: " + title + " Number of Copies: " + numCopies;
	}
	
	public void print() {
		System.out.println("ID: " + idNum);
		System.out.println("Title: " + title);
		System.out.println("Number of copies: " + numCopies);
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		
		Item otherItem = (Item) obj;
		return idNum == otherItem.idNum && 
			   title == otherItem.title && 
			   numCopies == otherItem.numCopies;
	}
	
	public void addItem(int idNum, String str, int n) {
		setIdNum(idNum);
		setTitle(str);
		setNumCopies(n);
	}

	
}
