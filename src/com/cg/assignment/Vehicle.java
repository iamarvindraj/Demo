package com.cg.assignment;

public class Vehicle {
	String vehiclename;
	int regno, milage;
	double price;
	
	public Vehicle(String vehiclename, int regno,int milage, double price) {
		this.vehiclename = vehiclename;
		this.regno = regno;
		this.price = price;
		this.milage = milage;
	}

	public String getVehiclename() {
		return vehiclename;
	}

	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
