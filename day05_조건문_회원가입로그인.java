import java.util.Scanner;
public class day05_조건문_회원가입로그인 {
    // # 로그인 2단계
	// 1. Id와 Pw를 입력받아 회원가입을 진행한다.
	// 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
	// 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
	// 예) 로그인 성공 or 로그인 실패
    public static void main(String[] args) {
        int dbId = 0; // 회원가입 시 입력할 Id
		int dbPw = 0; // 회원가입 시 입력할 Pw

		// 1. Id와 Pw를 입력받아 가입 진행
		Scanner scan = new Scanner(System.in); // 입력을 위해 Scanner() 호출
		System.out.println("<회원가입>");
		System.out.println("Id를 작성하세요(네자리 숫자)");
		dbId = scan.nextInt(); // 콘솔창에 Id를 입력받아 dbId에 저장함.
		System.out.println("Pw를 작성하세요(네자리 숫자)");
		dbPw = scan.nextInt(); // 콘솔창에 Pw를 입력받아 dbPw에 저장함.
		System.out.println("가입 완료");
		System.out.println();

		// 2. 로그인을 위한 id와 pw 재입력
		System.out.println("<로그인>");
		System.out.println("Id를 입력하세요>");
		int id = scan.nextInt(); // 로그인시의 id를 저장
		System.out.println("Pw를 입력하세요>");
		int pw = scan.nextInt(); // 로그인시의 pw를 저장

		// 판정
		// 성공: 아이디-정확 & 비번-정확
		if (id == dbId && pw == dbPw) {
			System.out.println("로그인 성공");
		}
		// 실패1: 아이디-정확 & 비번-오류
		if (id == dbId && pw != dbPw) {
			System.out.println("로그인 실패 - 비밀번호 오류");
		}
		// 실패2: 아이디-오류 & 비번-정확
		if (id != dbId && pw == dbPw) {
			System.out.println("로그인 실패 - 아이디 오류");
		}
		// 실패3: 아이디-오류, 비번-오류
		if (id != dbId && pw != dbPw) {
			System.out.println("로그인 실패 - 아이디, 비밀번호 오류");
		}
    }
}
