import java.util.Scanner;
public class E10 {
	public static float Variance(int number,int[] arrNum) {
		float total=0,average=0;
		for(int i=0;i<number;i++) 
			total = total + arrNum[i];
		average = (float)(total/number);
		total = 0;
		for(int i=0;i<number;i++) {
			total = total + (float)Math.pow((arrNum[i]-average),2);
		}
		return total/number;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num;
		System.out.print("請輸入整數筆數(1 <= N <= 30): ");
		num = scn.nextInt();
		if(num>=1 && num <= 30) {
			int arrNum[] = new int[num];
			System.out.print("請輸入 " +num+ " 筆整數: ");
			for(int i=0;i<num;i++) {
				arrNum[i] = scn.nextInt();
			}
			System.out.print(num+ " 筆整數的變異數為: " +Variance(num,arrNum));
		}
	}
}
