package homework4;

import java.util.Scanner;
/*
 * 請建立一個字串，經過程式執行後，輸入結果是反過來的
例如String s = “Hello World”，執行結果即為dlroW olleH
(提示：String方法，陣列)
 */
public class StringQuest {
	
	
	public static void main(String[] args) {
		String word;
		System.out.println("請輸入一串文字後按下Enter:");
		Scanner re = new Scanner(System.in);
		word = re.nextLine();
		StringQuest out = new StringQuest(word);
		re.close();
	}
	public StringQuest(String word) {
		
		String revword = "";
		for(int i = word.length()-1; i>=0; i--)
	    {
			revword += word.charAt(i);
	    }

	    System.out.println("反序的文字是:"+revword);
	}
	
	
}
