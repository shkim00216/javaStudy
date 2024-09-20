package javaStudy.part13.exam03;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {

	public static void main(String[] args) {
		try (
			DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
		) {
			out.writeInt(100); //정수값으로 저장 4Byte
			out.writeBoolean(true); //boolean 값으로 저장 1Byte
			out.writeDouble(50.5); //double 값으로 저장 8Byte
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
