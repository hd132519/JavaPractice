package org.dimigo.oop;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car = new Car2("현대자동차","제네시스","검정색", 225, 50000000);
		Car2 car2 = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		Car2 car3 = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		
		/*
		car.setCompany("현대자동차");
		car.setModel("제네시스");
		car.setColor("검정색");
		car.setMaxSpeed(225);
		car.setPrice(50000000);
		
		car2.setCompany("기아자동차");
		car2.setModel("K7");
		car2.setColor("흰색");
		car2.setMaxSpeed(246);
		car2.setPrice(40000000);
		
		car3.setCompany("삼성자동차");
		car3.setModel("SM7");
		car3.setColor("회색");
		car3.setMaxSpeed(200);
		car3.setPrice(38000000);
		*/
		
		
		
		System.out.println("<<자동차 목록>>");
		System.out.printf("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도 : %dkm\n가격 : %,d원\n",
				car.getCompany(),car.getModel(), car.getColor(), car.getMaxSpeed(), car.getPrice());
		System.out.printf("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도 : %dkm\n가격 : %,d원\n",
				car2.getCompany(),car2.getModel(), car2.getColor(), car2.getMaxSpeed(), car2.getPrice());
		System.out.printf("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도 : %dkm\n가격 : %,d원\n",
				car3.getCompany(),car3.getModel(), car3.getColor(), car3.getMaxSpeed(), car3.getPrice());
	}

}
