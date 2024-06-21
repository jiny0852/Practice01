package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	//사용자로부터 가로 세로 값을 입력받아 삼각형의 넓이를 구하는 프로그램을 작성하세요
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double v, h;
		
		System.out.print("가로 : ");
		v = sc.nextDouble();
		System.out.print("세로 : ");
		h = sc.nextDouble();
		
		System.out.println("삼각형의 넓이는 " + (v * h)/2 + " 입니다.");
				
		
		
		sc.close();

	}

}
