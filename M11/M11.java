import java.util.Scanner;
public class M11 {
	public static String takeAward(String x,int y) {	
		//取獎項位數的副程式 
		//takeAward(號碼,位數)
		String reTake="",tmp[] = x.split("");
		for(int i=7;i>=8-y;i--) 
			reTake = tmp[i] + reTake;
		return reTake;
	}
	public static void compareAward(String[] projectPrice,String[] user,int coco) { 
		//比對位數的副程式,並輸出結果
		//compareAward(頭獎號碼陣列,使用者號碼陣列,目前金錢)
		int p[] = new int[6]; //獎項等級項數陣列 [頭獎.二.三.四.五.六]
		for(int i=0;i<6;i++) //獎項等級項數陣列歸零 
			p[i]=0;
		for(int i=0;i<3;i++) { //跑三個頭獎的迴圈
			for(int j=0;j<user.length;j++) { //拿使用者輸入所有獎項來跟頭獎比對
				for(int k=7;k>=2;k--) { //從8位數往下遞減比對
					if(Integer.parseInt(takeAward(projectPrice[i],k+1))==Integer.parseInt(takeAward(user[j],k+1))) {
						//若是比對結果相同，則將該等級項數加1，且跳出迴圈
						p[7-k]++;
						break;
					}
				}
			}
		}
		if(p[0]!=0)
			System.out.println("頭獎 : " + p[0]);
		if(p[1]!=0)
			System.out.println("二獎 : " + p[1]);
		if(p[2]!=0)
			System.out.println("三獎 : " + p[2]);
		if(p[3]!=0)
			System.out.println("四獎 : " + p[3]);
		if(p[4]!=0)
			System.out.println("五獎 : " + p[4]);
		if(p[5]!=0)
			System.out.println("六獎 : " + p[5]);
		System.out.println("共得 " + (coco+p[0]*200000+p[1]*40000+p[2]*10000+p[3]*4000+p[4]*1000+p[5]*200) + " 元");
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入特獎號碼 : ");
		int specailAward = scn.nextInt();
		
		System.out.print("輸入頭獎號碼 : ");
		String price[] = new String[3];
		for(int i=0;i<3;i++) 
			price[i] = scn.next();
		
		System.out.print("輸入有幾張發票 n : ");
		int num = scn.nextInt();
		
		String userPrice[] = new String[num];
		System.out.println("依序輸入 n 張發票 : ");
		for(int i=0;i<num;i++) 
			userPrice[i] = scn.next();
		
		int money=0,speAwardCount=0;
		for(int i=0;i<num;i++) {
			if(Integer.parseInt(userPrice[i])==specailAward) {
				System.out.println("特獎 : 1");
				money+=2000000;
			}
		}
		compareAward(price,userPrice,money);
	}
}
