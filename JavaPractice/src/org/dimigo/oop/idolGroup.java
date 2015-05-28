package org.dimigo.oop;

public class idolGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
		
		String[][] members = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "혜리", "소진", "민아"}
		};
		
		for(int i = 0; i < 3; i++){
			System.out.println("<<" + idolGroup[i] + " 멤버 >>");
			
			for(String val : members[i]){
				System.out.println(val);
			}
			System.out.println();
		}
	}

}
