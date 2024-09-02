package javaStudy.part05.exam08;

public class EnumExam {
	
	public static final String MALE = "MALE"; //상수 선언 시 대문자
	public static final String FEMALE = "FEMALE";

	public static void main(String[] args) {
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy";
		
		Gender gender2;
		
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender2 = "boy"; //컴파일 오류
	}

}

enum Gender {
	MALE, FEMALE;
} //열거형