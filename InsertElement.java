package Arrayy;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int a[] = { 70, 60, 50, 40, 30, 20, 10 };
		System.out.println("Enter element to insert and position");
		int insert = sca.nextInt();
		int position = sca.nextInt();
		int i, j;
		int ar[] = new int[a.length + 1];
		for (i = 0, j = 0; i < ar.length; i++, j++) {

			if (i == position) {
				ar[i] = insert;
			} else if (i < position) {
				ar[i] = a[i];
			} else if (i > position) {
				ar[i] = a[i - 1];
			}
		}
		System.out.println(Arrays.toString(ar));
	}
}
