package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9, a1 = 9;
		int b = 10;
		double h = 5.8, h1 = 5.4;
		double s = (double)((a+b)*h/2),p = (double)a1*h1; 
		
		System.out.println("<<도형 넓이 비교>>");
		System.out.println("사다리꼴 넓이 : " + s);
		System.out.println("평행사변형 넓이 : " + p);
		
		if(s > p) System.out.println("사다리꼴이 평행사변형 보다 " + (s-p) +" 더 큽니다.");
		else if(s == p) System.out.println("평행사변형이 사다리꼴 보다 " + (p-s) +" 더 큽니다.");
		else System.out.println("두 도형의 넓이가 같습니다.");
		
	}

}
