import java.util.Scanner;
public class E14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int numHead,numFoot,xmax=0;
		System.out.print("請輸入頭的總數目: ");
		numHead = scn.nextInt();
		System.out.print("請輸入腳的總數目: ");
		numFoot = scn.nextInt();
		for(int i=0;i<=numHead;i++) {
			if(i*2+(numHead-i)*4==numFoot) {
				xmax=i;
				break;
			}
		}
		System.out.println("聖誕老人共有 " + xmax + " 位");
		System.out.println("馴鹿共有 " + (numHead-xmax) + " 隻");
	}
}
