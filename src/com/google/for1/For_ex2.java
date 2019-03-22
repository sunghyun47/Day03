package com.google.for1;

public class For_ex2 {

	public static void main(String[] args) {

		for(int i=0; i<10; i++) {
			if(i%2 == 0) {
				continue; //1가 0일때 컨티뉴만남
			}
			System.out.println(i);
		}
		
		int count = 5;
		for(int i=0; i<10; i++) {
			if(i==count) {
				break; //4까지 출력하고 벗어남
			}
			System.out.println(i);
		}
		
	}

}
