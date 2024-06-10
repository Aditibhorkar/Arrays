package ArrayProgram;

import java.util.Arrays;

public class CopyElementToArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60,70};
		int b[]=new int[a.length];
		
		for (int i = 0; i < b.length; i++) {
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}
}
