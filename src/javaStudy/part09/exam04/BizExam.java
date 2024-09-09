package javaStudy.part09.exam04;

public class BizExam {

	public static void main(String[] args) {
		BizService biz = new BizService();
		biz.bizMethod(5); //오류없이 실행
		try {
		biz.bizMethod(-3);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
