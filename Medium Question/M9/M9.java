import java.util.Scanner;
public class M9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("輸入一購物金額 : ");
        int money = scn.nextInt();
        if(money<3000) System.out.print("需付金額 : " + Math.round(0.9*money));
        if(money>=3000 && money<4000) System.out.print("需付金額 : " + Math.round(0.85*money));
        if(money>=4000 && money<6000) System.out.print("需付金額 : " + Math.round(0.8*money));
        if(money>=6000) System.out.print("需付金額 : " + Math.round(0.7*money));
        
    }
}
