import java.util.Scanner;
public class E7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr1[] = new int[6],arr2[] = new int[6];
		for(int i=0;i<6;i++) 
			arr1[i] = scn.nextInt();
		for(int i=0;i<6;i++) 
			arr2[i] = scn.nextInt();
		for(int i=0;i<6;i++) 
			System.out.print(((arr1[i]+arr2[i])%2==0)?"0 ":"1 ");
	}
}
