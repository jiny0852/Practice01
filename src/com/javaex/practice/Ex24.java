package com.javaex.practice;

public class Ex24 {

	/*
	다음의 코드는 화씨 온도를 섭씨 온도로 변환하는 프로그램이다.
	결과값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하세요.
	⚫ *[참고] ℃ : 섭씨 기호 ℉ : 화씨 기호
	화씨→섭씨 ℃ = 5/9 * (℉ - 32) 섭씨→화씨 ℉ = (℃ * 9/5) + 32
	*/
	public static void main(String[] args) {
		
		//결과값의 자료형을 지정해주지 않아서..?
		//
		double f = 80.0;
		double c = 5/9*(f-32.0);
		
		System.out.println(c);
		
		
이거 왜이래
	}

}
