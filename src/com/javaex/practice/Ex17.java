package com.javaex.practice;

public class Ex17 {

	//다음 코드의 오류가 나는 부분을 찾은 후 이유를 작성하세요.
	//(코드를 작성해서 오류가 없도록 변경해 보세요.)
	public static void main(String[] args) {
		/*
		int x, y
		
		x = 10
		y = 20
		
		sum = x + y
		
		System.out.println("합은 ' + sum);
		*/
		
		int x, y; //문장 마무리
		
		x = 10; //;문장 마무리
		y = 20; //;문장 마무리
		
		int sum = x + y; //sum 변수 선언, ;문장 마무리
		
		System.out.println("합은 " + sum); //' -->" 변경
		
		

	}

}
