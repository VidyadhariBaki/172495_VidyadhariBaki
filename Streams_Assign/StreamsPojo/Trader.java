package com.cg.streams;

public class Trader {
	String Name;
	String city;

	public Trader(String name, String city) {
		super();
		Name = name;
		this.city = city;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Trader [Name=" + Name + ", city=" + city + "]";
	}

}
