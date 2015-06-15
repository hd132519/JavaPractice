package org.dimigo.oop;

public class FamilyMember {
	
	private static int memberCnt = 4;
	private String memberName;
	
	public FamilyMember(String memberName){
		this.memberName = memberName;
	}

	public String getMemberName() {
		return memberName;
	}

	public static void printMemberCnt(){
		System.out.println(memberCnt);
	}
	
}
