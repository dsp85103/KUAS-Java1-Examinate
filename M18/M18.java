import java.util.Scanner;
public class M18 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入西歷年 : ");
		int year = scn.nextInt();
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.print(year + " 年 是閏年");
		} else {
			System.out.print(year + " 年 不是閏年");
		}
	}
}
