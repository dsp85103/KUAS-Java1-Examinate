import java.util.Scanner;
public class E20 {
	public static void main(String[] args) {
		int in,count;
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入正整數值 n : ");
		in = scn.nextInt();
		System.out.print(in +" = "); 
		for(int t=2;t<=in;t++) {
			count=0;
			while(in%t==0) {
				count=1;
				in=in/t;
				System.out.print(t);
				while(in%t==0) {
					count++;
					in=in/t;
					System.out.print("*" + t);
				}
				if(in>2 && count>0) {
					System.out.print("*");
				} 
			}
		}
	}
}
