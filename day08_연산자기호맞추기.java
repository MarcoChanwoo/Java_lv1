import java.util.Random;
import java.util.Scanner;
public class day08_연산자기호맞추기 {
    /*
	 * # 연산자 기호 맞추기 게임
	 * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
	 * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
	 * 3. 위 숫자는 연산자 기호에 해당된다.
	 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
	 * 4. 사용자는 연산자 기호를 맞추는 게임이다.
	 * 예) 3 ? 4  = 7
	 *    1) + 2) - 3) * 4) %
	 *    정답 : 1번
	 *    
	 *    두 숫자를 랜덤으로 추출
	 *    3 9
	 *    
	 *    조건1) 내가 미리 두 랜덤 수를 연산해야 한다.
	 *    조건2) 랜덤수 두개를 뽑아 랜덤으로 연산을 시키고 출력시킴
	 *    조건3) 그걸 보고 맞는 연산자를 찾게 하기
	 *    조건4) 두 랜덤수를 연산시킬 연산자도 랜덤으로 뽑음
	 *    조건5) 참 개떡같다
	 */
    public static void main(String[] args) {
        // 1. 랜덤 수 두개 뽑기
		Random ran = new Random();
		int rN1 = ran.nextInt(10) + 1; // 랜덤숫자1
		int rN2 = ran.nextInt(10) + 1; // 랜덤숫자2
		int opt = ran.nextInt(4) + 1; // 연산자

		int result = 0; // 두 랜덤수를 연산한 결과

		if (opt == 1) {
			result = rN1 + rN2;
		}
		if (opt == 2) {
			result = rN1 - rN2;
		}
		if (opt == 3) {
			result = rN1 * rN2;
		}
		if (opt == 4) {
			result = rN1 % rN2;
		}
		System.out.println("?는 무엇일까요?>");
		System.out.println(rN1 + " ? " + rN2 + " = " + result);
		System.out.println("1) + 2) - 3) * 4) %");

		Scanner scan = new Scanner(System.in);
		System.out.println("정답> ");
		int sol = scan.nextInt();

		if (sol == opt) {
			System.out.println("정답");
		} else {
			System.out.println("오답. 정답은 " + opt);
		}
		
    }
}
