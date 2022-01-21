package datastructure.basicStructureArray;

// 배열을 복제합니다.
class CloneArray {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = a.clone();	// b
		
		b[3] = 0;
		
		System.out.print("a =");
		for(int i = 0; i < a.length; i++)
			System.out.println(" " + a[i]);
		
		System.out.print("b =");
		for(int i = 0; i < b.length; i++)
			System.out.println(" " + b[i]);
		
	}
}
