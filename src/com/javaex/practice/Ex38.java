package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	//총급액을 입력하면 백원단위는 할인을 해주고 있습니다. 실제 지불금액을 출력하는 코드를 작성하세요
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t;
		
		System.out.print("전체금액을 입력해주세요 : ");
		t = sc.nextInt();
		
		System.out.println("실제지불금액은 " + (t/1000)*1000 + " 입니다.");
		
		
		sc.close();

	}

}
