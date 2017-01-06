import java.util.Scanner;
public class M4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入票價P: ");
		int ten=0,five=0,price = scn.nextInt();
		if(price>=0 && price<=1000) {
			if(price/10!=0) {
				ten=price/10;
				price = price%10;
			}
			if(price/5!=0) {
				five=price/5;
				price = price%5;
			}
			System.out.println("車票所需的總硬幣數量為 " + (ten+five+price) + " 枚");
			System.out.println("10元硬幣數量 = " + ten);
			System.out.println("5元硬幣數量 = " + five);
			System.out.println("1元硬幣數量 = " + price);
		} 
	}
}
