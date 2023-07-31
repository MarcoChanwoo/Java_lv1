public class day03_논리 {
    /*
	 * # 논리 연산자
	 * 
	 * 1. 종류
	 * 1) &&(and) : 양쪽 모두 참이어야 참
	 * 2) ||(or) : 양쪽 중 어느 한쪽이라도 참이면, 참
	 * 
	 * 2. 역할
	 * 1) 논리 연산자를 통해 여러개의 비교 연산자를 연결할 수 있다.
	 * 2) 논리 연산자를 통해 범위 설정이 가능하다.
	 */
    public static void main(String[] args) {
        
//		System.out.println(10 == 10 && 3 == 3); // true
//		System.out.println(10 != 10 && 3 == 3); // false(10 != 10)
//		System.out.println(10 == 10 && 3 != 3); // false(3 != 3)
//		System.out.println(10 != 10 && 3 != 3); // false(둘다 틀림)
//		
//		System.out.println();
//		
//		System.out.println(10 == 10 || 3 == 3); // true
//		System.out.println(10 != 10 || 3 == 3); // true(3 == 3)
//		System.out.println(10 == 10 || 3 != 3); // true(10 == 10)
//		System.out.println(10 != 10 || 3 != 3); // false(둘 다 틀리므로)
		
//		예) 3의 배수이면서, 짝수라면 true 출력
		int num = 12;
		System.out.println(num%3 == 0 && num%2 == 0); // true(두 조건 모두 만족하므로)
		System.out.println();
		
		// 문제 1) 과락
		// 3과목의 평균이 60점 이상이면, true
		// 단, 어느 한 과목이라도 50점 미만이면 false
		int kor = 100;
		int eng = 37;
		int math = 61;
		
		System.out.println((kor + eng + math) / 3 >= 60 && (kor > 50 && eng > 50 && math > 50));
		System.out.println();
		
		// 문제 2) 키가 200cm 이상이거나 몸무게가 200kg 이상이면, 입장(true)
		// 두 조건 중 하나라도 맞으면 입장(true)
		int height = 100;
		int weight = 200;
		
		System.out.println(height >=200 || weight >=200);
    }
}
