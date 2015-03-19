package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pay = 1700000;
		int saram = 3;
		int jumpo = 1500;
		
		System.out.println("<<디미베네 연간 인건비>>");
		
		System.out.println("월 평균 급여 : " + String.format("%,d",pay) + "원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d",saram) + "명");
		System.out.println("점포 수 : " + String.format("%,d",jumpo) + "개");
		System.out.println("연간 인건비 : " + String.format("%,d",(long)pay*saram*jumpo*12) + "원");
		
	}

}
