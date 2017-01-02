import java.util.Scanner;
import java.util.Random;
public class M13 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入 N : ");
		int numCount[] = new int[49],num = scn.nextInt();
		for(int i=1;i<=num;i++) 
			numCount[ran.nextInt(49)]++;
		System.out.println("樂透彩機率最高的六個號碼為 :");
		for(int i=1;i<=6;i++) {
			int Count=0,maxNum=0;
			for(int j=0;j<49;j++) {
				if(numCount[j]>maxNum) {
					Count=numCount[j];
					maxNum=j;
				}
			}
			numCount[maxNum]=0;
			System.out.println((maxNum+1) + " → " + Count + " 次");
		}
	}
}
