package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

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
