import java.util.Scanner;
public class E11 {
	public static Boolean auth(int x) {
		for(int i=2;i<Math.sqrt(x);i++) {
			if(x%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num;
		System.out.print("請輸入整數: ");
		num = scn.nextInt();
		if(num<999 && num>1) 
			System.out.print((auth(num))?num+" 是質數":num+" 不是質數");
		else if(num==1 || num>=999) 
			System.out.print("錯誤整數範圍.");
	}
}
