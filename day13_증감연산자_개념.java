public class day13_증감연산자_개념 {
    public static void main(String[] args) {
        // 증감연산자

		// a = a + 1
		// a += 1
		
		// a ++      // 후위연산 : 연산자가 포함된 '항'이 끝나면 연산실행 
		// ++ a      // 전위연산 : 연산자가 포함된 '항'이 시작될 때 연산실행 

		int a = 10;
		int b = 20;
		int c;

		c = a++ + b;
		System.out.println(c); // 30
		System.out.println(a); // 11

		c = ++a + b;
		System.out.println(c); // 32
		System.out.println(a); // 12
		
		a = 10;
		b = 20;
		
		c = a + ++b;
		System.out.println(c); // 31
		System.out.println(b); // 21
		
		c = a + b++;
		System.out.println(c); // 31
		System.out.println(b); // 22
		
		a = 10;
		b = 20;
		
		c = ++a +a;
		System.out.println(c); // 11+11 -> 22
		System.out.println(a); // 11
		
		c = ++a + a++;
		System.out.println(c); // 12+12 -> 24
		System.out.println(a); // 13

    c = a++ + ++a;
		System.out.println(c); // 13+15 -> 28
		System.out.println(a); // 15

        // 이야 이렇게 보니까 살짝 낯설다. 잘 기억해두자
    }
}
