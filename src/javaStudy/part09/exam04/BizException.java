package javaStudy.part09.exam04;

public class BizException extends RuntimeException {
	public BizException (String msg) {
		super(msg);
	}
	
	public BizException (Exception ex) {
		super(ex);
	}
} //RuntimeException을 상속받은 BizException객체
