package edu.nvcc.bank;

public class Account {

	private double balance;
	private String name;
	private int acNum;
	private static int count=0;
	
	
	
	
	public Account(double balance, String name, int acNum) {
		super();
		this.balance = balance;
		this.name = name;
		this.acNum = acNum;
		count++;
		
		
		
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAcNum() {
		return acNum;
	}
	public void setAcNum(int acNum) {
		this.acNum = acNum;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Account.count = count;
	}
	
	
	public String toString() {
		return "Account [balance=" + balance + ", name=" + name + ", acNum="
				+ acNum + "]";
	}
	
	
	
		
}
