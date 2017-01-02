import java.util.Scanner;
public class M7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int hour=0,minute=0,firstMo=0,secondMo=0,thirdMo=0;
		System.out.print("開始停車時間 : ");
		int startHour = scn.nextInt();
		int startMinute = scn.nextInt();
		System.out.print("結束停車時間 : ");
		int endHour = scn.nextInt();
		int endMinute = scn.nextInt();
		hour=endHour-startHour;
		if(endMinute>startMinute || endMinute==startMinute)
			minute=endMinute-startMinute;
		else if(endMinute<startMinute) {
			hour--;
			minute=(60-startMinute+endMinute);
		}
		minute-=minute%30;
		minute+=hour*60;
		if(minute>120) {
			if(minute>240) {
				firstMo = 120;
				secondMo = 160;
				thirdMo = minute-240;
				System.out.print("停車費用: "+(firstMo+secondMo+(thirdMo/30*60))+" 元");
			} else if(minute>120 && minute<=240) {
				firstMo = 120;
				secondMo = minute-120;
				System.out.print("停車費用: "+(firstMo+(secondMo/30)*40)+" 元");
			}
		} else {
			firstMo = minute;
			System.out.print("停車費用: "+firstMo+" 元");
		}
	}
}
