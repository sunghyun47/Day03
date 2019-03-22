package com.google.for1;

import java.util.Scanner;

public class For_ex1 {

	public static void main(String[] args) {

		// 1부터 10까지의 합
		// 0+1+2+3+....+10
		
		/*
		int hap = 0; //hap에다가 결과값담음
		 * hap = hap + 1; // 0+1한거 hap에 담김 
		 * hap = hap + 2; 
		 * hap = hap + 3;
		 * hap = hap + n; //n씩 증가
		 */
		
		/*
		int hap = 0;
		for(int i=1; i<11; i++) {
			hap = hap + i;  // 누적함수
		}
		System.out.println(hap);
		*/
		
		
		
		// 원하는시간 입력 10 후 종료 scanner
		// 초시계
		// 0초~59초 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시간을 입력하세요");
		
		int sec = sc.nextInt(); // 
		for(int i=0; i<60; i++) {
			System.out.println(i);
			if(i == sec) {
				System.out.println("OK");
				i = 59; //60 넘어가므로 여기까지 실행됨
			}

		}
		
		
		
		
		
	}

}
