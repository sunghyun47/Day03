package com.google.while1;

import java.util.Scanner;

public class WhileTest_3 {

	public static void main(String[] args) {

		//do while문(2번 예제 while문이랑 비슷)

		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		boolean check = false;

		do  { //true니깐 무조건 실행
			System.out.println("id 입력");
			int yId = sc.nextInt();
			System.out.println("pw 입력");
			int yPw = sc.nextInt();

			if(yId==id && yPw==pw) {
				System.out.println("로그인 성공");
				break; //반복문 벗어나기
			}
		} while(check); 
	}

}
