import java.util.Scanner;
public class M3 {
	public static int factorial(int x) {
		int ans=1;
		for(int i=x;i>0;i--) 
			ans=ans*i;
		return ans;
	}
	 public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入m : ");
		int m = scn.nextInt();
		System.out.print("輸入n : ");
		int n = scn.nextInt();
		System.out.print(factorial(m)/(factorial(n)*factorial(m-n)));
	}
}
