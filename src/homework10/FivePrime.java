package homework10;
/*請設計一隻程式，用亂數產生5個介於1～100之間的整數，
 * 而輸出結果可以判斷出這5個整數為是否為質數 (提示：Math類別)
*/
import java.util.random.*;
public class FivePrime {
	
	//判斷是否為質數的boolean
	public static boolean isPrime(int val) {
	    if (val < 2)
	        return false;

	    for (int i = 2, max = (int)Math.sqrt(val); i <= max; i++)
	        if (val % i == 0)
	            return false;

	    return true;
	}
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			int num =(int)(Math.random()*100+1);
			if(isPrime(num)) {
				System.out.println(num+"是質數");
			}else {
				System.out.println(num+"不是質數");
			}
		}
	
	}
	
}
