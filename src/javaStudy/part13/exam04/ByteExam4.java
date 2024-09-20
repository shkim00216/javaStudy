package javaStudy.part13.exam04;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteExam4 {

	public static void main(String[] args) {
		try (
				DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));
				) {
			
			//파일에 저장된 순서대로 읽어 들여야 함
			int i = in.readInt(); //정수를 읽어들이는 메서드
			boolean b = in.readBoolean(); //boolean 값을 읽어들이는 메서드
			double d = in.readDouble(); //double 값을 읽어들이는 메서드
			
			System.out.println(i);
			System.out.println(b);
			System.out.println(d);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
