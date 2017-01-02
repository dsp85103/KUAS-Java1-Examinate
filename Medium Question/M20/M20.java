import java.util.Scanner;
public class M20 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int tryTimes=1,correctPwd=1286;
		while(true) {
			System.out.print("請輸入密碼 : ");
			int inputPwd = scn.nextInt();
			if(inputPwd==correctPwd) {
				System.out.print("密碼輸入正確，歡迎使用本系統!!");
				break;
			} else if(tryTimes=3) {
				System.out.print("密碼輸入超過三次!!");
				break;
			}
			tryTimes++;
		}
	}
}
