import java.util.Scanner;
public class M6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入距離(公尺) : ");
		int Ahour=0,Amin=0,Asec=0,Bsec=0,mDis = scn.nextInt();
		while(true) {
			Asec++;
			Bsec++;
			if(Asec>mDis-((Bsec*30*2.54)/100))
				break;
		}
		while(Asec/60!=0) {
				Amin=Asec/60;
				Asec=Asec%60;
		}
		while(Amin/60!=0) {
				Ahour=Amin/60;
				Amin=Amin%60;
		}
		if(Ahour==0 && Amin==0 && Asec!=0) 
			System.out.print("兩人在 "+Asec+" 秒 會相遇。");
		if(Ahour==0 && Amin!=0 && Asec==0) 
			System.out.print("兩人在 "+Amin+" 分 會相遇。");
		if(Ahour==0 && Amin!=0 && Asec!=0)
			System.out.print("兩人在 "+Amin+" 分 "+Asec+" 秒 會相遇。");
		if(Ahour!=0 && Amin==0 && Asec==0) 
			System.out.print("兩人在 "+Ahour+" 小時 會相遇。");
		if(Ahour!=0 && Amin==0 && Asec!=0) 
			System.out.print("兩人在 "+Ahour+" 小時 "+Asec+" 秒 會相遇。");
		if(Ahour!=0 && Amin!=0 && Asec==0) 
			System.out.print("兩人在 "+Ahour+" 小時 " +Amin+" 分 會相遇。");
		if(Ahour!=0 && Amin!=0 && Asec!=0) 
			System.out.print("兩人在 "+Ahour+" 小時 "+Amin+" 分 "+Asec+" 秒 會相遇。");
	} }
