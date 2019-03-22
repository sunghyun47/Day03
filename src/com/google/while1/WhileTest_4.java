package com.google.while1;

import java.util.Scanner;

public class WhileTest_4 {

	public static void main(String[] args) {

		// 메뉴선택:1 -> 불고기버거 선택하셨습니다.
		// 수량은? 3  -> 3개 주문하셨습니다 (계산처리됨)
		// 주문정보는 계속 저장됨
		// 1 입력시 메뉴화면 반복실행
		// 0 입력시 메뉴화면 종료, 화면에 주문한 정보 가격 출력됨

		Scanner sc = new Scanner(System.in);

		int bBuger=0; //수량, 주문한 총가격
		int cBuger=0; //수량, 주문한 총가격
		int potato=0; //수량, 주문한 총가격
		int salad=0; //수량, 주문한 총가격
		int count=0; // 각 수량
		int total=0; // 총 합계담을 변수
		
		boolean check = true; // while(반복문)의 조건
		while(check) {
			System.out.println("햄버거 ************");
			System.out.println("1. 불고기버거 3500원");
			System.out.println("2. 치킨버거 3200원");
			System.out.println("추가 ************");
			System.out.println("4. 감자튀김 1000원");
			System.out.println("5. 샐러드 2000원");
			int select = sc.nextInt();

			System.out.println("수량 입력");
			count=sc.nextInt();

			switch(select) {
			case 1: // 불고기버거 선택
				bBuger=bBuger+count*3500; //메뉴 더해야지 기존가격 안사라짐
				break; 
			case 2: // 치킨버거 선택
				cBuger=cBuger+count*3200; //메뉴 더해야지 기존가격 안사라짐
				break;
			case 3: // 감자튀김 선택
				potato=potato+count*1000; //메뉴 더해야지 기존가격 안사라짐
				break;
			case 4: // 샐러드 선택
				salad=salad+count*2000; //메뉴 더해야지 기존가격 안사라짐
				break;
			}
			//추가주문할거냐 안할거냐
			System.out.println("추가주문 1, 아니면 0"); //0이면 이 반복문 종료
			select = sc.nextInt();
			if(select==0) {
				break; // break쓰거나 위에 check를 false로 바꿔줌
			}
		}
		total = bBuger+cBuger+potato+salad; // 최종가격
		
		if(bBuger>0) {
			int p = bBuger/3500; //수량 구하기
			System.out.println("불고기버거 : " + p+ "개 -- 가격 :"+ bBuger);
		}
		if(cBuger>0) {
			int p = cBuger/3200;
			System.out.println("치킨버거 : " + p+ "개 -- 가격 :" + cBuger);
		}
		if(potato>0) {
			int p = potato/1000;
			System.out.println("감자튀김 : " + p+ "개 -- 가격 :" + potato);
		}
		if(salad>0) {
			int p = salad/2000;
			System.out.println("샐러드 : " + p+ "개 -- 가격 :" + salad);
		}
		
		System.out.println("총 가격 : " + total);
		// 총 금액 / 개당단가 = 수량
		


	}

}
