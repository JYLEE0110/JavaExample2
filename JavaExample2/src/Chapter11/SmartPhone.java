package Chapter11;

import java.util.*;

public class SmartPhone implements Comparable<SmartPhone> {

	private String name;
	private String phoneNumber;

	public SmartPhone(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "SmartPhone [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

	@Override
	public int hashCode() {
		return this.phoneNumber.charAt(phoneNumber.length() - 1 % 5);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;

		if (obj != null && obj instanceof SmartPhone p) {
			p = (SmartPhone) obj;
			result = phoneNumber.equals(p.getPhoneNumber());
		}

		return result;
	}

	@Override
	public int compareTo(SmartPhone o) {
		return name.compareTo(o.getName());
	}

//	public static void main(String[] args) {
//
//		Set<SmartPhone> phones = new HashSet<SmartPhone>();
//
//		phones.add(new SmartPhone("손흥민", "010-1234-5678"));
//		phones.add(new SmartPhone("박지성", "010-3333-7777"));
//		phones.add(new SmartPhone("이강인", "010-1234-5678"));
//
//		for (SmartPhone sp : phones) {
//			System.out.println(sp);
//		}
//
//	}

}
