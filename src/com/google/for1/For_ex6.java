package com.google.for1;

import java.util.Scanner;

public class For_ex6 {

	public static void main(String[] args) {

		// 0분 0초....59분 59초
		// 분과 초를 입력
		// 지정한 시간 입력하면 종료
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("분을 입력하세요");
		int min = sc.nextInt();
		
		System.out.println("초를 입력하세요");
		int sec = sc.nextInt();
		
		for(int i=0; i<60; i++) {
			for(int j=0; j<60; j++ ) {
				System.out.println(i+ "분" + j + "초");
				if(min==i && sec==j) {
					 j=60;
					 i=60;
				}
			}// 안쪽 for
		}//바깥 for
		System.out.println("종료");
	}

}
