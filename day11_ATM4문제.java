import java.util.Scanner;

public class day11_ATM4문제 {
    /*
     * # ATM[종합]
     * 1. 로그인
     * . 로그인 후 재 로그인 불가
     * . 로그아웃 상태에서만 이용 가능
     * 2. 로그아웃
     * . 로그인 후 이용가능
     * 3. 입금
     * . 로그인 후 이용가능
     * 4. 출금
     * . 로그인 후 이용가능
     * 5. 이체
     * . 로그인 후 이용가능
     * 6. 조회
     * . 로그인 후 이용가능
     * 7. 종료
     */

    public static void main(String[] args) {
        int deposit = 0; // 입금액
        int withdrawal = 0; // 출금액
        int trans = 0; // 이체액
        int exe = 0; // 송금 실행 여부

        int dbAcc1 = 1111;
        int dbPw1 = 1234;
        int dbMoney1 = 50000;
        int inputAcc = 0; // 계좌입력

        int dbAcc2 = 2222;
        int dbPw2 = 2345;
        int dbMoney2 = 70000;
        int inputPw = 0; // 입력된 비번정보

        int log = -1; // -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
        int cnt1 = 0; // 중복확인용
        int cnt2 = 0; // 중복확인용

        boolean run = true;
        while (run) {
            Scanner scan = new Scanner(System.in);

            System.out.println("1.로그인");
            System.out.println("2.로그아웃");
            System.out.println("3.입금");
            System.out.println("4.출금");
            System.out.println("5.이체");
            System.out.println("6.조회");
            System.out.println("0.종료");

            System.out.print("메뉴 선택 : ");
            int sel = scan.nextInt();

            if (sel == 1) {
                // 계좌1 로그인
                System.out.println("======로그인======");
                System.out.println("계좌번호를 입력하세요>");
                inputAcc = scan.nextInt();
                System.out.println("비밀번호를 입력하세요>");
                inputPw = scan.nextInt();
                /* ===================== 여기부터 ===================== */
                /* 로그인 파트가 조금은 헷갈리는 파트이므로 세밀히 봐야함 */
                if (inputAcc == dbAcc1 && inputPw == dbPw1 && cnt1 >= 0) { // 1계좌가 올바르게 입력되면
                    if (cnt1 >= 1) { // if-1) 이미 정상 로그인 중일 때
                        System.out.println("1111은 이미 로그인 중입니다."); // 안내 후
                        System.out.println();
                        continue; // 기존 메뉴를 표출을 위해 건너뛰게 만듦
                    } else if (cnt2 >= 1 && (inputAcc == dbAcc1 && inputPw == dbPw1)) { // if-2) 2계좌 사용 중 1계좌 로그인을 시도하면
                        System.out.println("현재 2222가 이용중입니다!"); // 안내 후
                        continue; // 무효화(원 메뉴 표출)
                    } else {  // 위의 두 조건이 모두 만족하지 않음 = 정상 로그인 실행
                        log = 1; // 계좌 1이 로그인 될 시 표시
                        cnt1++; // 중복 로그인을 방지하기 위해 카운트를 셈. (cnt1>=1부터)
                        System.out.println("1111 로그인 성공!"); // 성공 안내
                    }
                } else if (inputAcc == dbAcc2 && inputPw == dbPw2 && cnt2 >= 0) {
                    if (cnt2 >= 1) {
                        System.out.println("2222는 이미 로그인 중입니다.");
                        System.out.println();
                        continue;
                    } else if (cnt1 >= 1 && (inputAcc == dbAcc2 && inputPw == dbPw2)) {
                        System.out.println("현재 1111이 이용중입니다!");
                        continue;
                    } else {
                        log = 2;
                        cnt2++;
                        System.out.println("2222 로그인 성공!");
                    }
                    System.out.println("현재 로그인: " + log);
                } else if ((inputAcc != dbAcc1 || inputPw != dbPw2)) {
                    System.out.println("정보를 다시 확인하세요.");
                }
                /* ===================== 여기까지 ===================== */
                /* =================== if와 if else ================== */
                /* if else를 사용하는 경우 마지막에 반드시 else로만 끝낼 필요는 없으며 */
                /* 판별할 조건이 필요한 경우 또 if를 붙여 조건을 명시 후 그냥 전체 if문을 종료해도 무방 */
            } else if (sel == 2) { // 로그아웃(로그인 시에만 가능)
                if (log == -1) {
                    System.out.println("로그인 후 이용하세요.");
                } else if (log == 1) {
                    System.out.println("=====로그아웃=====");
                    System.out.println("계좌번호를 입력하세요>");
                    inputAcc = scan.nextInt();
                    System.out.println("비밀번호를 입력하세요>");
                    inputPw = scan.nextInt();
                    if (log == 1 && (inputAcc == dbAcc2 && inputPw == dbPw2)) {
                        System.out.println("현재 이용중인 계좌는 1111입니다!");
                    } else {
                        System.out.println("1111 계좌를 로그아웃합니다.");
                        log = -1;
                        cnt1 = 0;
                    }
                } else if (log == 2) {
                    System.out.println("=====로그아웃=====");
                    System.out.println("계좌번호를 입력하세요>");
                    inputAcc = scan.nextInt();
                    System.out.println("비밀번호를 입력하세요>");
                    inputPw = scan.nextInt();
                    if (log == 2 && (inputAcc == dbAcc1 && inputPw == dbPw1)) {
                        System.out.println("현재 이용중인 계좌는 2222입니다!");
                    } else {
                        System.out.println("2222 계좌를 로그아웃합니다.");
                        log = -1;
                        cnt2 = 0;
                    }
                } else if ((inputAcc != dbAcc1 || inputPw != dbPw2)) {
                    System.out.println("정보를 다시 확인하세요.");
                }
            } else if (sel == 3) { // 입금
                if (log == 1) {
                    System.out.println("원하시는 금액을 투입하세요>");
                    deposit = scan.nextInt();
                    dbMoney1 += deposit;
                    System.out.println("입금완료!");
                    System.out.println();
                } else if (log == 2) {
                    System.out.println("원하시는 금액을 투입하세요>");
                    deposit = scan.nextInt();
                    dbMoney2 += deposit;
                    System.out.println("입금완료!");
                    System.out.println();
                } else if (log == -1) {
                    System.out.println("로그인 후 이용하세요");
                }
            } else if (sel == 4) { // 출금
                if (log == 1) {
                    System.out.println("얼마를 출금하시겠습니까?>");
                    withdrawal = scan.nextInt();
                    if (withdrawal > dbMoney1) {
                        System.out.println("금액이 부족합니다.");
                        System.out.println();
                    } else {
                        dbMoney1 -= withdrawal;
                        System.out.println("출금완료!(좋은데 쓰세요)");
                        System.out.println();
                    }
                } else if (log == 2) {
                    System.out.println("얼마를 출금하시겠습니까?>");
                    withdrawal = scan.nextInt();
                    if (withdrawal > dbMoney2) {
                        System.out.println("금액이 부족하군요...ㅉ");
                        System.out.println();
                    } else {
                        dbMoney2 -= withdrawal;
                        System.out.println("출금완료!(잘 쓰세요..)");
                        System.out.println();
                    }
                } else if (log == -1) {
                    System.out.println("로그인 후 이용하세요");
                }
            } else if (sel == 5) { // 이체
                if (log == 1) { // 1로그인 중일 때
                    System.out.println("보내실 계좌를 입력하세요>");
                    inputAcc = scan.nextInt();
                    if (inputAcc == dbAcc1) {
                        System.out.println("본인 계좌에는 송금할 수 없습니다.");
                        System.out.println();
                    } else if (!(inputAcc == dbAcc1)) {
                        System.out.println("얼마를 이체하시겠습니까?>");
                        trans = scan.nextInt();
                        if (trans > dbMoney1) {
                            System.out.println("잔액이 부족합니다!");
                            System.out.println();
                        } else {
                            System.out.println(inputAcc + "로 " + trans + "원을 송금하시겠습니까?");
                            System.out.println("[1] 송금 실행");
                            System.out.println("[2] 송금 취소");
                            exe = scan.nextInt();
                            if (exe == 1) { // 1이면 송금 실행
                                dbMoney2 += trans;
                                dbMoney1 -= trans;
                                System.out.println(inputAcc + " 계좌로 " + trans + "원 송금되었습니다.");
                                System.out.println();
                            } else if (exe == 2) { // 0이면 송금 취소
                                System.out.println("송금을 취소합니다.");
                            }
                        }
                    }
                } else if (log == 2) {
                    System.out.println("보내실 계좌를 입력하세요>");
                    inputAcc = scan.nextInt();
                    if (inputAcc == dbAcc2) {
                        System.out.println("본인 계좌에는 송금할 수 없습니다.");
                        System.out.println();
                    } else if (inputAcc != dbAcc1) {
                        System.out.println("없는 계좌입니다.");
                        System.out.println();
                    } else if (!(inputAcc == dbAcc2)) {
                        System.out.println("얼마를 이체하시겠습니까?>");
                        trans = scan.nextInt();
                        if (trans >= dbMoney2) {
                            System.out.println(inputAcc + "로 " + trans + "원을 송금하시겠습니까?");
                            System.out.println("[1] 송금 실행");
                            System.out.println("[2] 송금 취소");
                            exe = scan.nextInt();
                            if (exe == 1) { // 1이면 송금 실행
                                dbMoney1 += trans;
                                dbMoney2 -= trans;
                                System.out.println(inputAcc + " 계좌로 " + trans + "원 송금되었습니다.");
                            } else if (exe == 0) { // 0이면 송금 취소
                                System.out.println("송금을 취소합니다.");
                                System.out.println();
                            }
                        }
                    }
                } else if (log == -1) {
                    System.out.println("로그인 후 이용하세요.");
                }

            } else if (sel == 6) { // 잔액조회
                if (log == 1) {
                    System.out.println("1111의 잔액은: " + dbMoney1 + "입니다.");
                } else if (log == 2) {
                    System.out.println("2222의 잔액은: " + dbMoney2 + "입니다.");
                } else if (log == -1) {
                    System.out.println("로그인 후 이용하세요");
                }

            } else if (sel == 0) {
                run = false;
                System.out.println("프로그램 종료");
            }
            System.out.println();
        }
    }
}
