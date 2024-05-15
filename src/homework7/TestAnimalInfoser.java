package homework7;

import java.io.*;

public class TestAnimalInfoser {

	public static void main(String[] args) throws EOFException {
		File file = new File("C:\\data\\Object.ser");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			System.out.println(file.getName() + "檔案內容如下: ");
			System.out.println("-------------------------");

			while (true) { // 強制轉型成Dog Cat類別型別做speak()注意 readObject()沒辦法聰明到自動區分class要想辦法解決
							//設定Dog Cat 都繼承自Animal使用多型操作可以節省一堆判斷
				((Animal) ois.readObject()).speak();

				System.out.println("------------------");
//				Object obj = ois.readObject(); 比較囉嗦的寫法，而且不知道為甚麼只能各類別印出一項而不是各兩項
//				if( obj instanceof Dog) {
//					((Dog) obj).speak();
//				}else if(obj instanceof Cat) {
//					((Cat) obj).speak();
//				}
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("資料讀取完畢");
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("無法關閉資源釋放!");
			}
		}
	}
}
