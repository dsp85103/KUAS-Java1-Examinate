import java.util.Scanner;
public class E1 {
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
		System.out.println("陣列加總值:");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) 
				System.out.print(ArrayA[i][j] + ArrayB[i][j] + " " );
			System.out.println();
		}
	}
}
