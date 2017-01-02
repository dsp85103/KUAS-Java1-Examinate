import java.util.Scanner;
public class E16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入整數筆數 n : ");
		int total=0,num = scn.nextInt();
		int arrScore[] = new int[num];
		for(int i=0;i<num;i++) {
			arrScore[i] = scn.nextInt();
			total += arrScore[i];
		}
		System.out.println("總和: "+total);
		System.out.println("平均: "+total/num);
		for(int i=0;i<num;i++) {
			switch(arrScore[i]/10) {
				case 2 :
				case 3 :
					System.out.println(arrScore[i]+" : D");
					break;
				case 4 :
				case 5 :
					System.out.println(arrScore[i]+" : C");
					break;
				case 6 :
				case 7 :
					System.out.println(arrScore[i]+" : B");
					break;
				case 8 :
				case 9 :
				case 10 :
					System.out.println(arrScore[i]+" : A");
					break;
				default:
					System.out.println(arrScore[i]+" : E");
			}
		}
	}
}
