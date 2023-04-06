//package Chapter11;
//
//import Chapter05.phone.SmartPhone;
//import Chapter07.Phone;
//
//public class GenericMethodByType3 {
//
//	public void introduce(MyClass<? super SmartPhone> t) {
//		System.out.println("안녕하세요 " + t.toString());
//	}
//
//	public static void main(String[] args) {
//		GenericMethodByType3 byType = new GenericMethodByType3();
//		
//		MyClass<Phone> class1 = new MyClass<Phone>();
//		
//		byType.setVal(new SmartPhone());
//	}
//
//}
