import java.util.Scanner;
public class E3 {
	public static String replace(String reStr,int reNum,String reChar) {
		char ArrayChar[] = reStr.toCharArray();
		String finStr="";
		for(int i=0;i<reStr.length();i++) {
			if(i==reNum-1)
				finStr = finStr + reChar;
			else
				finStr = finStr + ArrayChar[i];	
		}
		return finStr;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String inString;
		String replaceChar;
		int replacePosition,i;
		
		System.out.print("請輸入字串: ");
		inString = scn.nextLine();
		
		System.out.print("請輸入第幾個字元及要替換的字元: ");
		replacePosition = scn.nextInt();
		replaceChar = scn.next();
		System.out.print(replace(inString,replacePosition,replaceChar));
	}
}
