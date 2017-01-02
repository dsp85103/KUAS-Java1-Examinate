import java.util.Scanner;
public class E15 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入華氏溫度: ");
		int temF = scn.nextInt();
		System.out.print("攝氏溫度為 "+ (float)Math.round((float)5/9*(temF-32)*10)/10);
	}
}
