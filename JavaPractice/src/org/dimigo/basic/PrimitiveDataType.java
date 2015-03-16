package org.dimigo.basic;

/*
<<첫번째 수행평가>>
내용 : 아이유 프로필 출력하기
작성일 : 2015.03.13
@author teacher
@version 1.0
*/
public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("<<아이유 프로필>>");
		
		String name = "아이유";
		boolean isGirl = true;
		int age = 23;
		double kee = 161.8;
		float weight = 44.3f;
		char bt = 'A';
		
		System.out.println("이름 : " + name);
		if(isGirl) System.out.println("성벌 : 여자");
		else System.out.println("성별 : 남자");
		System.out.println("나이 : " + age);
		System.out.println("키 : " + kee);
		System.out.println("몸무게 : " + weight);
		System.out.println("혈액형 : " + bt);

	}

}
