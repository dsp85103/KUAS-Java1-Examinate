import java.util.Scanner;
public class M16 {
	public static int fib(int n) {
		if(n==1 || n==2) return 1;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入第 n 個費式數列的值 : ");
		int n = scn.nextInt();
		System.out.print("費式數列的總值 fib("+n+")= "+ fib(n));
	}
}
