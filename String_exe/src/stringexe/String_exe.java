package stringexe;

import java.util.Arrays;

public class String_exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		자바 String 유용한 메소드 정리

//		1. substring : 문자열 자르기
//		substring(int start) : start부터 끝까지 문자열을 자름
//		substring(int start, int end) : start부터 end 앞까지 문자열을 자름
//		return값 : 잘린 문자열
//		
//		String tmp_str = "abcdefgh";
//		String sub1 = tmp_str.substring(5);
//		String sub2 = tmp_str.substring(1, 4);
//		
//		System.out.println("sub1 = " + sub1);
//		System.out.println("sub2 = " + sub2);

//		2. length : 문자열의 길이 구하기
//		사용법 : length()
//		return값 : 정수, 문자열 길이
//		
//		String string1 = "java";
//		String string2 = "메소드 설명";
//		
//		System.out.println("string1.length() = " + string1.length());
//		System.out.println("string2.length() = " + string2.length());
		
//		3. split : 문자열 나누기
//		String[] split(String divider)
//		함수의 설명 : 문자열을 자를 분리자로 나눠서 문자열 배열에 담아서 반환 함
//		1st 매개변수 : 분리자
//		return값 : 분리자로 잘린 문자열 배열
//		
//		String str_num = "123 4567 890";
//		String[] arr = str_num.split(" ");
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println("arr[0] = " + arr[0]);
//		System.out.println("arr[1] = " + arr[1]);
//		System.out.println("arr[2] = " + arr[2]);
		
//		4. equals : 문자열 일치 여부 검사
//		boolean equals(Object obj)
//		1st 매개변수 : 문자열 객체가 들어옴
//		return값 : 일치하면 참(true), 틀리면 거짓(false)
//		문자열 비교 if("abc" == "abc") : 문자열 비교 할 때 ㅇㅈㄹ로 쓰면 안 됨
//		문자열 비교 if("abc".equals("abc") == true) : ㅇㅈㄹ로 써야 됨
//		참고 사항 :  if('a' == 'a') : 한 문자 비교 이건 쌉 가능
//		
//		String s = "Hello Java";
//		boolean c1 = s.equals("Hello Java");
//		boolean c2 = s.equals("Fucking Java");
//		
//		System.out.println("c1 = " + c1);
//		System.out.println("c2 = " + c2);
		
//		5. contains : 문자열에 포함 된 문자가 있는지 검사
//		boolean contain(검사 할 문자열)
//		1st 매개 변수 : 검사 할 문자열
//		return값 : 검사 할 문자열이 있으면 true(참), 없으면 flase(거짓)
//		
//		String string1 = "abcdefgh";
//		boolean a1 = string1.contains("efg");
//		boolean a2 = string1.contains("fuck");
//		
//		System.out.println("a1 = " + a1);
//		System.out.println("a2 = " + a2);
		
//		6. startWith, endsWith : 문자열 시작 또는 끝 부분에 일치하는 문자열이 있는지 검사
//		boolean stratWith(String s) : 문자열 s로 시작하는지 검사 (맞으면 true, 틀리면 false)
//		boolean endsWith(String s) : 문자열 s로 끝나는지 검사 (맞으면 true, 틀리면 false)
//		
//		String string1 = "http://www.naver.com";
//		boolean b1 = string1.startsWith("http");
//		boolean b2 = string1.endsWith("co.kr");
//		
//		System.out.println("b1 = " + b1);
//		System.out.println("b2 = " + b2);
		
//		7. replace : 문자열을 임의의 문자열로 바꾸기
//		String replace(원본 문자열, 바꿀 문자열)
//		return값 : 바꾸어진 문자열
//		
//		String tmp_str = "ABCDEF";
//		
//		String string2 = tmp_str.replace("DE", "XX");
//		
//		System.out.println("tmp_str = " + tmp_str);
//		System.out.println("string2 = " + string2);
		
//		8. trim : 문자열 좌우의 공백 없애기
//		String trim()
//		return값 : 문자열 처음과 끝의 공백을 없앤 문자열
//		
//		String tmp_str = "    Hello java text   ";
//		String trim_str = tmp_str.trim();
//		
//		System.out.println("trim_str = " + trim_str);
		
//		9. toLowerCase : 문자열의 대문자를 소문자로 바꾸기
//		String toLoweCase()
//		return값 : 모두 소문자로 바꾼 문자열
//		
//		String tmp_str = "Java Programming Test";
//		String tmp_lower = tmp_str.toLowerCase();
//		
//		System.out.println("tmp_lower = " + tmp_lower);
		
//		10.toUpperCase : 문자열의 소문자를 대문자로 바꾸기
//		String toUpperCase()
//		return값 : 모든 문자열을 대문자로 바꾸어서 반환
//		
//		String tmp_str = "Java Programming Test";
//		String tmp_upper = tmp_str.toUpperCase();
//		
//		System.out.println("tmp_upper = " + tmp_upper);
		
//		11. charAt() : 매개변수의 index번호에 해당하는 문자 하나를 반환
//		char charAt(int index)
//		1st 매개변수 : 문자열 유사배열의 index번호
//		return값 : 문자열 index번호에 해당하는 문자 하나
//		
//		String str = "abcdefg";
//		char chr = str.charAt(1);
//		char chr2 = str.charAt(str.length() - 1);
//		
//		System.out.println("chr = " + chr);
//		System.out.println("chr2 = " + chr2);
		
//		12. indexOf(찾을 문자열) : 문자열 중 찾을 문자열이 나오는 첫 index번호를 반환
//		int indexOf(String str)
//		1st 매개변수 : 찾을 문자열
//		return값 : 찾은 문자열의 첫번째 문자의 index번호, 없으면 -1
		
		String str = "abcdefg hi";
		int index = str.indexOf("a");
		int index2 = str.indexOf("hi");
		int index3 = str.indexOf("j");
		
		System.out.println("index = " + index);
		System.out.println("index2 = " + index2);
		System.out.println("index3 = " + index3);
	}

}
