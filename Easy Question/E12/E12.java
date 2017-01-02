import java.util.Scanner;
public class E12 {
	public static void reverse(String[] strArray,int length) {
		if(length==1) {
			System.out.print(strArray[length-1] + " ");
		} else {
			System.out.print(strArray[length-1] + " ");
			reverse(strArray,length-1);
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入: ");
		String strA = scn.nextLine();
		String[] arrA = strA.split(" ");
		
		reverse(arrA,arrA.length);
	}
}
