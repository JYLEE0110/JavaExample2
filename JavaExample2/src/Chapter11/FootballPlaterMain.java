package Chapter11;

import java.util.*;

public class FootballPlaterMain {

	public static void main(String[] args) {

		// 나의 팀을 구성하고 싶다. -> 선수들을 저장할 수 있는 공간을 생성하고 선수들을 저장

		List<FootballPlayer> list = new ArrayList<FootballPlayer>(); 

		String name;
		int number;
		String team;
		int age;

		Scanner scan = new Scanner(System.in);

		System.out.println("3명의 선수 이름의 정보를 입력해 주세요.\n");
		for (int i = 0; i < 3; i++) {
			System.out.print("name > ");
			name = scan.nextLine();

			System.out.print("number > ");
			number = scan.nextInt();

			scan.nextLine();

			System.out.print("team > ");
			team = scan.nextLine();

			System.out.print("age > ");
			age = scan.nextInt();

			scan.nextLine();

			// 인스턴스를 생성하고 equals를 비교하여 add를 안하는건지
			// 인스터스 생성전에 입력값을 비교하여 생성을 아예 안하게 하는건지

			list.add(new FootballPlayer(name, number, team, age));
			System.out.println("-------------");
		}

		System.out.println();
		System.out.println("name\tnum\tteam\tage");
		System.out.println("----------------------------");
		for (FootballPlayer player : list) {
			System.out.println(player);
		}
		
		list.stream().forEach((FootballPlayer p) -> p.showInfo()); // 람다식(익명함수)
		list.stream().forEach(System.out :: println); // toString 참조 값 출력

	}

}
