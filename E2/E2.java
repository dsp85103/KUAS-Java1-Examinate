import java.util.Scanner;
public class E2 {
	public static int strLength(String x) {
		String strArray[]=x.split("");
		return strArray.length;
	}
	public static void strReverse(String x) {
		String ans,strArray[]=x.split("");
		System.out.print("反轉後字串: ");
		for(int i=strArray.length-1;i>=0;i--)
			System.out.print(strArray[i]);
	}
	public static void main(String[] args) {
		Scannerscn=newScanner(System.in);
		String str=scn.nextLine();
		System.out.println("字串長度:"+strLength(str)+",");
		strReverse(str);
	}
}
