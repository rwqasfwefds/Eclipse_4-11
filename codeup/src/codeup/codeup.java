package codeup;

import java.util.Scanner;

public class codeup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		코드업 1295문제 풀이
//		1번째 풀이
		
//		Scanner scn = new Scanner(System.in);
////		입력받기
//		String strInput = scn.next();
////		결과 출력 변수
//		String strResult = "";
//		
//		for(int i = 0; i < strInput.length(); i++) {
//			String cletter = strInput.charAt(i) + "";
//			
//			if(cletter.equals(cletter.toLowerCase()) == true) {
//				strResult += cletter.toUpperCase();
//			} else if(cletter.equals(cletter.toUpperCase()) == true) {
//				strResult += cletter.toLowerCase();
//			} else {
//				strResult += cletter;
//			}
//		}
//		System.out.println(strResult);
		
//		2번째 풀이(아스키코드)
//		Scanner scn = new Scanner(System.in);
////	    입력받기
//		String strInput = scn.next();
////	    결과 출력 변수
//		String strResult = "";
//		
//		for(int i = 0; i < strInput.length(); i++) {
//			char cletter = strInput.charAt(i);
//			
////			아스키코드에서의 대문자 범위
//			if(cletter >= 65 && cletter <= 90) {
////				char은 숫자를 더해주면 바로 아스키코드가 됨
//				strResult += (char)(cletter + 32);
////				아스키코드에서의 소문자 범위
//			} else if(cletter >= 97 && cletter <= 122) {
//				strResult += (char)(cletter - 32);
//			} else {
//				strResult += cletter;
//			}
//		}
//		System.out.println(strResult);
		
//		코드업 1408문제 풀이
		Scanner scn = new Scanner(System.in);
//      입력받기
		String strInput = scn.next();
//      결과 출력 변수
		String strResult = "";
		String strResult2 = "";
		
		for(int i = 0; i < strInput.length(); i++) {
//			문자열에서 한문자씩 뽑아내서 반복문 수행
			char cletter = strInput.charAt(i); //(int)A => (char)65 => A
			
			strResult += (char)(cletter + 2); //(int)A => (char)(65 + 2) => C
			strResult2 += (char)((cletter * 7) % 80 + 48);
		}
		
		System.out.println(strResult);
		System.out.println(strResult2);
		
	}

}
