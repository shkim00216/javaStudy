package javaStudy.part11.exam01;

public class Box<E> {
	private E obj;
	
	public void setObj(E obj) {
		this.obj = obj;
	}
	
	public E getObj() {
		return obj;
	}
	//Object -> E로 변경(제너릭 사용, 가상 타입 선언)
}
