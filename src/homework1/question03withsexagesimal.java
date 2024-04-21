package homework1;

public class Question03withsexagesimal {
//	請由程式算出256559秒為多少天、多少小時、多少分與多少秒
//	如果使用六十進位制寫
	public static void main(String[] args) {
		int tS,tM,tH,tD,i;
		tS=0;
		tM=0;
		tH=0;
		tD=0;
		int totalSec = 256559;
		for(i=1;i<=totalSec;i++) {
			tS=tS+1;
			while(tS==60) {
				tS-=60;
				tM+=1;
				while(tM==60) {
					tM-=60;
					tH+=1;
					while(tH==24) {
						tH-=24;
						tD+=1;
					}
				}
			}
		}
		System.out.println(totalSec+"秒為"+tD+"天"+tH+"小時"+tM+"分"+tS+"秒");
	}
}
