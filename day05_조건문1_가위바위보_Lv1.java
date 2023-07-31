import java.util.Scanner;

public class day05_조건문1_가위바위보_Lv1 {
    public static void main(String[] args) {
        /*
		 * # Up & Down 게임[1단계]
		 * 1. com은 8이다.
		 * 2. me는 숫자를 하나입력받는다.
		 * 3. com 과 me 를 비교해서 다음과 같은 메세지를 출력한다.
		 * 1) me < com	: Up!
		 * 2) me == com : Bingo!
		 * 3) me > com  : Down!
		 */
		Scanner scan = new Scanner(System.in);
		
        //		int com = 8;
                
                
                // 콘솔 입력창 준비
                // 입력 값을 input으로 저장
        //		System.out.println("숫자를 입력하세요: ");
        //		int me = scan.nextInt(); // 내가 입력하는 숫자를 변수명 me에 저장함
        //
        //		if (me < com) {
        //			System.out.println("Up!");
        //		}
        //		if (me == com) {
        //			System.out.println("Bingo!");
        //		}
        //		if (me > com) {
        //			System.out.println("Down!");
        //		}
                
                
                /*
                 * # 가위(0)바위(1)보(2) 게임[1단계]
                 * 1. com은 바위(1)만 낼 수 있다.
                 * 2. me는 0~2 사이의 숫자를 입력받는다.
                 * 3. com과 me를 비교해,
                 * 		1) 비겼다.
                 * 		2) 내가 이겼다.
                 * 		3) 내가 졌다.			를 출력한다.
                 */
                
                int com = 1; // com => 바위(1)로 정의
                
                // 이길 수 있는 경우의 수
                // com 은 바위만 냄
                // 바위를 이기는 경우 => 내가 보를 냈을때만 가능
                
                
                System.out.println("가위 - 0");
                System.out.println("바위 - 1");
                System.out.println(" 보 - 2");		
                System.out.println("숫자를 입력하세요: ");
                // 내가 입력한 값을 me 변수에 저장함.
                int me = scan.nextInt();
        
                // 입력된 값과 com의 변수를 비교함.
        
                // 1) 내가 이기는 경우(보2를 냈을 때)
                if(me == 2) {
                    System.out.println("내가 이겼다!");
                }
                
                // 2) 비기는 경우(바위1를 냈을 때)
                if(me == 1) {
                    System.out.println("비겼다.");
                }
                
                // 3) 내가 지는 경우(가위0를 냈을 때)
                if(me == 0) {
                    System.out.println("내가 졌다...");
                }
                
    }
}
