package Array;

public class SubArray {
	
	public static void main(String[] args) {
		
		int[] a = { 10, 20, 30};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i; j < a.length; j++) {
				
				for (int j2 = i; j2 <=j ; j2++) {
					
					System.out.print(a[j2]+" ");
				}
				System.out.println();
			}
			
		}
		
		
	}

}
