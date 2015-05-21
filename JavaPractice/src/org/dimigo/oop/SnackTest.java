package org.dimigo.oop;

public class SnackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Snack[] snack = new Snack[]{
				new Snack("새우깡", "농심",1100,2),
				new Snack("콘칲", "크라운",1200,1),
				new Snack("허니버터칩", "해태",1500,4)
				};
		 int Price = 0;
		 
		 for(Snack val : snack){
			 val.printSnack();
		 }
		 
		 for(Snack val : snack){
			Price += val.calcPrice();
		 }
		 
		 System.out.println("총 가격 : " + Price);
	}

}
