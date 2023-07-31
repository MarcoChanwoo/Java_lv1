import java.util.Scanner;
public class day06_조건문_최대값구하기_Lv1 {
    // 최대값 구하기[1단계]
	// 1. 숫자 3개를 입력받는다.
	// 2. 입력받은 3개의 수를 비교하여
	// 3. 가장 큰 수(MAX)를 출력한다.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

		int num1 = 0; // 1번째 입력
		int num2 = 0; // 2번째 입력
		int num3 = 0; // 3번째 입력

		// 숫자 3개 입력받기
		System.out.println("숫자1을 입력하세요>");
		num1 = scan.nextInt();
		System.out.println("숫자2을 입력하세요>");
		num2 = scan.nextInt();
		System.out.println("숫자3을 입력하세요>");
		num3 = scan.nextInt();

		int max = num1; // num1을 max값이라고 가정하고 시작

		if (max < num2) {
			max = num2; // num2가 기존 max(num1)보다 큰 수라면 max에 num2로 갱신
		}
		if (max < num3)
			max = num3; // num3가 기존 max(num2)보다 큰 수라면 max에 num3로 갱신

		System.out.println("가장 큰 수: " + max);

		/*
		 * 자바에서 최대값과 최소값은 다른 값을 서로 비교하여 크거나 작은 숫자를 지속적으로 판별하며 얻어내는 방식
		 * (예전에 배열에서도 얼핏 이런식으로 구했던 거 같은데 ㄷㄷ)
		 */
    }
}
