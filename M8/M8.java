import java.util.Scanner;
public class M8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("輸入身分證字號 : ");
        String id = scn.nextLine();
        char tmp = id.charAt(0);
        int authValue=0;
        if((int)tmp>=65 && (int)tmp<=90) { //A~Z
            if((int)tmp>=65 && (int)tmp<=72) //A~H
                authValue = ((int)tmp-55)/10 + (((int)tmp-55)%10)*9; 
            if((int)tmp>=74 && (int)tmp<=78) //J~N
                authValue = ((int)tmp-56)/10 + (((int)tmp-56)%10)*9;
            if((int)tmp>=80 && (int)tmp<=86) //P~V
                authValue = ((int)tmp-57)/10 + (((int)tmp-57)%10)*9;
            if((int)tmp>=88 && (int)tmp<=90) //X~Z
                authValue = ((int)tmp-58)/10 + (((int)tmp-58)%10)*9;
            if((int)tmp==73) authValue = ((int)tmp-39)/10 + (((int)tmp-39)%10)*9; // I
            if((int)tmp==79) authValue = ((int)tmp-44)/10 + (((int)tmp-44)%10)*9; // O
        } 
        for(int i=0;i<9;i++) {
            if(i==8) 
                authValue += (int)id.charAt(i+1)-48;
            else
                authValue += ((int)id.charAt(i+1)-48)*(8-i);
        }
        if(authValue%10==0) 
            System.out.println("此身分證號碼為 真!");
    }
}
