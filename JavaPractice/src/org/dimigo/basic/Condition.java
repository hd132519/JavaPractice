package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dis = 10;
		String car = "고속버스";
		int fee;
		
		switch(car){
		case "고속버스":
			fee = 850;
			fee += (dis - 1) / 10 * 300;
			break;
		case "경차":
			fee = 300;
			fee += (dis - 1) / 10 * 200;
			break;
		default:
			car = "그 외";
			fee = 600;
			fee += (dis - 1) / 10 * 200;
		}
		
		System.out.println("거리 : " + dis + "km");
		System.out.println("차량 : " + car);
		System.out.println("통행료 : " + fee + "원");

	}

}

