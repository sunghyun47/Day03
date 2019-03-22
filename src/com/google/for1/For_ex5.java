package com.google.for1;

public class For_ex5 {

	public static void main(String[] args) {

		//3~4단만 구구단 출력
		
		for(int i=3; i<5; i++) {
			for(int j=1; i<10; j++) {
				System.out.print(i+" * "+ j + " = " + i*j+"\t");
			}
			System.out.println("");
		}
		
		/*
		int dan = 3;
		int dan1 = 4;
		for(int i=1; i<10; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		*/
	}

}
