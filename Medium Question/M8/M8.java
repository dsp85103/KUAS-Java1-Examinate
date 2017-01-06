import java.util.Scanner;
public class M8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("輸入身分證字號 : ");
        String id = scn.nextLine();
        int authValue=0;
		String x[] = {"A","B","C","D","E","F","G","H","J","K","L","M","N","P","Q","R","S","T","U","V","X","Y","W","Z","I","O"};
        String y[] = {"10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35"};
        if(!id.substring(1, 2).equals("1") && !id.substring(1, 2).equals("2")){
			System.out.println("此身分證字號為 假!");
		}else{
			for(int i=0;i<x.length;i++) {
				if(id.substring(0,1).equals(x[i])) {
					id = id.replace(x[i],y[i]);
					break;
				}
			}
			for(int i=0;i<11;i++) {
				if(i==0 || i==10) 
					authValue += (int)id.charAt(i)-48;
				else
					authValue += ((int)id.charAt(i)-48)*(10-i);
			}
			if(authValue%10==0) 
				System.out.println("此身分證號碼為 真!");
			else
				System.out.println("此身分證字號為 假!");
		}
    }
}
