package org.dimigo.collection;

import java.util.*;

public class MelonChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Music> bal = new ArrayList<Music>();
		bal.add(new Music("내 첫사랑", "베리굿"));
		bal.add(new Music("또 다시 사랑", "임창정"));
		bal.add(new Music("부산에 가면", "박진영"));
		
		List<Music> dan = new ArrayList<Music>();
		dan.add(new Music("커피", "유재환,김예림"));
		dan.add(new Music("다 잘될거야", "쿨"));
		
		System.out.println("--<<멜론 Genre Star 차트>>--");
		System.out.println("[발라드]");
		printList(bal);
		System.out.println("[댄스]");
		printList(dan);
		
		System.out.println("--<<발라드 3위 곡 변경>>--");
		bal.set(2, new Music("지우고 지워도", "차수뭐시기"));
		System.out.println("[발라드]");
		printList(bal);
		System.out.println("[댄스]");
		printList(dan);

		System.out.println("--<<발라드 1위 곡 삭제>>--");
		bal.remove(0);
		System.out.println("[발라드]");
		printList(bal);
		System.out.println("[댄스]");
		printList(dan);
		
		System.out.println("--<<전체 리스트 삭제>>--");
		bal.clear();
		dan.clear();
		printList(bal);
		printList(dan);
	}
	
	public static void printList(List<Music> list){
		for(Music mu: list){
			System.out.println(mu.toString());
		}
	}
}


