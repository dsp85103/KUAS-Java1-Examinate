import java.util.Scanner;
public class E8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int IntCount;
		System.out.print("請輸入整數筆數: ");
		IntCount = scn.nextInt();
		if(IntCount>=1 && IntCount <= 30){
			int arrNum[] = new int[IntCount];
			System.out.print("請輸入 "+IntCount+" 筆整數: ");
			for(int i=0;i<IntCount;i++)
				arrNum[i] = scn.nextInt();
			for(int i=0;i<IntCount-1;i++) {
				for(int j=0;j<IntCount-1-i;j++) {
					if(arrNum[j+1]<arrNum[j]) {
						int tmp = arrNum[j+1];
						arrNum[j+1] = arrNum[j];
						arrNum[j] = tmp;
					}
				}
			}
			System.out.print("排序後: ");
			for(int i=0;i<IntCount;i++)
				System.out.print(arrNum[i] + " ");
		} else {
			System.out.println("輸入數值必須介於 1~30 間.");
		}
	}
}
