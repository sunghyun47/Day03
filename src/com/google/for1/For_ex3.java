package com.google.for1;

import java.util.Scanner;

public class For_ex3 {

	public static void main(String[] args) {

		// id, pw
		// 마지막에 로그인성공,은행 방문하세요
		int id=1234;
		int pw=5678;
		String result = "은행 방문";

		Scanner sc = new Scanner(System.in);

		for(int i=0; i<5; i++) {

			System.out.println("id 입력");
			int yid = sc.nextInt();

			System.out.println("pw 입력");
			int ypw = sc.nextInt();

			if(id == yid && pw == ypw); { // 맞는지 비교
				result = "로그인 성공";
				break;
			} //로그인 실패하면 맨위로

		}
		System.out.println(result);

		// 1. 계좌조회
		// 2. 계좌이체
		// 3. 대출
		System.out.println("1. 계좌조회");
		System.out.println("2. 계좌이체");
		System.out.println("3. 대출");

		int select = sc.nextInt();

		switch(select) {
		case 1:
			System.out.println("계좌조회 중");
			break;
		case 2:
			System.out.println("계좌이체 중");
		default:
			System.out.println("대출 중");
		}
	}

}
