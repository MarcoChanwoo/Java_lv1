public class day08_서식문자 {
    /*
	 * # 출력문의 종류
	 * 1. System.out.println();
	 *  ln = new line
	 * 2. 줄바꿈 기능
	 *  System.out.print();
	 * 
	 * 3. 줄바꿈 불가
	 *  System.out.printf(); // f: format String
	 *  
	 *  4. 서식문자 출력
	 *  - 종류
	 *  . %d : 정수 decimal
	 *  . %f : 소수 floating-point(부동소수점)
	 *  . %c : 문자 1개(character) - 홑따옴표 필수
	 *  . %s : 문자 여러개(string) - 쌍따옴표 필수
	 */
    public static void main(String[] args) {
        System.out.printf("%d", 10);
		System.out.println();
		
		System.out.printf("%f\n", 3.14); // %f는 기본적으로 소수점 이하 6번째 자리까지 출력한다.
		System.out.printf("%.2f\n", 3.14); // .2는 소수점 이하 2번째까지만 출력하겠다는 뜻(반올림 기능)
		
		System.out.printf("%c\n", 'ㅗ'); // 따옴표 필수
		
		System.out.printf("%s\n", "출력문의 이해"); // 쌍따옴표 필수
		
		String fruit = "사과";
		int cnt = 5;
		System.out.printf("%s가 %d개 있습니다. \n", fruit, cnt);

		System.out.println("안녕하세요.");
		
		System.out.print("안녕");
		System.out.println("하세요.");
		
		/*
		 * 이스케이프 문자(escape sequence)
		 * 1) \n	: 줄바꿈
		 * 2) \t	: tab
		 * 3) \"	: "
		 * 4) \'	: '
		 */
		System.out.println("안녕\n하세요.");
		System.out.println("안녕\t하세요.");
		System.out.println("\"안녕하세요.\"");
		System.out.println("\'안녕하세요.\'\'");
		
    }
}
