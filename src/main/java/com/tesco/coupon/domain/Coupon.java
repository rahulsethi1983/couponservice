package com.tesco.coupon.domain;

public class Coupon {

	private String id;
	private double amount;
	private double balance;
	private String ownerId;
	
	public Coupon() {
		super();
	}
	public Coupon(String id, double amount, double balance, String ownerId) {
		super();
		this.id = id;
		this.amount = amount;
		this.balance = balance;
		this.ownerId = ownerId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
}
