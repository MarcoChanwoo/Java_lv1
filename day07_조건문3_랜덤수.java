import java.util.Random;
import java.util.Scanner;
public class day07_조건문3_랜덤수 {
    // # 랜덤
	// 1) import java.util.Random; 추가
	// 2) Random ran = new Random(); 추가
	// 3) 이후 ran.nextInt(랜덤범위); ==> (0 ~ 랜덤범위-1) 중에서 하나가 나온다(공식)
	// ㄴ 0부터 범위가 시작됨을 기억할 것.

//	Random ran = new Random(); // 새로운 Random메소드 생성
	// 그럼 현재 호출스택에 main메소드->랜덤 메소드 순으로 저장되어 있는 것?
	// 예) 0 ~ 2 사이의 랜덤
//		int rNum = ran.nextInt(3);
//		System.out.println(rNum);

	// 문제1) 1 ~ 5 사이의 랜덤 숫자
//		int rNum = ran.nextInt(5)+1;
//		ㄴ 1, 2, 3, 4, 5 (total 5)
//		int rNum = ran.nextInt(5);
//		ㄴ 0, 1, 2, 3, 4 (total 5)
//		System.out.println(rNum);

	// 문제2) -3 ~ 3 사이의 랜덤(0이 포함되었으므로 6+1개)
	// 숫자의 범위를 염두
//	int rNum1 = ran.nextInt(7) - 3; // 총 7개 숫자, 0 - 3 = -3부터 7개(-3, -2, -1, 0, 1, 2, 3)
//	int rNum2 = ran.nextInt(31) - 15; // -15 ~ 15 사이의 랜덤 숫자
//	int rNum3 = ran.nextInt(11) + 2; // 총 11개 숫자, 0 + 2 = 2부터 11개 (2,3,4,5,6,7,8,9,10,11,12)
//	System.out.println("rNum1 : "+rNum1);
//	System.out.println("rNum2 : "+rNum2);
//	System.out.println("rNum3 : "+rNum3);
    public static void main(String[] args) {
        // # 코인게임
		// 1. 0 또는 1의 랜덤 숫자를 저장한다.
		// 2. 0은 동전의 앞면, 1은 동전의 뒷면.
		// 3. 동전의 앞뒷면을 맞추는 게임이다.
		// 앞면 또는 뒷면을 입력하여 맞추는 게임..

		// 랜덤 숫자를 나오게 함.
		Random ran = new Random();
		int rNum = ran.nextInt(2); // 0과 1만 나오게하게끔 설정함.
		// rNum은 랜덤으로 나온 숫자를 저장하는 변수

		Scanner scan = new Scanner(System.in);

		System.out.println("동전이 앞면인지 맞춰보세요!");
		System.out.println("[0]: 앞면이다");
		System.out.println("[1]: 뒷면이다");
		System.out.println("숫자를 입력해 맞춰보세요>");
		int num = scan.nextInt(); // 콘솔창으로 입력받은 숫자.

//		if(num == rNum) {
//			System.out.println("앞면입니다!");
//		}
//		if(num != rNum) {
//			System.out.println("뒷면입니다..");
//		}

//		1. 만약 0앞면이라고 입력했는데 맞는 경우
		if (num == 0) { // 0으로 입력 시
			if (num == rNum) { // 입력값과 같은 경우
				System.out.println("동전은 앞면입니다. 정답입니다!");
			}
			if (num != rNum) { // 입력값과 다른 경우
				System.out.println("동전은 뒷면입니다. 틀렸습니다..");
			}
		}
		if (num == 1) { // 1 입력 시
			if (num == rNum) { // 입력값과 같은 경우
				System.out.println("동전은 뒷면입니다. 맞혔습니다!");
			}
			if (num != rNum) {
				System.out.println("동전은 앞면입니다.. 틀렸습니다.");
			}
		}

		/*
		 * 의문점
		 *  1) import Jave.util.Random;을 생성한 후 Random rn = new Random();을 선언하여
		 *     int (랜덤수 변수명) = rn.nextInt();를 이용하는 것과
		 *     
		 *  2) 그냥 
		 *     int (랜덤수 변수명) = (int)(Math.random());을 이용하는 것과 엄밀한 차이점은 무엇?
//		 *     -> Math라는 메소드(일종의 공구상자) 중에서 Random 메소드를 불러와 계산에 쓰겠다?
		 *     
		 *  내생각: Random 변수를 선언하여 필요 시 신속하게 변수명을 생성하게 하기 위함?
		 */
    }
}
