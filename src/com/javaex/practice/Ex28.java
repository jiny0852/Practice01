package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {

	//원화를 달러화로 계산하는 프로그램을 작성하세요.(환율 1달러 = 1230.95원 상수로 지정)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double w; //원화
		final double c = 1230.95; //환율
		
		
		System.out.print("환전할 원화를 입력하세요 : ");
		w = sc.nextDouble();
		
		System.out.println("받으실 달러는 " + w/c);
		
		sc.close();

	}

}
