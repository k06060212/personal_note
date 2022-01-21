package datastructure.basicAlgorism;

import java.util.Scanner;

public class Min4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("네 정수의 최소값을 구합니다.");
		
		System.out.println("a의 값 : ");  int a = sc.nextInt();
		System.out.println("b의 값 : ");  int b = sc.nextInt();
		System.out.println("c의 값 : ");  int c = sc.nextInt();
		System.out.println("d의 값 : ");  int d = sc.nextInt();

		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		System.out.println("최소 값 = " + min);
	}
}
