public class day01_기본출력 {
    //1. 패키지 선언문은 항상 첫 줄에 작성한다.

	//주석(comment) : 설명문을 작성하기 위한 방법으로
	//프로그램의 실행에 영향을 미치지 않는다.

	// 주석의 2종류
	// 1) 한줄주석    ==> 주석할내용앞에 / 를 2개 붙인다.
	// 2) 여러줄주석 ==> 주석할 내용앞에 /* 을붙이고 내용뒤에 */ 를 붙인다. 

	/*
	  	-- 여러줄 주석 --
	  	
		동해 물과 백두산이 마르고 닳도록
		하느님이 보우하사 우리나라 만세.
		무궁화 삼천리 화려 강산
		대한 사람, 대한으로 길이 보전하세.
		
	*/
    //저장 : Ctrl + S
	//확대 및 축소 : Ctrl + [+],[-]
	
	// 이 안(main) 에서 프로그래밍을 한다.
			// 출력문 자동완성 : sysout + [Ctrl + Space]
			// 문장의 마침표(세미콜론;)
			
			// 영수증 만들기
//			System.out.println("===================");
//			System.out.println("       스타벅스           ");
//			System.out.println(" 현금(소득공제)       ");
//			System.out.println(" 까페라테               5000");
//			System.out.println(" 아메리카노             4600");
//			System.out.println(" 까페모카               5700");
//			System.out.println(" 합계:         15300");
//			System.out.println("===================");	
//			// 집그려보기 
//			System.out.println("===================");	
//			System.out.println("     /\\        /\\");
//			System.out.println("    /  \\______/  \\");
//			System.out.println("    |    _____    |");
//			System.out.println("    |    |    |   |");
//			System.out.println("    |    |    |   |");
//			System.out.println("    |    | o  |   |");
//			System.out.println("    |____|____|___|");
//			System.out.println("===================");	
	
	// 자료형(Data Type)
	
			// 1. 숫자(정수) : 소수점이 없는 수
//			System.out.println(10);
			// 2. 숫자(실수) : 소수점이 있는 수
//			System.out.println(3.14);
			// 3. 문자 한 개 : 홑따옴표
//			System.out.println('B');
			// 4. 문자 여러개 : 쌍따옴표
//			System.out.println("Java Class");
	
	/*
	 * # 연산자(operator)
	 * 1. 산술 연산자
	 * 1) 더하기			+
	 * 2) 빼기			-
	 * 3) 곱하기			*
	 * 4) 나누기			/
	 * 5) 나머지			%
	 */	
//		System.out.println(10 + 3);
//		System.out.println(10 - 3);
//		System.out.println(10 * 3);
//		System.out.println(10 / 3);   // 정수 / 정수 = 정수  (소수점이 사라진다. 몫이됨.)
//		System.out.println(10 % 3);   // 나머지
//		System.out.println(10 / 3.0); // 실수 / 정수 = 실수  (소수점이 나옴.)	
	
	// 1. 덧셈 연산자
//			System.out.println(10 + 3);	
			// 2. 연결 연산자 ==> 문자와 숫자를 같이 출력하기 
			
			// 1) "문자" + "문자" = "문자"
//			System.out.println("안녕" + "하세요");
			// 2) 숫자 + "문자" = "문자"
//			System.out.println("10" + 3);
			// 3) "문자" + 숫자 = "문자"
//			System.out.println(3 + "10");
			
//			System.out.println("더하기 = " + 10 + 3); // 숫자 "10" 이 "더하기 =" 이랑 먼저 계산되어서 글자로 변함
//			System.out.println("더하기 = " + (10 + 3)); // 숫자를 먼저 () 를 이용해서 더한후 글자랑 같이 출력 해야한다.
//			System.out.println("빼기 = " + (10 - 3)); // 숫자를 먼저 () 를 이용해서 더한후 글자랑 같이 출력 해야한다.
//			System.out.println("곱하기 = " + 10 * 3);   // 곱하기나 나누기는 + 보다 우선순위가 높기때문에 필요없다.
//			System.out.println("나누기(몫) = " + 10 / 3);
//			System.out.println("나누기(나머지) = " + 10 % 3);
//			System.out.println("나누기(소수점) = " + 10.0 / 3);
	

	/*
	 * # 연산자(operator) 연습
	 * 
	 * 
	 */
    public static void main(String[] args) {

        			// 영수증 만들기
			System.out.println("===================");
			System.out.println("       스타벅스           ");
			System.out.println(" 현금(소득공제)       ");
			System.out.println(" 까페라테               5000");
			System.out.println(" 아메리카노             4600");
			System.out.println(" 까페모카               5700");
			System.out.println(" 합계:         15300");
			System.out.println("===================");	
            System.out.println();
        
            System.out.println("===================");	
            System.out.println("     /\\        /\\");
            System.out.println("    /  \\______/  \\");
            System.out.println("    |    _____    |");
            System.out.println("    |    |    |   |");
            System.out.println("    |    |    |   |");
            System.out.println("    |    | o  |   |");
            System.out.println("    |____|____|___|");
            System.out.println("===================");	
            System.out.println();
            
            
    //		System.out.println(10+3);
    //		System.out.println("10+3");
    //		System.out.println(10/3);
    //		System.out.println(10.0/3);
    //		System.out.println(20/7.0);
    //		System.out.println(15.0/5);
    //		System.out.println(10%3);
    //		System.out.println("10"+4);
    //		System.out.println(33+"삼삼");
    //		System.out.println(34+'A'); // A는 ASCII로 65
    //		System.out.println(34+"A");
            
            // 예) 현금이 1000원이 있다. 200원짜리 과자 구입 후, 잔돈을 출력한다면?
    //		System.out.println(1000-200);
    //		System.out.println("잔돈: "+(1000-200)+"원 입니다.");
            
            // 문제1) 월급이 100원일 때의 연봉은?
            // 조건: 세금 10% 제외
            // 100원 x 12개월
            System.out.println("연봉: " + ((100 * 12) - ((100 * 12) * 10) / 100) + "원");
            // 연봉 세금=연봉의 10%
            System.out.println();
    
            // 문제2) 시험점수를 30, 50, 4점 받았다. 평균은?
            System.out.println("평균: " + (30 + 50 + 4) / 3 + "점");
            System.out.println();
    
            // 문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
            // 삼각형 넓이 = (가로 * 세로)/2
            System.out.println("넓이: " + (3 * 6) / 2);
            System.out.println();
    
            // 문제4) 100초를 1분 40초로 출력
            System.out.println(100 / 60 + "분" + " " + 100 % 60 + "초");
            System.out.println();
    
            // 문제5) 800원에서 500원짜리 개수, 800원에서 500원을 뺀 100짜리 개수 출력
            // 정답 형태) 500원(1개), 100원(3개)
            System.out.println("500원(" + 800 / 500 + "개), " + "100원(" + (800 % 500) / 100 + "개)");
            
          
            
    }
}
