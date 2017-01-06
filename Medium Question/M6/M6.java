import java.util.Scanner;
public class M6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入距離(公尺) : ");
		int Ahour=0,Amin=0,Asec=0,Bsec=0,mDis = scn.nextInt();
		while(true) {
			Asec++;
			Bsec++;
			if(Asec>mDis-((Bsec*30*2.54)/100))  //如果(A秒數*A一秒走的距離)>(全部距離減去B秒數*B一秒走的距離) 
				break;   //表示已經遇見 結束迴圈
		}
		Amin=Asec/60;
		Ahour=Amin/60;
		Asec=Asec%60;
		
		String Ans="";
		if(Ahour!=0)
			Ans += Ahour+" 小時 ";
		if(Amin!=0)
			Ans += Amin+" 分 ";
		if(Asec!=0)
			Ans += Asec+" 秒 ";
		System.out.print("兩人在 "+Ans+"會相遇。");
	} 
}
