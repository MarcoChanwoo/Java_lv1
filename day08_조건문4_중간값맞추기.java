import java.util.Random;
import java.util.Scanner;
public class day08_조건문4_중간값맞추기 {
    //	# 가운데 숫자 맞추기 게임
//	1. 150 ~ 250 사이의 랜덤 숫자를 저장함
//	2. 랜덤 숫자의 가운데 숫자를 맞추는 게임
//	예) 249 : 4 가 나왔다고 가정하면, 그 중간값을 구하는 것.
//	나머지와 나누기 연산자를 활용해서 맞춘다?
    public static void main(String[] args) {
        Random ran = new Random();
		Scanner scan = new Scanner(System.in);

//		1. 150 ~ 250 사이의 숫자를 랜덤으로 추출함
		int rNum1 = ran.nextInt(100) + 151; // 추출1
		int rNum2 = ran.nextInt(100) + 151; // 추출2

		int min = 0; // 두 랜덤 값 중에서 비교하여 작은 값을 넣는다.
		int remain = 0; // 나누어 남는 나머지를 저장

//		2. 두 랜덤값중 더 작은 값 찾기 
		if (rNum1 > rNum2) {
			min = rNum2;
		} else {
			min = rNum1;
		}

//		3. 두 랜덤값 중 큰 수에서 작은수를 나눈 나머지를 구하기. 
		if (rNum1 > min) {
			remain = rNum1 % min;
		} else {
			remain = rNum2 % min;
		}

//		4. 최종 중간값 계산

		int ans = min + (remain / 2); // 정답

//		5. 이제 입력값을 받아 문제를 맞춤.
		System.out.println("150~250사이의 숫자를 입력(정수)>");
		int inAns = scan.nextInt();

		if (inAns != ans) {
			System.out.println("오답입니다. 정답: " + ans + "입니다.");
		} else {
			System.out.println("정답입니다. 정답: " + ans);
		}

    }
}
