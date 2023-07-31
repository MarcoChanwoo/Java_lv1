import java.util.Scanner;
public class day08_조건문4_ATM_Lv1 {
    
//	if문의 구조
	/*
	 * # if문의 구조 3가지
	 * 1.
	 * if(조건식){
	 * 		조건식이 참(true)일 때 실행할 문장;
	 * }
	 * 
	 * 2. 
	 * if(조건식){
	 * 		조건식이 참(true)일 때 실행할 문장;
	 * }else{
	 * 		조건식이 거짓(false)일 때 실행할 문장;
	 * }
	 * 
	 * 3. 
	 * if(조건식1){
	 * 		조건식1이 참(true)일 때 실행할 문장;
	 * }else if(조건식2){
	 * 		조건식2가 참(true)일 때 실행할 문장;
	 * }else if(조건식3){
	 * 		조건식3이 참(true)일 때 실행할 문장;
	 * }else{
	 * 		위 조건을 모두 만족하지 않을 때 실행할 문장;
	 * }
	 */
	
//		예) 홀짝
//	int num = 11;
//	if(num %2 == 0) {
//		System.out.println("짝수");
//	}
//	if(num %2 == 1) {
//		System.out.println("홀수");
//	}
//	System.out.println("-------------------------");
//	/*
//	 * 실행할 문장이 1문장인 경우에 {}블럭을 생략할 수 있다.
//	 * ※ 권장되지 않음
//	 */
//	if(num %2 == 0)
//		System.out.println("짝수");
//	if(num %2 == 1)
//		System.out.println("홀수");
//	System.out.println("-------------------------");
//	
////		===========================================
//	System.out.println("1. 과자 2. 음료수 3. 라면");
//	int select = 2;
//	if(select == 1) {System.out.println("과자");}
//	if(select == 2) {System.out.println("음료수");}
//	if(select == 3) {System.out.println("라면");}
//	else {System.out.println("오류1");} // if만 사용할 경우 여기가 출력됨
//	// else는 if 한개만 연결되기 때문에
//	// 마지막의 if문에 종속되는 개념
////		===========================================
//	System.out.println("1.사과 2.포도 3.감");
//	select = 4;
//	if(select == 1) {System.out.println("사과");}
//	else if(select == 2){System.out.println("포도");}
//	else if(select == 3){System.out.println("감");}
//	else {System.out.println("오류");}
	
    public static void main(String[] args) {
        
		/*
		 * # ATM[1단계] : 이체하기
		 * 1. 이체할 계좌번호를 입력받는다.
		 * 2. 계좌번호가 일치하면
		 * 3. 이체할 금액을 입력받는다.
		 * 4. 이체할 금액 <= myMoney : 이체가능
		 * 				myMoney		- 이체할 금액
		 * 			yourMoney		+ 이체할 금액
		 * 		이체할 금액 > myMoney	: 이체불가
		 */
		Scanner scan = new Scanner(System.in); // 계좌 및 이체 금액을 콘솔창에 입력받음.

		int myAcc = 1234;
		int myMoney = 8700;

		int yourAcc = 4321;
		int yourMoney = 12000;

		int inputCash = 0; // 이체할 금액을 콘솔창에 입력받음
		int sendAcc = 0; // 이체할 계좌번호 입력
		int inputAcc = 0;

		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
		// 깔끔하게 다시 정리해보기

		// 1. 본인 계좌 입력
		System.out.println("계좌를 입력하세요>");
		inputAcc = scan.nextInt();
		System.out.println("상대 계좌를 입력하세요>");
		sendAcc = scan.nextInt();
		
		
		// 내 계좌가 정확해야 이체가 진행됨
		// 입력한 계좌번호가 내 계좌번호로 확인 && 보낼 계좌 번호 == yourMoney로 동일할 때
		if (inputAcc == myAcc && sendAcc == yourAcc) {
			System.out.println("이체를 진행합니다. 금액을 입력하세요>");
			inputCash = scan.nextInt();
			// 보낼 금액이 내 잔액보다 적다면
			if (inputCash <= myMoney) {
				System.out.println("이체가 완료되었습니다!");
				myMoney = myMoney - inputCash;
				yourMoney = yourMoney + inputCash;
				System.out.println("내 계좌의 잔액: " + myMoney + "원");
				System.out.println("상대 계좌의 잔액: " + yourMoney + "원");
			} else { // 이체금액이 내 잔액보다 많다면
				System.out.println("이체불가(한도초과)");
			}
		} else if (inputAcc != myAcc) { // 입력계좌 != 내계좌
			System.out.println("입력하신 계좌는 존재하지 않습니다.");
		} else { // 상대계좌가 정확하지 않을 때
			System.out.println("존재하지 않는 상대계좌입니다.");
		}
		
		
		
		
////		1. 본인 계좌번호를 입력한다.
//		System.out.println("계좌번호를 입력하세요.");
//
//		int inputAcc = scan.nextInt(); // 입력할 계좌번호
//		if (inputAcc == myAcc) { // 만약 입력한 계좌번호와 내 계좌번호가 같다면
////		2. 올바른 본인 계좌번호가 입력된다면 이체할 계좌를 조회한다.
//			if (inputAcc == myAcc) { // 입력한 계좌 정보가 올바르다면
//				System.out.println("이체할 계좌번호를 입력하세요");
//				sendAcc = scan.nextInt(); // 상대 계좌 입력
//				if (sendAcc == yourAcc) { // 보낼 계좌와 상대 계좌번호가 동일하다면
//					System.out.println("이체할 금액을 입력하세요>"); // 이체작업 진행
//					inputCash = scan.nextInt();
//					if (inputCash >= myMoney) { // 이체 금액이 내 계좌한도 내에서 불가하다면
//						System.out.println("잔액이 부족합니다..");
//					} else { // 이체가 가능하다면 진행 후 아래와 같이 메시지 안내.
//						System.out.println(inputCash + "원 이체를 진행합니다.");
//						myMoney = myMoney - inputCash; // 이체 후 내 계좌
//						yourMoney = yourMoney + inputCash; // 이체 후 상대 계좌
//						System.out.println("이체가 완료되었습니다!");
//						System.out.println("내 계좌의 잔액은 " + myMoney + "원 입니다.");
//						System.out.println("상대 계좌의 잔액은 " + yourMoney + "원 입니다.");
//					}
//				} else {
//					System.out.println("해당 계좌는 존재하지 않습니다.");
//				}
//			}
//
//		} else {
//			System.out.println("올바르지 않은 계좌번호입니다.");
//		}
    }
}
