package homework7;

/* 
請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。
呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案
*/
import java.util.Scanner;
import java.io.*;

public class CopyFile {

    public static void copyFile(String sourceFile, String destFile) {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(new File(sourceFile)); // 想要複製的檔案路徑用String
            os = new FileOutputStream(new File(destFile)); // 複製到目的地的檔案路徑用String
            byte[] buffer = new byte[4096]; // 用bytr[]儲存位元組
            int length;
            while ((length = is.read(buffer)) != -1) { // 當buffer讀完之前繼續執行
                os.write(buffer, 0, length);
                os.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入想複製的檔案路徑：");
        String sourceFile = sc.next();
        System.out.println("請輸入想要的目的檔案：");
        String destFile = sc.next();
        CopyFile file = new CopyFile();
        file.copyFile(sourceFile, destFile);
        sc.close();
    }
}