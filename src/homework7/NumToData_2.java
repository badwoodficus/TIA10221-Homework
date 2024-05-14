package homework7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class NumToData_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        try (FileWriter file = new FileWriter("C:\\TIA102_Workspace\\TIA10221-Homework\\Data.txt", true)) {
            for (int i = 0; i < 10; i++) {
                int num = rand.nextInt(1000) + 1;
                file.write(num + "\\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
