package ArrayProgram;

import java.util.Arrays;

public class Marge2aray {
	
	public static void main(String[] args) {
		
		int[] a1= {10,20,50};
		int[] a2= {90,50,40,80,80};
		
		int[] a3=new int[(a1.length+a2.length)];
		
		for (int i = 0; i < a3.length; i++) {
			if (i<3) {
				a3[i]=a1[i];
			} 
			else
			{
				a3[i]=a2[i-a1.length];
			}
		}
		
		
		System.out.println(Arrays.toString(a3));
	}

}
