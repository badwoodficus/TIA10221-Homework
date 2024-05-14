package homework7;

/*請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾 */
import java.io.*;

public class AnimalOut implements Serializable {
    private static final long serialVersionUID = 48763;

    public static void main(String[] args) throws Exception {

        File file = new File("Object.ser");
        File data = new File("C:\\data");
        if (!data.exists()) {
            data.mkdir();
            System.out.println("資料夾已創建在 " + data.getAbsolutePath());
        } else {
            System.out.println("資料夾已存在在 " + data.getAbsolutePath());
        }

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog("Happy");
        dogs[1] = new Dog("Shiba");
        Cat[] cats = new Cat[2];
        cats[0] = new Cat("Kuro");
        cats[1] = new Cat("Dididididadada");
        // 輸出Output
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (int i = 0; i < dogs.length; i++) {
            oos.writeObject(dogs[i]);
        }
        for (int i = 0; i < cats.length; i++) {
            oos.writeObject(cats[i]);
        }
        System.out.println("檔案傳出!請搜尋Object.ser");
        oos.close();
        fos.close();
    }
}
