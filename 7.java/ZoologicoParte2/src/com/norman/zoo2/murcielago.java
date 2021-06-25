package com.norman.zoo2;

public class murcielago  extends mamifero{
	public void fly() {
		energylevel = energylevel - 50;
		System.out.println("el murcielago vuela");
		displayenergy();
	}
	
	public void eatHumans() {
		energylevel = energylevel + 25;
		System.out.println("AAAARRRGGGHH!!!!");
		displayenergy();
	}
	
	public void attackTown() {
		energylevel = energylevel - 100;
		System.out.println("KA-BOOM!");
		displayenergy();
	}

}
