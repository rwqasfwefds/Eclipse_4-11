package ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ex5_1
//		int[] iArr1 = new int[10];
//		int[] iArr2 = new int[10];
//		int[] iArr3 = {100, 95, 80, 70, 60};
//		char[] chArr = {'a', 'b', 'c', 'd'};
//		
//		for(int i = 0; i < iArr1.length; i++) {
//			iArr1[i] = i + 1;
//		}
//		
//		for(int i = 0; i < iArr2.length; i++) {
//			iArr2[i] = (int)(Math.random() * 10) + 1;
//		}
//		
//		for(int i = 0; i < iArr1.length; i++) {
//			System.out.print(iArr1[i] + ",");
//		}
//		System.out.println();
//		
//		System.out.println(Arrays.toString(iArr2));
//		System.out.println(Arrays.toString(iArr3));
//		System.out.println(Arrays.toString(chArr));
//		System.out.println(iArr3);
//		System.out.println(chArr);
		
//		Ex5_2
//		int sum = 0;
//		float average = 0f;
//		
//		int [] score = {100, 88, 100, 100, 90};
//		
//		for(int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//		average = sum / (float)score.length;
//		
//		System.out.println("총합 : " + sum);
//		System.out.println("평균 : " + average);
		
//		Ex5_3
//		int [] score = {79, 88, 91, 33, 100, 55, 95};
//		
//		int max = score[0];
//		int min = score[0];
//		
//		for(int i = 1; i < score.length; i++) {
//			if(score[i] > max) {
//				max = score[i];
//			} else if(score[i] < min) {
//				min = score[i];
//			}
//		}
//		
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
		
//		Ex5_4
//		int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//		System.out.println(Arrays.toString(numArr));
//		
//		for(int i = 0; i < 100; i++) {
//			int n = (int)(Math.random() * 10);
//			int tmp = numArr[0];
//			numArr[0] = numArr[n];
//			numArr[n] = tmp;
//		}
//		System.out.println(Arrays.toString(numArr));
		
//		Ex5_5
//		int[] ball = new int[45];
//		
//		for(int i = 0; i < ball.length; i++)
//			ball[i] = i + 1;
//		
//		int tmp = 0;
//		int j = 0;
//		
//		for(int i = 0; i < 6; i++) {
//			j = (int)(Math.random() * 45);
//			tmp = ball[i];
//			ball[i] = ball[j];
//			ball[j] = tmp;
//		}
//		for(int i = 0; i < 6; i++) {
//			System.out.printf("ball[%d] = %d%n", i, ball[i]);
//		}
		
//		Ex5_6
//		String[] names = {"Kim", "Park", "Yi"};
//		
//		for(int i = 0; i < names.length; i++) {
//			System.out.println("names["+i+"] : " + names[i]);
//		}
//		
//		String tmp = names[2];
//		System.out.println("tmp : " + tmp);
//		names[0] = "Yu";
//		
//		for(int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
		
//		Ex5_8
//		int[][] score = {
//				{100, 100, 100},
//				{20, 20, 20},
//				{30, 30, 30},
//				{40, 40, 40}
//		};
//		int sum = 0;
//		
//		for(int i = 0; i < score.length; i++) {
//			for(int j = 0; j < score[i].length; j++) {
//				System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
//				
//				sum += score[i][j];
//			}
//		}
//		System.out.println("sum + " + sum);
		
//		Ex5_10
//		String[][] words = {
//				{"chair", "의자"},
//				{"computer", "컴퓨터"},
//				{"integer", "정수"}
//		};
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		for(int i = 0; i < words.length; i++) {
//			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
//			
//			String tmp = scanner.nextLine();
//			
//			if(tmp.equals(words[i][1])) {
//				System.out.printf("정답입니다.%n%n");
//			} else {
//				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
//			}
//		}
		
//		153p
//		배열의 복사
//		int[] arr = {0, 1, 2, 3, 4};
//		int[] arr2 = Arrays.copyOf(arr, arr.length);
//		int[] arr3 = Arrays.copyOf(arr, 3);
//		int[] arr4 = Arrays.copyOf(arr, 7);
////	1st 매개변수 : 배열
////	2nd 배개변수 : 복사 할 처음 index번호
////	3nd 매개변수 : 복사 할 끝 index + 1번호
//		int[] arr5 = Arrays.copyOfRange(arr4, 2, 4);
//		int[] arr6 = Arrays.copyOfRange(arr4, 0, 7);
//		
//		System.out.println("arr2 = " + Arrays.toString(arr2));
//		System.out.println("arr3 = " + Arrays.toString(arr3));
//		System.out.println("arr4 = " + Arrays.toString(arr4));
//		System.out.println("arr5 = " + Arrays.toString(arr5));
//		System.out.println("arr6 = " + Arrays.toString(arr6));
		
//		배열의 정렬
//		int[] arr = {3, 2, 0, 1, 4};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
//		연습문제 5-3
//		int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		
//		System.out.println("sum = " + sum);
		
//		연습문제 5-4
		int[][] arr = {
				{5, 5, 5, 5, 5,},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		
		int total = 0;
		float average = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
			average = total / (float)(arr.length * arr[i].length);
		}
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	}

}
