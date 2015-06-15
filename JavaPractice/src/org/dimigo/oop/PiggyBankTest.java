package org.dimigo.oop;

public class PiggyBankTest {

	public static void main(String[] args) {
		
		FamilyMember F = new FamilyMember("아빠");
		FamilyMember M = new FamilyMember("엄마");
		FamilyMember Me = new FamilyMember("나");
		FamilyMember ND = new FamilyMember("남동생");
		
		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(F, 10000);
		PiggyBank.putMoney(M, 5000);
		PiggyBank.putMoney(Me, 2000);
		PiggyBank.putMoney(ND, 1000);
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(Me, 1000);
		PiggyBank.printBalance();
		
	}

}
