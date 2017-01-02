import java.util.Scanner;
public class M8 {
     public static String compare(int x) {
        if(x>45) return " A ";
        if(x>=35 && x<=44) return " B ";
        if(x>=25 && x<=34) return " 板凳 ";
        return " 萬年板凳 ";
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("輸入籃球員人數(1~10) : ");
        int people[][] = new int[scn.nextInt()][5];
        for(int i=0;i<people.length;i++) {
            System.out.print("籃球員 "+(i+1)+" (得分、助攻、籃板、抄截、失誤): ");
            for(int j=0;j<5;j++) 
                people[i][j] = scn.nextInt();
        }
        for(int i=0;i<people.length;i++) 
            System.out.println("籃球員 "+(i+1)+" : "+compare((people[i][0]+people[i][1]*2+people[i][2]*2+people[i][3]*2)-people[i][4]*2)+" 級球員");
    }
}
