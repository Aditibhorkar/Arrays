package ArrayProgram;

public class RetriveElementFrom2DArray {
	
	public static void main(String[] args) {

		int[][] ar =new int[2][3];
		
		ar[0][0]=10;
		ar[0][1]=20;
		ar[0][2]=30;
		ar[1][0]=40;
		ar[1][1]=50;
		ar[1][2]=60;
		

		for (int i = 0; i < ar.length; i++) {
			System.out.print("{");
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j]+" ");				
			}
			System.out.print("}");
		}

	}

}
