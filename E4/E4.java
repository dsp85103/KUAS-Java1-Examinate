import java.util.Scanner;
public class E4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String inString,ChangeStr;		
		System.out.print("請輸入任意大小寫字串: ");
		inString = scn.nextLine();
		char inCharArray[] = inString.toCharArray();	
		for(int i=0;i<inString.length();i++) {
			if((int)(inCharArray[i]) >= 65 && (int)(inCharArray[i])<= 90) 
				inCharArray[i] = (char)((int)(inCharArray[i]) + 32);
			System.out.print(inCharArray[i]);
		}
	}
}
