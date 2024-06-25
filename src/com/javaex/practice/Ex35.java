package com.javaex.practice;

public class Ex35 {

	//long형 변수를 사용하여 빛이 1년동안 진행하는 거리를 계산하여 출력하세요.
	//(단 빛의 속도는 300000 km/s 로 계산한다)
	public static void main(String[] args) {
		
		long d;
		long s = 300000L;
		
		d = 365 * 24 * 60 * 60* s; //일 시 분
		
		System.out.println("빛이 1년 동안 가는 거리는  " + d + "  km 입니다.");

	}

}
