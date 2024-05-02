package homework4;
import java.util.Scanner;

public class StringTestRev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一個字串：");
        String input = scanner.nextLine();

        // 使用 StringBuilder 反轉字串
        StringBuilder reversed = new StringBuilder(input).reverse();

        System.out.println("反轉後的字串：" + reversed);
    }
}

