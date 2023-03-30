package Chapter06;

public class Member {

	int memberNo;
	String memberId;
	String memberName;

	public Member(int memberNo, String memberId, String memberName) {
		super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override // 원어테이션 부모클래스에 없는 함수를 오버라이딩 할시 오류 메시지 if 안붙여줄 시 오류 메세지 출력 X
	public String toString() {

		return memberNo + "." + memberId + memberName;
	}

}
