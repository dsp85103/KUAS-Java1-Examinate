import java.util.Scanner;
public class E9 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int numA,numB,min=0,ans=0;
		System.out.print("輸入正整數 1 : ");
		numA = scn.nextInt();
		System.out.print("輸入正整數 2 : ");
		numB = scn.nextInt();
		min=numA;
		if(numB < min) min=numB;
		if(numA>=1 &&numA<=9999 && numB>=1 &&numB<=9999) {
			for(int i=2;i<=min;i++) {
				if(numA%i==0 && numB%i==0) 
					ans=i;
			}
			System.out.println(numA +" 與 "+numB +" 的最大公因數是 "+ans);
			System.out.println(numA +" 與 "+numB +" 的最小公倍數是 "+(numA*numB/ans));

		} else {
			System.out.println("錯誤整數範圍(1 <= A,B <= 9999 )!!");
		}
	}
}
