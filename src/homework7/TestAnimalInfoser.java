package homework7;

import java.io.*;

public class TestAnimalInfoser {

    public static void main(String[] args) throws EOFException {
        File file = new File("Object.ser");

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(file.getName() + "檔案內容如下: ");
        System.out.println("-------------------------");
        try {
            while (true) {  //還沒寫出讀到dogs cats的方法
                ((dogs) ois.readObject()).show;
                ((cats) ois.readObject()).show;
                System.out.println("------------------");
            }

        } catch (EOFException e) {
            // TODO: handle exception
            System.out.println("資料讀取完畢");
        }
        ois.close();
        fis.close();
    }
}
