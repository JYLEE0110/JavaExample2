package controller;

import java.util.List;

import dao.DeptDao;
import domain.Dept;
import service.DeptListService;

// Controller 클래스는 
// 사용자의 요청분석 => 사용자의 요청을 처리할 Service를 결정하고 
// 요청의 결과를 받아서 사용자에게 결과를 보여주는 역할

public class DeptListController implements Controller {

	DeptListService listService;
	
	
	private DeptListController() {
		this.listService = DeptListService.getInstance();
	}
	private static DeptListController controller = new DeptListController();
	public static DeptListController getInstance() {
		return controller;
	}

	public void process() {
		
		// 사용자 요청 분석
		// 요청을 처리할 서비스를 이용해서 결과 데이터를 받는다.
		List<Dept> result = listService.getDeptList();
		// 사용자에게 응답할 포맷(Template, View) 결정 -> 결과 데이터를 전달(공유)
		printData(result);

	}
	
	void printData(List<Dept> list) {
		System.out.printf("%26s","부서리스트");
		System.out.println();
		System.out.println("==============================================");
		System.out.printf("%10s \t%10s \t%10s\n","부서번호","부서이름","부서위치");
		System.out.println("==============================================");
		for(Dept d : list) {
			System.out.printf("%10d \t%12s \t%12s\n",d.getDeptno(),d.getDname(),d.getLoc());
		}
		System.out.println("==============================================");
	}
	
	//Test
	public static void main(String[] args) {
		DeptListController listController = new DeptListController();
		
		listController.process();
	}

}
