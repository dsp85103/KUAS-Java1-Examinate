import java.util.Scanner;
public class E6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String inStrNum;
		System.out.print("請輸入: ");
		inStrNum = scn.nextLine();
		char inputChar[] = inStrNum.toCharArray();
		for(int i=0;i<inStrNum.length();i++) {
			if((int)(inputChar[i]) >= 97 && (int)(inputChar[i]) <=122)
				inputChar[i] = (char)(inputChar[i]-32);
			if((int)(inputChar[i]) >= 48 && (int)(inputChar[i]) <=57)
				inputChar[i] = '0';
			System.out.print(inputChar[i]);
		}
	}
}
