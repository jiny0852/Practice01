package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	//상품을 구매하면 정가의 10%를 부가세로 부여한다. 아래와 같이 출력되도록 프로그램을 작성하세요
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double goodsPrice;
		double givenMoney;
		double tax;
		double change;
		
		System.out.print("상품 가격 : ");
		goodsPrice = sc.nextDouble();
		System.out.print("받은 돈 : ");
		givenMoney = sc.nextDouble();
		
		System.out.println("================");
		
		System.out.println("받은 돈 : " + givenMoney +
				           "\n상품 가격 : " + goodsPrice +
				           "\n부가세 : " + goodsPrice * 0.1 +
				           "\n잔액 : " + (givenMoney - goodsPrice) );
		
		
		
		sc.close();

	}

}
