package homework7;

import java.util.random.*;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class NumToData {
    public static void main(String[] args) {
        try {

            FileOutputStream fos = new FileOutputStream("C:\\TIA102_Workspace\\TIA10221-Homework\\Data.txt", true);

            BufferedOutputStream bos = new BufferedOutputStream(fos);

            PrintStream ps = new PrintStream(bos);

            StringBuffer sbuf = new StringBuffer();
            for (int i = 0; i < 10; i++) {
                int num = (int) (Math.random() * 1000) + 1;
                ps.print(num + ", ");
                sbuf.append(num);
                if (i == 9) {
                    ps.println("此次產生亂數如上↑");
                }
            }

            ps.close();
            bos.close();
            fos.close();
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

}