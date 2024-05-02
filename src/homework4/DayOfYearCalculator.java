package homework4;
import java.util.Scanner;
/*
 * 這個是Copilot寫出來的
 * 可以順利執行
 * 我大破房ㄚㄚㄚㄚㄚㄚㄚ
 * 我的三小時ㄚㄚㄚ ㄚㄚ
 */
public class DayOfYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入年份：");
        int year = scanner.nextInt();

        System.out.print("請輸入月份：");
        int month = scanner.nextInt();

        System.out.print("請輸入日期：");
        int day = scanner.nextInt();

        if (isValidDate(year, month, day)) {
            int dayOfYear = calculateDayOfYear(year, month, day);
            System.out.println("該日期在該年度的第 " + dayOfYear + " 日。");
        } else {
            System.out.println("輸入的日期無效。");
        }
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        return day <= daysInMonth[month];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int calculateDayOfYear(int year, int month, int day) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        int dayOfYear = 0;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += day;

        return dayOfYear;
    }
}

