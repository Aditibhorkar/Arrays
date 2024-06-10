package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BasicOperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[7];
		
		System.out.println("Enter the elements in arrays : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Your arrays is : "+Arrays.toString(arr));
		findEven(arr);
		findOdd(arr);
		findNegative(arr);
		findElement(9, arr);
		
	}
	
	
	public static void findEven(int[] arr)
	{
		System.out.print("Even Elements in array are :");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2==0) System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void findOdd(int[] arr)
	{
		System.out.print("Odd Elements in array are :");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2!=0) System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void findNegative(int[] arr)
	{
		System.out.print("Negative Elements in array are :");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<0) System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void findElement(int n,int[]a)
	{
		for (int i = 0; i < a.length; i++) {
			if (a[i]==n) {
				System.out.println("Element "+n+" found at position :"+i);
				return ;
			}
		}
		System.out.println("Element is not present");
	}
}
