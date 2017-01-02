import java.util.Scanner;
public class M12 {
	public static double power(int x,int y) {
		int ans=1;
		for(int i=1;i<=y;i++) 
			ans=ans*x;
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入 n : ");
		int n = scn.nextInt();
		double total=0;
		for(int i=1;i<=n;i++) 
			total += 1/power(2,i);
		System.out.print(total);
	}
}
