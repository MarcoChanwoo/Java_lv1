import java.util.Scanner;
public class day05_조건문_ATM암기 {
    public static void main(String[] args) {
        
//		ATM 암기??
//		1. 로그인 ==> 1.입금 2.출금 3.조회
//		int log = -1; 변수 활용!
		
		int log = -1; // 나중 boolean을 위해. (배열)
        //		로그인이 되었는지 아닌지를 판단하기 위한 변수??????
        //		int log == -1 -> 로그인 된 상태
        //		int log != -1 -> 제대로 로그인이 안된 상태??
                
        //		무언가가 음수가 나온다면 false가 되어야 함. 설마 잔액(balance)??
        //		잔액이 부족한 상태에서 또 출금은 불가하므로,, 잔액이 log 변수값보다 낮아지려고 하면 바로 불가하다 메시지 표출??  
                int cash = 20000; // 입금시 감소, 출금시 증가, 현금
                int balance = 30000; // 입금시 증가, 출금시 감소, 잔액
                int account = 11111; // 로그인시 사용
                int password = 1234; // 로그인시 사용
        
                int menu = 0; // 세부목록 입력
        
                Scanner scan = new Scanner(System.in);
                System.out.println("현금: " + cash + "원");
                System.out.println("잔액: " + balance + "원");
                System.out.println("====ATM====");
                System.out.println("1.로그인 2.종료");
                int select = scan.nextInt();
        
                System.out.println("계좌번호 입력>");
                int inputAcc = scan.nextInt(); // 입력받을 계좌
                System.out.println("비밀번호 입력>");
                int inputPw = scan.nextInt(); // 입력받을 비번
        //		1. 로그인 후 세부목록 표시
                if (inputAcc == account && inputPw == password) { // 입력한 계좌, 비번이 맞다면 세부목록 표시
                    System.out.println("[1] 입금");
                    System.out.println("[2] 출금");
                    System.out.println("[3] 조회");
                    menu = scan.nextInt(); // 세부목록 입력
                    if (menu == 1) { // 입금 선택
                        System.out.println("입금을 선택하셨습니다.");
                        System.out.println("입금액: " + cash + "원");
                        balance += cash;
                        System.out.println("잔액은 " + balance + "입니다.");
                    } else if (menu == 2) {
                        System.out.println("출금을 선택하셨습니다.");
                        System.out.println("출금액: " + balance + "원");
                        balance -= balance;
                        System.out.println("잔액은 " + balance + "입니다.");
                    } else { // 3. 조회 선택시
                        System.out.println("잔액은 " + balance + "원 입니다.");
                    }
        
                } else { // 입력계좌, 비번 정보 오류 시
                    System.out.println("잘못된 정보.");
                }
                
    }
}
