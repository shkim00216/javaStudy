package javaStudy.part13.exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteExam1 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); //메서드 시작 시간 구함
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/javaStudy/part13/exam01/ByteExam1.java");
			fos = new FileOutputStream("byte.txt");
			
			int readCount = -1;
			byte[] buffer = new byte[512];
			while ((readCount = fis.read(buffer)) != -1) {
				fos.write(buffer,0,readCount);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
	//1byte씩 읽는 경우 나머지 511byte를 버리게 됨 -> 512Byte만큼 읽어들이게 함으로써 성능 향상
}
