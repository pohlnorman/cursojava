package com.java.telefono;

public class PhoneTest {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 90, "Entel", "Ring Ring");
		IPhone i10 = new IPhone("10", 95, "movistar", "Riiiiing");
		
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		i10.displayInfo();
		System.out.println(i10.ring());
		System.out.println(i10.unlock());

	}

}
