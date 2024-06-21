package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {

	//직사각형의 둘레와 면적을 구하는 프로그램을 작성하세요.(가로 세로 변수 double형으로 작성)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double v, h;
		
		System.out.print("가로를 입력하세요 : ");
		v = sc.nextDouble();
		System.out.print("세로를 입력하세요 : ");
		h = sc.nextDouble();
		
		System.out.print("사각형의 넓이는 " + v * h + 
				         "\n사각형의 둘레는 " + (v + h) * 2 );
		
		
		sc.close();

	}

}
