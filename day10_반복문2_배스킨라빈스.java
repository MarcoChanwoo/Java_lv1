//	완료 시간: 2023년 6월 2일 17:20
//	수정 시간: ?
//  제출     : 2023년 6월 4일 22:55

import java.util.Scanner;

public class day10_반복문2_배스킨라빈스 {
  /*
   * # 베스킨라빈스31
   * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
   * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
   * 3. br이 31을 넘으면 게임은 종료된다.
   * 4. 승리자를 출력한다.
   * 
   * 예)
   * 1턴 : p1(2) br(2)
   * 2턴 : p2(1) br(3)
   * 3턴 : p1(3) br(6)
   * ...
   * 
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int p1 = 0;
    int p2 = 0;

    int br = 0;
    int turn = 0; // 턴 변환

    while (br <= 30) {
      System.out.println("p1 입력>");
      p1 = scan.nextInt();

      if (!(p1 > 0 && p1 <= 3)) { // 1~3이 아닐때, 다시 입력하도록
        System.out.println("1~3사이의 숫자만 입력");
        continue;
      }

      if (p1 > 0 && p1 <= 3) { // 1 ~ 3
        turn++;
        br += p1; // p1값 더해서 저장
        System.out.println(turn + "턴 : p1(" + p1 + ") br(" + br + ")");
      }

      if (br >= 31) {
        System.out.println("31초과, 게임 종료");
        System.out.println("p2 승리");
        break;
      }

      while (br <= 30) {
        System.out.println("p2 입력>");
        p2 = scan.nextInt();
        if (!(p2 > 0 && p2 <= 3)) {
          System.out.println("1~3사이의 숫자만 입력");
          continue;
        }
        if (p2 > 0 && p2 <= 3) {
          turn++;
          br += p2;
          System.out.println(turn + "턴 : p2(" + p2 + ") br(" + br + ")");
          if (br >= 31) {
            System.out.println("31초과, 게임 종료");
            System.out.println("p1 승리");
          }
          break; // 다시 p1로
        }

      }

    }

  }
}
