package com.google.for1;

import java.util.Scanner;

public class For_ex7 {

	public static void main(String[] args) {

		//게임
		//FPS
		//1탄창 30발
		//3탄창

		//1.단발 --탕
		//2.점사 --타타탕

		Scanner sc = new Scanner(System.in);

		for(int i = 0; i<3; i++) {

			int count = 10;
			String sound = "타타탕";

			System.out.println("1번이면 단발");
			System.out.println("2번이면 점사");
			int select = sc.nextInt();
			if(select==1) {
				count=30;
				sound="탕";
			}else {

			}

			for(int j=0; j<count; j++) {
				System.out.println(j+1+sound);
			}
		}
	}
}
