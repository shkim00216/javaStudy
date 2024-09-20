package javaStudy.part13.exam01;

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
			
			int readData = -1;
			while ((readData = fis.read()) != -1) {
				fos.write(readData);
			} //read() 메서드가 byte를 리턴한다면 끝을 나타내는 값을 표현할 수 없기 때문에 int 리턴, 음수의 경우 맨 좌측 비트가 1이 되며, 읽어들일 것이 있다면 항상 양수를 리턴함
			
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
		System.out.println(endTime - startTime); //7
	}
	//1byte씩 읽는 경우 나머지 511byte를 버리게 됨
}
