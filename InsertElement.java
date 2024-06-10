package ArrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = { 10, 20, 30, 40, 50, 70, 80, 90, 100 };
		System.out.println("Enter the element you want to insert in array");
		int element = scanner.nextInt();
		System.out.println("Enter the position at you want to insert element");
		int position = scanner.nextInt();

		int[] updated = new int[a.length + 1];
		for (int i = 0,j=0; i < updated.length; i++) {
			if (position == i) {
				updated[i] = element;
			
			}else 
			{
				updated[i]=a[j];
				j++;
			}
		}
		scanner.close();
		System.out.println(Arrays.toString(updated));
	}
}
