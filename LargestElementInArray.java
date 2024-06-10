package ArrayProgram;

public class LargestElementInArray {
	
	public static void main(String[] args) {
		
		int []ar= {2,4,8,7,62};
		
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]>max) {
				max=ar[i];
			}
		}
		System.out.println("Largest Element is :"+max);
	}

}
