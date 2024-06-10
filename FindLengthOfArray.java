package ArrayProgram;

public class FindLengthOfArray {
	
	public static void main(String[] args) {
		
		int[] a= {5,10,15,20,25,30,87,9,6,3,12,4,5};
		int i=0,ct=0;
		try {
			while (a[i]!='a') {
				 i++;
				 ct++;
				}
		} catch (Exception e) {
			System.out.println("The Length of array is : "+ct);
		}
	}

}
