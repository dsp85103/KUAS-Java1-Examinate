import java.util.Scanner;
public class M17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入個人所得 : ");
		int yearMoneyTmp,level=1,level2=1,ans=0,yearMoney = scn.nextInt();
		double taxRate[] = {0.06,0.13,0.21,0.3,0.4};
		int yearMoneyRange[] = {0,370000,990000,1980000,3720000,yearMoney+1};
		yearMoneyTmp=yearMoney;
		for(int i=0;i<5;i++) {
			level=yearMoneyRange[i];
			level2=yearMoneyRange[i+1];
			yearMoneyTmp=yearMoney-level;
			if(yearMoney>level && yearMoney<=level2) {
				ans += (int)((double)yearMoneyTmp*taxRate[i]);
			} else if(yearMoney>level2) {
				ans += (int)((double)(level2-level)*taxRate[i]);
			}
		}
		System.out.print("稅額  = " + ans);
	}
}
