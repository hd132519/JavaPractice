package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1+1=?");
		
		String answer = scanner.nextLine();
		if(answer.equals("2")){
			System.out.println("정답입니다.^^");
		}else System.out.println("틀렸습니다.ㅠ");
		
		System.out.println("영택이 키는?");
		
		String answer2 = scanner.nextLine();
		if(answer2.equals("안알랴줌")){
			System.out.println("정답입니다.^^");
		}else System.out.println("틀렸습니다.ㅠ");
		
		System.out.println("제곤이 키는?");
		
		String answer3 = scanner.nextLine();
		if(answer3.equals("189")){
			System.out.println("정답입니다.^^");
		}else System.out.println("틀렸습니다.ㅠ");
	}

}
