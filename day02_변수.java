public class day02_변수 {
    /*
	 * # 변수(variable) 1. 변수란, 단 하나의 값을 저장할 수 있는 메모리 공간 2. 변수의 선언 : int a; // 메모리 공간
	 * 할당 3. 변수의 초기화: a = 10; // 값 저장
	 */

	/*
	 * 대입 연산자 : = 변수는 오직 대입 연산자를 통해서만이 값의 변경이 가능하다
	 */
	
	/*
	 * #. 변수의 명명규칙
	 * 1. 숫자로 시작할 수 없다.
	 * 2. 특수문자는 _와 $만을 허용한다.
	 * 3. 예약어(키워드)는 사용할 수 없다. ex) public, class, static, void ...
	 * 4. 자바는 알파벳의 대소문자를 구분한다.
	 * ------------------------------
	 * 1. 패키지명, 변수명은 소문자로 시작한다.
	 * 2. 클래스명은 대문자로 시작한다.
	 */
	
	/*
	 * # 변수의 특징
	 * 1. 변수는 값을 한개만 저장할 수 있다.
	 * 2. 때문에 새로운 값이 저장되면 이전의 값은 사라진다.
	 * 3. 같은 이름의 변수를 사용할 수 없다.
	 */
	
	/*
	 * # 비교 연산자
	 * => 비교 연산자의 결과는 참(true) 또는 거짓(false)이다.
	 * 1. 크니?			>
	 * 2. 작니?			<
	 * 3. 같니?			==
	 * 4. 다르니?			!=
	 * 5. 크거나 같니?		>=
	 * 6. 작거나 같니?		<=
	 */
    public static void main(String[] args) {
        // 자료형(Data type)

//		// 1. 정수: integer
//		int num;
//		num = 10;
//		System.out.println(num);
//		
//		// 2. 실수: double
//		double dNum = 3.14;
//		System.out.println(dNum);
//		
//		// 3. 문자 한 개: character
//		char c1 = 'a';
//		System.out.println(c1);
//		char c2 = '가';
//		System.out.println(c2);
//		
//		// 4. 문자 여러개: String
//		String str = "java";
//		// ㄴ String만 특이하게 색도 검정색이고 대문자로 시작한다(이유는 뒤에나옴).
//		System.out.println(str);
//		
//		// 5. 참과 거짓: boolean
//		boolean result = true;
//		System.out.println(result);

//		대입 연산자
//		int num = 8;
//		System.out.println(num + 1);
//		System.out.println(num);
//
//		num = num + 1;
//		System.out.println(num);
		
//		int test = 1; // 변수는 대소문자를 구분한다.
//        int Test = 2;
//        System.out.println(test);
//        System.out.println(Test);
        
             
//        int $money = 1000;  // 특수문자 $ 사용가능
//        System.out.println($money);
        
        // 아래와같이 노란색경고는 사소한경고이다. (신경쓰지않아도된다)
        // 생긴원인은 변수만 만들고 사용하지않아서 생기는것.
//        int math_score = 35; // 특수문자 _ 사용가능  ==> 두번째 단어를 _ 로 구분하는것(스네이크표기법)
//        int koreanScore = 87; // 두번째 단어 첫글자를 대문자로 하는것 (카멜표기법) 
        
        // int 1num = 10;  // 변수이름은 숫자로 시작할수없다.
        // int #test = 10;  // 특수기호 대부분 사용불가 
        // int void = 20; // 예약어 사용불가
        
        // 변수의 값 교체하기
        // x와 y의 값 교체하기
//        int x = 10;
//        int y = 20;
//        
//        int z = x;
//        x = y;
//        y = z;
//        
//		System.out.println("x = " + x);
//		System.out.println("y = " + y);

        //문제1) 아래 연산의 결과가 모두 true가 출력되도록 변경
////        System.out.println(10 == 3);
//        System.out.println(10 != 3);
////        System.out.println(3 != 8); => true
//        System.out.println(3 == 8); // false
////        System.out.println(5>38);
//        System.out.println(5<38);
////        System.out.println(12<3);
//        System.out.println(12>3);
////        System.out.println(11>=11);
//        System.out.println(11==11); // 더 정확한 표현???
////        System.out.println(3<=10);
//        System.out.println(3<10); // 더 정확한 표현
        
        
       // 비교 연산자 문제
        // 예) 점수가 60점 이상이면 true 출력
        int score = 30;
        System.out.println(score>=60); // false
        score = 60; // 기존 30은 지워짐
        System.out.println(score>=60); // true
        System.out.println(score>60);  // false
        
        // 문제1) 3의 배수이면 true 출력
        // 힌트1) 숫자 %3 == 0 (3의 배수)
        int num1 = 17;
        System.out.println(num1%3==0); // false
        num1 = 18; // num1에 18을 저장하고 3으로 나눈 값이 0(3의 배수)이라면
        System.out.println(num1%3==0); // true
        num1 = 22; // 18을 지우고 22로 새로 저장함. 나눈 값의 나머지가 0이면 3의 배수.
        System.out.println(num1%3==0); // false
        
        
        
        // 문제2) 짝수이면 true 출력
        // 힌트2) 숫자 %2 == 0 (짝수)
        // 힌트2) 숫자 %2 == 1 (홀수)
        int num2 = 28;
        System.out.println(num2%2==0); // true
        num2 = 31;
        System.out.println(num2%2==0); // false
        num2 = 52;
        System.out.println(num2%2==0); // true
    }
}
