package datastructure.basicAlgorism;

class Min4m {
	static int min4(int a, int b, int c, int d) {
		 int min = a;
		 if(b < min)
			 min = b;
		 if(c < min)
			 min = c;
		 if(d < min)
			 min = d;
		 
		 return min;
	}
	
	public static void main(String args[]) {
		System.out.println("min4(3,2,1) = " + min4(3,2,1,0));
		System.out.println("min4(3,2,2) = " + min4(3,2,2,4));
		System.out.println("min4(3,1,2) = " + min4(3,1,2,5));
		System.out.println("min4(3,2,3) = " + min4(3,2,3,0));
		System.out.println("min4(3,3,3) = " + min4(3,3,3,3));
		System.out.println("min4(2,2,3) = " + min4(2,2,3,2));
		System.out.println("min4(2,3,1) = " + min4(2,3,1,1));
		System.out.println("min4(2,3,2) = " + min4(2,3,2,4));
		System.out.println("min4(1,3,2) = " + min4(1,3,2,5));
		System.out.println("min4(2,3,3) = " + min4(2,3,3,0));
		System.out.println("min4(1,2,3) = " + min4(1,2,3,2));
	}
}