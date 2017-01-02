import java.util.Scanner;
public class M1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入N : ");
		Boolean answerFlag = false;
		int b=0,o=0,a=0,tmp=0,money = scn.nextInt();
		if(money>=100 && money<=1000) {
			for(b=5;b<money;b+=5) {
				for(o=3;o<money-b*5;o+=3) {
					for(a=2;a<money-b*5-o*6;a+=2) {
						if(b*5+o*6+a*10==money) {
							System.out.println("x=" + b +"  y=" + o +"  z=" + a);
							answerFlag = true;
							break;
						}
					}
				}
			}
		}
		if(answerFlag==false) 
			System.out.print(“No Solution.”);
	}
}
