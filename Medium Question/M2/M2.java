import java.util.Scanner;
import java.util.Arrays;
public class M2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入陣列個數: ");
		int arrNum[] = new int[scn.nextInt()];
		System.out.print("請輸入陣列: ");
		for(int i=0;i<arrNum.length;i++) 
			arrNum[i] = scn.nextInt();
		System.out.print("陣列內容: ");
		for(int i=0;i<arrNum.length;i++)
			System.out.print(arrNum[i] + " ");
		System.out.println();
		Arrays.sort(arrNum);
		System.out.print("最大兩數為: ");
		for(int i=arrNum.length-1;i>arrNum.length-3;i--)
			System.out.print(arrNum[i] + " ");
	}
}
