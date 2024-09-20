package javaStudy.part13.exam06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharIOExam02 {

	public static void main(String[] args) {
		BufferedReader br = null; //한 줄 읽어 들이기 위해서 BufferedReader 클래스 이용
		PrintWriter pw = null; //편리하게 출력하기 위해서 PrintWriter 클래스 이용
				
		try {
			br = new BufferedReader(new FileReader("src/javaStudy/part13/exam06/CharIOExam02.java")); //예외 처리
			pw = new PrintWriter(new FileWriter("test.txt")); //filewriter 없이 printwriter만으로도 사용 가능
			
			String line = null;
			
			while ((line = br.readLine()) != null) {
				pw.println(line);
			} //readLine()메소드는 읽어낼 때 더 이상 읽어 들일 내용이 없을 때 null을 리턴
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
