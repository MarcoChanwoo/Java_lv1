//	제출시간: 2023년 6월 1일 22:00
//	최종수정: 2023년 6월 2일 09:35
public class day10_반복문응용2 {
  public static void main(String[] args) {
    // 문제4) 50에서 100까지 자연수중에서 9의 배수의 개수를 출력 # 답 : 6 (54,63,72,81,90,99)

    int i = 50;
    int cnt = 0; // 해당 수 카운트
    while (i <= 100) {
      if (i % 9 == 0) {
        System.out.print(i + " ");
        cnt++; // 위 과정이 진행될 때마다 카운트
      }
      i++;
    }
    System.out.println("개수: " + cnt + "개");
    System.out.println();

    // 문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 답 : 980
    int j = 0; // 0부터 시작한다.
    int max = 0; // j배수 숫자를 저장함

    while (j < 1000) {
      if (j % 28 == 0) {
        max = j; // max는 계속해서 새로운 j 값으로 업데이트
      }
      j += 28; // 0부터 시작했으니 28씩 세어도 무방
    }
    System.out.println("세자리 수중에서 가장 큰 값: " + max);
    System.out.println();

    // 문제6) 8의 배수를 작은 수부터 5개만 출력 ==> 답 : 0,8,16,24,32
    int k = 0;
    int cnt1 = 1; // 5번째 까지의 k를 카운트함

    while (cnt1 <= 5) {
      if (k % 8 ==0) {
        System.out.print(k + " ");
        cnt1++;
      }
      k += 8;

    }
  }
}
