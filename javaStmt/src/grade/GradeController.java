package grade;

import java.util.Scanner;

public class GradeController {
	public static void main(String[] arservice) {
		Scanner scanner = new Scanner(System.in);
		GradeServiceImpl service = new GradeServiceImpl();
		
		while (true) {
			System.out.println("[메뉴] 1.등록 2.수정 3.삭제 4.조회(전체) 5.조회(이름) 6.조회(학번) 7.회원수 0.종료");
			
			switch (scanner.nextInt()) {
			case 1: 
				service.input(); 
				break;
			case 2:	
				service.update(); 
				break;
			case 3:	
				service.delete(); 
				break;
			case 4:	
				service.getCount(); 
				break;
			case 5:	
				service.getGradeByName(); 
				break;
			case 6:	
				service.getGradeByHak(); 
				break;
			case 7:	
				service.getCountByName(); 
				break;
			case 0: 
				System.out.println("종료");
				return;

			default: 
				System.out.println("잘못입력");
				return;
			}
			
		}
		
	}
}
