package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	//마일을 km로 변환하는 프로그램을 작성하세요.(1마일 = 1.609km 상수로 지정)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double d;
		final double m = 1.609;
		
		System.out.print("마일을 입력하세요 : ");
		d = sc.nextDouble();
		
		System.out.println( d + "마일은 " + d * m + "킬로미터 입니다.");
				
		
		sc.close();

	}

}
