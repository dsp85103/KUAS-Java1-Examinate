import java.util.Scanner;
public class M14 {
	public static float power(float x,int y) {
		float ans=1;
		for(int i=1;i<=y;i++) 
			ans=ans*x;
		return ans;
	}
	public static int fact(int a) {
		if(a==0) return 1;
		int ans=1;
		for(int i=a;i>0;i--)
			ans=ans*i;
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("設 x 為 0.1");
		float x=0.1f,total=0;
		for(int k=0;k<11;k++) 
			total += power(x,k)/fact(k);
		System.out.print(total);
	}
}
