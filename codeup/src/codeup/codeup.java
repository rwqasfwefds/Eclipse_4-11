package codeup;

import java.util.Scanner;

public class codeup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�ڵ�� 1295���� Ǯ��
//		1��° Ǯ��
		
//		Scanner scn = new Scanner(System.in);
////		�Է¹ޱ�
//		String strInput = scn.next();
////		��� ��� ����
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
		
//		2��° Ǯ��(�ƽ�Ű�ڵ�)
//		Scanner scn = new Scanner(System.in);
////	    �Է¹ޱ�
//		String strInput = scn.next();
////	    ��� ��� ����
//		String strResult = "";
//		
//		for(int i = 0; i < strInput.length(); i++) {
//			char cletter = strInput.charAt(i);
//			
////			�ƽ�Ű�ڵ忡���� �빮�� ����
//			if(cletter >= 65 && cletter <= 90) {
////				char�� ���ڸ� �����ָ� �ٷ� �ƽ�Ű�ڵ尡 ��
//				strResult += (char)(cletter + 32);
////				�ƽ�Ű�ڵ忡���� �ҹ��� ����
//			} else if(cletter >= 97 && cletter <= 122) {
//				strResult += (char)(cletter - 32);
//			} else {
//				strResult += cletter;
//			}
//		}
//		System.out.println(strResult);
		
//		�ڵ�� 1408���� Ǯ��
		Scanner scn = new Scanner(System.in);
//      �Է¹ޱ�
		String strInput = scn.next();
//      ��� ��� ����
		String strResult = "";
		String strResult2 = "";
		
		for(int i = 0; i < strInput.length(); i++) {
//			���ڿ����� �ѹ��ھ� �̾Ƴ��� �ݺ��� ����
			char cletter = strInput.charAt(i); //(int)A => (char)65 => A
			
			strResult += (char)(cletter + 2); //(int)A => (char)(65 + 2) => C
			strResult2 += (char)((cletter * 7) % 80 + 48);
		}
		
		System.out.println(strResult);
		System.out.println(strResult2);
		
	}

}
