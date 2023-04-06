package Chapter11;

public class MyInterFaceImpl<T1, T2> implements MyInterface<T1, T2> {
	
	public MyInterFaceImpl() {
		super();
	}
	
	@Override
	public T1 method1(T1 t) {
		return t;
	}
	
	public T2 method2(T2 t) {
		return t;
	}

}
