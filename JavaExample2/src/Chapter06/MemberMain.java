package Chapter06;

public class MemberMain {

	public static void main(String[] args) {

		Member[] members = new Member[5];

		members[0] = new Member(1, "cool", "시원한");
		members[1] = new Member(2, "hot", "뜨거운");
		members[2] = new Member(3, "shy", "부끄러운");
		members[3] = new Member(4, "great", "대단한");
		members[4] = new Member(5, "excellent", "훌륭한");

//		for (int i = 0; i < members.length; i++) {
////			System.out.printf("번호는 %d번, id는 %s 이름은 %s입니다. ", members[i].memberNo, members[i].memberId,members[i].memberName);
//			System.out.println(members[i]);
//			
//			System.out.println();
//		}
		
		for(Member member : members) {
			System.out.println(member);
		}
	}

}
