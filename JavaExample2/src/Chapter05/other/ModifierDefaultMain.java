package Chapter05.other;

//import Chapter05.ModifierDefault;

public class ModifierDefaultMain {

	public static void main(String[] args) {

//		ModifierDefault mp = new ModifierDefault();
//		
//		mp.name = "JYLEE";
//		mp.age = 26;
//		
//		mp.tell();
		

		
		System.out.println(count("12345AB6789AB23AB","AB"));
		System.out.println(count("12345","AB"));
	}
	
	public static int count(String str, String target) {
		int count = 0;
		int pos = 0;
		
	
			if(str.indexOf(target,pos)>0) {
				count++;
			}

		
		return count;
	}

}
