package ArrayProgram;

public class UniqueArray {

	public static void main(String[] args) {

		int[] arr = { 10,50,80,20};
		int i,j;
		for ( i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Not an Unique Array");
					break;
				} 
			}
			if (j!=arr.length) {
				break;
			}
		}
		if (i==arr.length) {
			System.out.println("Unique Array");
		}
	}
}
