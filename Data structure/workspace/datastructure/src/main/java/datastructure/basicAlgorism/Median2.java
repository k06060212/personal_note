package datastructure.basicAlgorism;

class Median2 {
	static int median2(int a, int b, int c) {
		if(a >= b)
			if(b >= c)
				return b;
			else if(a >= c)
				return a;
			else
				return c;
		else if(a >= c)
			return a;
		else if(b >= c)
			return c;
		else
			return b;
		
	}

	public static void main(String args[]) {
		System.out.println("median2(3,2,1) = " + median2(3,2,1));
		System.out.println("median2(3,2,2) = " + median2(3,2,2));
		System.out.println("median2(3,1,2) = " + median2(3,1,2));
		System.out.println("median2(3,2,3) = " + median2(3,2,3));
		System.out.println("median2(3,2,3) = " + median2(2,1,3));
		System.out.println("median2(3,2,3) = " + median2(3,3,2));
		System.out.println("median2(3,3,3) = " + median2(3,3,3));
		System.out.println("median2(2,2,3) = " + median2(2,2,3));
		System.out.println("median2(2,3,1) = " + median2(2,3,1));
		System.out.println("median2(2,3,2) = " + median2(2,3,2));
		System.out.println("median2(1,3,2) = " + median2(1,3,2));
		System.out.println("median2(2,3,3) = " + median2(2,3,3));
		System.out.println("median2(1,2,3) = " + median2(1,2,3));
	}
}
