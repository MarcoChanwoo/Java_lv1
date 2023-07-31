public class day09_반복문기본문제 {
    public static void main(String[] args) {
        // 문제1) 1~10까지 반복해 5~9 출력
		// 정답1) 5, 6, 7, 8, 9
		// -> 반복된 열 중에서 5개를 추출
		int i = 1;
		while (i <= 10) {
			if (i >= 5 && i <= 9) {
				System.out.print(i + " ");
			}
			i++; // 증감식의 위치 중요
		}
		System.out.println();

		// 문제2) 10~1까지 반복해 6~3 거꾸로 출력
		// 정답2) 6, 5, 4, 3
		int j = 10;
		while (j >= 1) {
			if (j <= 6 && j >= 3) {
				System.out.print(j + " ");
			}
			j--;
		}
		System.out.println();

		// 문제3) 1~10까지 반복해 짝수만 출력
		// 정답3) 2, 4, 6, 8, 10
		int k = 1;
		while (k <= 10) {
			if (k % 2 == 0) {
				System.out.print(k + " ");
			}
			k++;
		}

    }
}
