package Chapter11;

import java.util.*;

public class MyClass<T> {
	
	// 변수, 메소드의 반환타입, 매개변수의 타입
	T val;
	
	public MyClass() {
		super();
	}
	
	public MyClass(T val) {
		super();
		this.val = val;
	}
	
	T getVal() {
		return val;
	}
	void setVal(T val){
		this.val =  val;
	};
	
	public static void main(String[] args) {
		
		MyClass<String> myClass = new MyClass<String>("1");
		myClass.setVal("KING"); // String 타입의 데이터만 가능 
//		myClass.setVal(new Date()); // String 타입의 데이터만 가능 
		System.out.println(myClass.getVal());
		
	}

}
