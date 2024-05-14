package homework7;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadSample {
	public static void main(String[] args) {
		String filePath = "C:\\TIA102_Workspace\\TIA10221-Homework\\Sample.txt";
		try {
			FileInputStream fis = new FileInputStream(filePath); // 最低階I/O
			InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8); // 使用UTF_16答案不同?
			BufferedReader br = new BufferedReader(isr);

			int byteCount = 0; // 計算位元組
			int charCount = 0; // 計算字元數
			int lineCount = 0; // 計算行數

			String line;
			while ((line = br.readLine()) != null) {
				byteCount += line.getBytes(StandardCharsets.UTF_8).length;
				charCount += line.length();
				lineCount++;
			}

			System.out.println(filePath + "檔案共有" + byteCount + "個位元組，" + charCount + "個字元，" + lineCount + "列資料");

			br.close();
			isr.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
