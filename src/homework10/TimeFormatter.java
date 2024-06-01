package homework10;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入日期(格式:YYYYMMDD):");
        String input = scanner.nextLine();

        // 驗證輸入
        if (!input.matches("\\d{8}")) {
            System.out.println("輸入的日期格式不正確");
            return;
        }

        try {
            // 轉換輸入的日期
            Date date = new SimpleDateFormat("yyyyMMdd").parse(input);

            System.out.println("選擇輸出格式: 1)年/月/日 2)月/日/年 3)日/月/年");
            int choice = scanner.nextInt();

            SimpleDateFormat outputFormat;
            switch (choice) {
                case 1:
                    outputFormat = new SimpleDateFormat("yyyy/MM/dd");
                    break;
                case 2:
                    outputFormat = new SimpleDateFormat("MM/dd/yyyy");
                    break;
                case 3:
                    outputFormat = new SimpleDateFormat("dd/MM/yyyy");
                    break;
                default:
                    System.out.println("輸入的選擇不正確");
                    return;
            }

            System.out.println("轉換後的日期:" + outputFormat.format(date));

        } catch (Exception e) {
            System.out.println("日期轉換出現錯誤");
        }
    }
}
