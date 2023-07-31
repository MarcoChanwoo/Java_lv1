import java.util.Random;
public class day08_조건문_369_Lv1 {
    /*
	 * # 369게임[1단계] 
	 * 1. 1~50 사이의 랜덤 숫자를 저장한다. 
	 * 2. 위 수에 369의 개수가 
	 * 	1) 2개이면, 짝짝을 출력 
	 * 	2) 1개이면, 짝을 출력 
	 * 	3) 0개이면, 해당 숫자를 출력 
	 * 	예) 
	 * 	33 : 짝짝 
	 * 	16 : 짝 
	 * 	7 : 7
	 */
    public static void main(String[] args) {
        

//		3, 6, 9임을 나타는 것 -> 일단 세 수의 배수는 아님 ex) 19는 3 6 9의 배수 또는 약수가 될 수 없음.
//		숫자 내에 3 6 9가 포함만 되면 된다.
//		10의 자리에 3, 1의 자리에 3, 6, 9이면 조건 만족

//		1 ~ 50 사이의 랜덤 수 추출 - 한 개
//		Random ran = new Random();
//		int rNum = ran.nextInt(50) + 1;
//		int one = rNum % 10; // 나머지(일의 자리)
//		int decimal = rNum / 10; // 몫(십의 자리)
//		int cnt = 0; // 박수 횟수 기본 0회로 설정
		
//		위 두 변수를 rNum 숫자로 초기화 해보기
//		십의 자리: 나눈 값의 몫
//		일의 자리: 나눈 값의 나머지
//		ㄴ 아 왜 이 두개를 생각하지 못했을까... 아하
		
		// 연습
//		System.out.println(135%10); // 일의 자리
//		System.out.println(135/10); // 나눗셈. 나머지가 아닌 몫을 구함.
//		System.out.println(135%100);// 십의 자리 이하
//		System.out.println(1234%1000);
//		
//		System.out.println();
//		

//		랜덤 수 출력
//		System.out.println(rNum);

//		↓ 틀린건 아닌데 비효율적임(참고는 하자)
//		1. 십의 자리가 3으로 시작하고, 일의 자리가 369일때(조건 두개)
//		if (decimal == 3 && (one == 3 || one == 6 || one == 9)) {
////			cnt++; // 십의 자리가 3일 때 박수 1회
////			cnt++; // 일의 자리가 3 6 9 일 때 박수 1회
//			cnt += 2; // 두 조건 total
//			System.out.println("짝짝! 박수 " + cnt + "회");
////		2.	십의 자리만 3일 때
//		} else if (decimal == 3) {
//			cnt++;
//			System.out.println("짝! 박수 " + cnt + "회");
////		3.  일의 자리만 3 6 9 일 때
//		} else if (one == 3 || one == 6 || one == 9) {
//			cnt++;
//			System.out.println("짝! 박수 " + cnt + "회");
////		4.  일반 숫자일 때
//		} else {
//			System.out.println("일반 숫자");
//		}
		
		
//		조건 두개 중에서 한개만을 적용?
//		십의 자리 = 3, 일의 자리 = 369		
		
//		if (decimal == 3) { // 지워볼 부분 1, 십의 자리가 3일 때
//			if (one == 3 || one == 6 || one == 9) {
//				cnt += 2;
//				System.out.println("짝짝! 박수 " + cnt + "회");
//			} else {
//				cnt += 1;
//				System.out.println("짝! 박수 " + cnt + "회");
//			}
//		} else if (one == 3 || one == 6 || one == 9) { // 지워볼 부분 2, 일의자리가 369일때... 음
//			cnt += 1;
//			System.out.println("짝! 박수 " + cnt + "회");
//		} else {
//			System.out.println("일반 숫자");
//		}
		
		
//		중복조건 최소화
//		박수치는 조건
		/*
		 * 조건 1(짝짝): 십의자리 3-, 일의자리 369일 때
		 * 조건 2(짝): 십의자리 == 3이고 일의자리 != 369, 십의자리 !=3 이고 일의자리 ==369
		 * 조건 3(일반): 위 조건을 제외한 숫자. 
		 * 
		 * 공통조건: 일의자리는 무조건 369일것.
		 */
		
//		if (decimal == 3 && (one == 3 || one == 6 || one == 9)) {
//			cnt += 2;
//			System.out.println("짝짝! 박수 " + cnt + "회");
//		} else if (decimal == 3 && (one != 3 || one != 6 || one != 9)
//				|| decimal != 3 && (one == 3 || one == 6 || one == 9)) {
//			cnt += 1;
//			System.out.println("짝! 박수 " + cnt + "회");
//		} else {
//			System.out.println("일반수");
//		}
		
		// 최종 제출답안(2023년 5월 31일 23:50)
		
		Random ran = new Random();
		int rNum = ran.nextInt(50) + 1;
		int one = rNum % 10; // 나머지(일의 자리)
		int decimal = rNum / 10; // 몫(십의 자리)
		int cnt = 0; // 조건에 따라 박수 횟수를 카운트

		System.out.println(rNum);

		if (decimal == 3) { // 십의자리 3
			cnt++;
		}
		if (one == 3 || one == 6 || one == 9) { // 위의 조건을 지닌 채, 일의자리가 3,6,9
			cnt++;
		}

		// 카운트에 따라 박수 효과
//		2안 : if-else-if문 사용
		if (cnt == 2) {
			System.out.println("짝짝!!");
		} else if (cnt == 1) {
			System.out.println("짝!");
		} else {
			System.out.println("일반숫자");
		}
		// 사실상 답은 (같은 의미로서)정답이 표시되는데, 조건에 따라 박수 결과를 내는 부분은 if-else-if문을 사용해도 무방한건지요??
		
		// 카운트에 따라 박수 효과
//		1안 : if문 만으로 작성
//		if (cnt == 2 || cnt == 1) {
//			System.out.println("박수 " + cnt + "회");
//		}
//		if (cnt != 2 && cnt != 1) {
//			System.out.println("일반숫자");
//		}
		// 선생님께서 if문만을 이용해보라고 하셔서, 박수 결과를 내는 부분도 그에 맞추어 코딩했습니다.
		

    }
}
