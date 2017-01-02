import java.util.Scanner;
public class M5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入本金 : ");
		float p = scn.nextFloat();
		System.out.print("請輸入月利率 : ");
		float r = scn.nextFloat();
		System.out.print("請輸入存款期數 : ");
		int n = scn.nextInt();
		float t = p*(float)(Math.pow((1+r),n));
		System.out.print("本利和為 " + (int)t);
	}
}
