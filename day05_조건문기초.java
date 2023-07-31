public class day05_조건문기초 {
    /*
	 * # 조건문 if
	 * 
	 * 1) if ==> 키워드
	 * 2) (조건식) ==> 조건이 사실이면 기능 실행
	 * 3) {기능} ==> 기능 실행
	 * 
	 * if(조건식){
	 * 		조건식이 참(true)일 때 실행할 문장;
	 * }
	 * 
	 */
    public static void main(String[] args) {
        
//		int a = 10;
//		int b = 10;
//		if(a == b) {
//			System.out.println("실행 O");
//		}
//		if(a != b) {
//			System.out.println("실행 X");
//		}
//		
//		// 예) 홀짝
//		int num = 8;
//		System.out.println(num%2==0);	// 8은 짝수이므로 true
//		System.out.println(num%2==1);	// false
//		
//		if(num%2==0) {
//			System.out.println("짝수");
//		}
//		if(num%2==1) {
//			System.out.println("홀수");
//		}
		
		// 조건문 문제
		int a = 10;
		int b = 10;
		if(a == b) {
			System.out.println("실행 O");
		}
		if(a != b) {
			System.out.println("실행 X");
		}
		
		// 문제 1) 양수, 0, 음수 출력
		int num1 = -90;
		if (num1 > 0) {
			System.out.println(num1 + "은 양수 입니다.");
		}
		if (num1 == 0) {
			System.out.println(num1 + "은 0 입니다.");
		}
		if (num1 < 0) {
			System.out.println(num1 + "은 음수입니다.");
		}

		// 문제 2) 4의 배수 여부 출력
		int num2 = 12;
		if (num2 % 4 == 0) {
			System.out.println(num2 + "는 4의 배수입니다.");
		}
		if (num2 % 4 != 0) {
			System.out.println(num2 + "는 4의 배수가 아닙니다.");
		}

		// 문제 3) 합격, 불합격 출력
		// 합격 기준점수는 75점 이상일 때
		int score = 74;
		if (score >= 75) {
			System.out.println("합격입니다.");
		}
		if (score < 75) {
			System.out.println("불합격입니다.");
		}
    }
}
