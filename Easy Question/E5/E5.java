import java.util.Scanner;
public class E5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String strNum,t;
		int A=0,B=0,tmp=0,tmp1=0,i;
		System.out.print("請輸入數字: ");
		strNum = scn.nextLine();
		for(i=0;i<strNum.length();i++) {
			tmp = Integer.parseInt(strNum.substring(i,i+1));
			if(i%2==0)
				A = tmp + A;
			else
				B = tmp + B;
		}
		tmp1 = Math.abs(A-B);
		System.out.println((tmp1%11==0)?(strNum+" 之奇偶數差為11的倍數"):(strNum+" 之奇偶數差不是11的倍數"));
	}
}
