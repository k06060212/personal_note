package datastructure.basicAlgorism;

import java.util.Scanner;

class Max4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("a의 값 : "); int a = sc.nextInt();
		System.out.println("b의 값 : "); int b = sc.nextInt();
		System.out.println("c의 값 : "); int c = sc.nextInt();
		System.out.println("d의 값 : "); int d = sc.nextInt();
		
		int max = a;
		if(b > max) max=b;
		if(c > max) max=c;
		if(d > max) max=d;
		
		System.out.println("최댓값은 " + max + "입니다.");
	}
} 