package com.google.for1;

public class For_ex8 {

	public static void main(String[] args) {

		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			switch(i) {
			case 3:
				i=0; //i에 아무값을 넣어줘야 반복문을 벗어남
				break;
			case 12:
				break;
			}
		}
		System.out.println("종료");
	}

}
