package Array;

import java.util.Arrays;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		int[]a= {9,7,9,2,4,7,2,9};
		int c=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				c++;
			}
		}
		int[]even=new int[c];
		int[]odd=new int[a.length-c];
		int o=0;
		for (int i = 0,j=0; i < a.length; i++) {
			if (a[i]%2==0) {
				even[j]=a[i];
				j++;
			} else {
				odd[o]=a[i];
				o++;
			}
		}
		System.out.println("Even array is :"+Arrays.toString(even));
		System.out.println("Odd array is :"+Arrays.toString(odd));
	}

}
