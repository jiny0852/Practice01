package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	//사용자로부터 구의 반지름을 입력받아 구의 부피를 계산하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double r;
		final double pi = 3.14;
		
		
		System.out.print("반지름 : ");
		r = sc.nextDouble();
		
		double result = (4/3.0)*pi*(r*r*r);
		System.out.println("구의 부피는 : " + result + " 입니다.");
		
		
		
		
		
		
		sc.close();

	}

}
