import java.util.Scanner;
public class E18 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入性別: ");
		String sex=scn.nextLine();
		System.out.print("輸入身高: ");
		int height = scn.nextInt();
		switch(sex) {
			case "\u7537" :
				System.out.println("你的標準體重應該維持在 " + (int)((height-80)*0.7) + " 公斤");
				break;
			default :
				System.out.println("你的標準體重應該維持在 " + (int)((height-70)*0.6) + " 公斤");
				break;
		}
	}
}
