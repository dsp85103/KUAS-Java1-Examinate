//新增對話說明
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class E17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int count=0;
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		while(true) {
			System.out.print("請輸入個數(2<=N<=100)(0值為\"結束\") : ");
			int num = scn.nextInt();
			if(num==0) {//輸入0>>停止
				System.out.println("判斷結束!!");
				for(int i=0;i<count;i++)
					System.out.println("第 "+(i+1)+" 個陣列最小間距為 " +arrList.get(i));
				break;
			} else if(num>=2 && num<=100) {
				System.out.print("數字範圍正確 請輸入num : ");
				int arr[] = new int[num];
				for(int i=0;i<arr.length;i++) {
					int tmpNum = scn.nextInt();
					if(tmpNum>0 && tmpNum<1000) {
						arr[i] = tmpNum;
					} else {
						System.out.print(tmpNum + " 錯誤範圍(0<N<1000)，請重新輸入 : ");
						i--;
					}
				}
				int arrCopy[] =  Arrays.copyOf(arr, arr.length);
				Boolean repeat = false;
				Arrays.sort(arrCopy);
				for(int k=0;k<arrCopy.length-1;k++) {
					if(arrCopy[k+1]==arrCopy[k]) {
						System.out.println(arrCopy[k+1] + "," +arrCopy[k] +" 數字重複,重新輸入陣列");
						repeat=true;
						break;
					}
				}
				if(repeat==false) {
					int min=arr[1]-arr[0];
					for(int i=0;i<arr.length-1;i++) 
						if(Math.abs(arr[i+1]-arr[i])<min) min=Math.abs(arr[i+1]-arr[i]);
					arrList.add(count++,min);
				}
			} else {
				System.out.println("錯誤範圍，請重新輸入!!"); }
      } 
   } 
}
