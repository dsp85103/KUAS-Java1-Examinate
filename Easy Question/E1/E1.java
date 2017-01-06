import java.util.Scanner;
public class E1 {
	public static void arrayAdd(int[][] x,int[][] y) {
		System.out.println("陣列加總值:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) 
				System.out.print(x[i][j] + y[i][j] + " " );
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int i,j;
		int ArrayA[][] = new int[3][3],ArrayB[][] = new int[3][3];
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入第 1 個陣列:");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) 
				ArrayA[i][j] = scn.nextInt();
		}
		System.out.println("請輸入第 2 個陣列:");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) 
				ArrayB[i][j] = scn.nextInt();
		}
		arrayAdd(ArrayA,ArrayB);
	}
}
