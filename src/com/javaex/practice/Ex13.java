package com.javaex.practice;

public class Ex13 {

	//다음중 결과값이 다른 것을 선택하고 이유를 설명해 보세요
	public static void main(String[] args) {
		
		System.out.println(13/5);                    //2
		System.out.println((double)13/5);            //2.6
		System.out.println(13/(double)5);            //
		System.out.println((double)13/(double)5);    //
		System.out.println(13.0/5);                  //2.6
		System.out.println(13/5.0);                  //2.6
		System.out.println((double)(13/5));          //2.6
		
		
		//첫번째것만 자료형이 정수형이라 정수인 2만 출력됨
		//나머지는 자료형이 실수라 2.6 출력
		

	} 

}
