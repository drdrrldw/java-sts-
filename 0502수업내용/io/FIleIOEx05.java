package kr.human.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleIOEx05 {
	public static void main(String[] args) {
		
		// 파일 복사
		try(FileInputStream fis = new FileInputStream("src/main/resources/chunja.txt");
			FileOutputStream fos = new FileOutputStream("test2.txt");){
			
			byte[] data = new byte[2048];
			int n = 0;
			while((n=fis.read(data))>0){	// 읽기
				fos.write(data, 0, n);
				fos.flush();
			}
			System.out.println("chunja.txt 파일을 text2.txtx로 복사완료~!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
