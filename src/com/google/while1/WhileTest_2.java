package com.google.while1;

import java.util.Scanner;

public class WhileTest_2 {

	public static void main(String[] args) {

		// id,pw 맞을때까지 출력하는 문제
		// 로그인할건지? 종료할건지? 선택지를 줘야함
		// 1. 로그인 2. 종료
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		
		while(true) { //true니깐 무조건 실행
			System.out.println("id 입력");
			int yId = sc.nextInt();
			System.out.println("pw 입력");
			int yPw = sc.nextInt();
			
			if(yId==id && yPw==pw) {
				System.out.println("로그인 성공");
				break; //반복문 벗어나기
			}
		}
		 
	}

}
