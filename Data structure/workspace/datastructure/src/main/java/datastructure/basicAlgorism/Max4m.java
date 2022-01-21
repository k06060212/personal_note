package datastructure.basicAlgorism;

class Max4m {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c; 
		if(d > max) max = d; 
		
		return max;
	}

	public static void main(String arge[]) {
		System.out.println("max4(1,2,3,4) = " + max4(1,2,3,4));
		System.out.println("max4(2,4,6,8) = " + max4(2,4,6,8));
	}
}
