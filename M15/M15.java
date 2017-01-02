import java.util.Scanner;
public class M15 {
	public static void main(String[] args) {
		int num[][] = {{33,32,56,45,33},
					 {9999,33,68,45,23},
					 {43,55,43,67,65}};
		for(int i=0;i<3;i++) {
			System.out.print("銷售員 "+(i+1)+" 的銷售量為 ");
			for(int j=0;j<5;j++) 
				System.out.print(num[i][j]+" ");
			System.out.println();
		}
		System.out.println();
		System.out.println("(a)每個銷售員銷售總金額如下 :");
		int max=1,tmp=0,moneyTotal=0,unitPrice[] = {12,16,10,14,15};
		for(int i=0;i<3;i++) {
			System.out.print("銷售員 "+(i+1)+" 的銷售總金額 ");
			for(int j=0;j<5;j++) 
				moneyTotal += (num[i][j]*unitPrice[j]);
			System.out.println(moneyTotal);
			if(moneyTotal>tmp) {
				tmp=moneyTotal;
				max=i+1;
			}
			moneyTotal=0;
		}
		System.out.println();
		System.out.println("(b)每項產品銷售總金額如下 :");
		int tmp1=0,numMax=1,numTotal=0;
		for(int i=0;i<5;i++) {
			System.out.print("產品 "+((char)(65+i))+" 的銷售總金額 ");
			for(int j=0;j<3;j++) {
				numTotal += (num[j][i]*unitPrice[i]);
			}
			System.out.println(numTotal);
			if(numTotal>tmp1) {
				tmp1=numTotal;
				numMax=i;
			}
			numTotal=0;
		}
		System.out.println();
		System.out.println("(c)業績最好的銷售員 : 銷售員 " +(max));
		System.out.println();
		System.out.println("(d)銷售金額最多的產品 : 產品 " +(char)(65+numMax));
	}
}
