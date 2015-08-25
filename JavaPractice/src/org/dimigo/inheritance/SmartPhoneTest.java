package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone iph = new IPhone("iPhone 6", "Apple", 700000);
		Galaxy gal = new Galaxy("Galaxy S6 Edge", "Samsung", 650000);
		
		System.out.println(iph);
		iph.turnOn();
		iph.useSpecialFunction();
		iph.pay();
		iph.turnOff();
		
		System.out.println(gal);
		gal.turnOn();
		gal.useSpecialFunction();
		gal.pay();
		gal.turnOff();
		
	}

}
