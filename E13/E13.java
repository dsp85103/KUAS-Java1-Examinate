import java.util.Scanner;
public class E13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int up,down,high;
		System.out.print("請輸入上底: ");
		up = scn.nextInt();
		System.out.print("請輸入下底: ");
		down = scn.nextInt();
		System.out.print("請輸入高: ");
		high = scn.nextInt();
		System.out.print("梯形面積為 " + (up+down)*high/2);
	}
}
