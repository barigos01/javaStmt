package member;

import java.util.Scanner;

public class MemberController {
	public static void main(String[] args) {
		MemberService service = new MemberServiceImpl();
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.println("[메뉴] 1.회원가입 2.로그인 3.본인정보보기 4.본인정보수정 5.회원탈퇴 0.종료");

			switch (s.nextInt()) {
			case 1:	
				System.out.println("아이디, 비밀번호, 이름, 생년월일, 주소 입력");
				service.join(new MemberBean(s.next(), s.next(), s.next(), s.nextInt(), s.next()));
				break;
			case 2:	
				System.out.println("아이디, 비밀번호 입력");
				System.out.println(service.login(s.next(), s.next()));
				break;
			case 3:	
				System.out.println("아이디 입력");
				String id = s.next();
				if (service.detail(id) == null) {
					System.out.println("회원정보가 존재하지 않음");
				} else {
					System.out.println(service.detail(id));
				}
				break;
			case 4:	
				System.out.println("수정하려는 아이디, 비밀번호, 이름, 생년월일, 주소를 입력하세요");
				id = s.next();
				System.out.println(service.update(new MemberBean(id, s.next(), s.next(), s.nextInt(), s.next())));
				break;
			case 5:	
				System.out.println("아이디 입력");
				System.out.println(service.remove(s.next()));
				break;
			case 0:	
				System.out.println("시스템 종료");
				return;

			default:
				System.out.println("잘못입력");
				return;
			}
		}
	}
}
