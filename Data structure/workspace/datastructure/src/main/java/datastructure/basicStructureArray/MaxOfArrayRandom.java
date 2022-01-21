package datastructure.basicStructureArray;

import java.util.Random;
import java.util.Scanner;

// 배열 요소의 최대값을 나타냅니다(값을 난수로 생성).
class MaxOfArrayRandom {
	// 배열 a의 최대값을 구하여 변환합니다.
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) 
			if(a[i] > max)
				max = a[i];
			return max;
	}	
	
	
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.println("사람 수 : ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		for(int i = 0; i < num; i++ ) {
			height[i] = 100 + random.nextInt(90);
			System.out.println("height [" + (i+1) + "] :" + height[i]);
		}
		
		System.out.println("최대값은 " + maxOf(height) + " 입니다." );
	}
}
