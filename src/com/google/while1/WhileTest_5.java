package com.google.while1;

import java.util.Scanner;

public class WhileTest_5 {

	public static void main(String[] args) {

		// ------ 로그인 처리 ------
		// 1. 로그인 2. 종료

		// ------ 게임 진행 ------ 
		// 레벨 : 1
		// 골드 : 0
		// 몬스터 경험치 모두 동일
		// 1->2 : 3마리 잡아야됨
		// 2->3 : 6마리 잡아야됨
		// 3->4 : 9마리 잡아야됨
		// 4->5 : 12마리 잡아야됨
		// 14->15 : 42마리 잡아야됨

		// 5 달성시 : 1000골드 지급 
		// 10 달성시 : 2000골드 지급
		// 15 달성시 : 3000골드 지급

		// 최종출력 : 레벨?, 현재 골드?

		Scanner sc = new Scanner(System.in);

		//로그인 파트
		int id = 1234;
		int pw = 5678; // 맞으면 종료 아니면 1.2 출력
		boolean check = true; // while문 돌리기 위한 조건
		int level = 0; //레벨 담을 변수
		int gold = 0; // 골드 담을 변수
		int mon = 3; // 몬스터수
		//레벨이 증가될때마다 3씩 증가

		// 반복 2번 누를때 까지 반복
		while(check) {
			System.out.println("1. 로그인");
			System.out.println("2. 종료");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("id를 입력");
				int yid = sc.nextInt();
				System.out.println("pw를 입력");
				int ypw = sc.nextInt();

				if(yid==id && ypw==pw) {
					System.out.println("로그인 성공");
					// break; //사용해도됨
					check=!check; //끝내는 방법
				}else {
					System.out.println("로그인 실패");
				}

			}else {
				break; //else 일때 while문 벗어나는법 -> break, 위에 check false변경
			}
		}// while end
		
		//게임파트 진행
		//check false ->로그인 성공 / true -> 로그인 실패
		if(!check) { //check==false
			for(level = 1; level<15; level++) { //레벨 증가되는 부분
				if(level==5 || level==10) { //레벨이 5랑 같거나, 10일때
					gold=gold+level/5*1000;
					System.out.println(level/5*1000+ " 골드 지급");
				}
				
				for(int i=1; i<=level*3; i++) {//사냥해야되는 부분, i는 몬스터숫자
				System.out.println(i+ "번째 사냥 성공");
				}
				System.out.println("축 레벨업!! " + (level+1));
			}
			gold = gold + 3000;
			System.out.println("현재 레벨 :" + level);
			System.out.println("골드 : " + gold);
		}

		System.out.println("프로그램 종료");




	}

}
