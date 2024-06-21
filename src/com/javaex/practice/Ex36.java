package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c500, c100, c50, c10;
		
		System.out.print("500원의 개수 : ");
		c500 = sc.nextInt();
		System.out.print("100원의 개수 : ");
		c100 = sc.nextInt();
		System.out.print("50원의 개수 : ");
		c50 = sc.nextInt();
		System.out.print("10원의 개수 : ");
		c10 = sc.nextInt();
		
		int r = (c500*500) + (c100*100) + (c50*50) + (c10*10);
		
		System.out.println("동전의 총합은 " + r + " 원 입니다.");
		
		
		
		
		
		sc.close();

	}

}
