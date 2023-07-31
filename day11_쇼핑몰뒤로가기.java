import java.sql.ConnectionBuilder;
import java.util.Scanner;

public class day11_쇼핑몰뒤로가기 {
    /*
     * # 쇼핑몰 뒤로가기
     * 
     * 문제) 쇼핑몰메인메뉴에서 남성의류를 선택해서
     * 뒤로가기 누르기전까지 남성의류 페이지 를 유지하려고한다.
     * 
     * 힌트) 계층 별로 반복문을 추가 해주면된다.
     * 
     * 1. 남성의류
     * 1) 티셔츠
     * 2) 바지
     * 3) 뒤로가기
     * 2. 여성의류
     * 1) 가디건
     * 2) 치마
     * 3) 뒤로가기
     * 3. 종료
     * 
     * -> 의류에 들어가면 3번(뒤로가기)을 누르기 전까지 1번 or 2번을 눌러도 계속해서 메뉴가 보이도록 유지
     * -> 남성의류 => 1 또는 2를 눌러도 해당 메뉴들 계속 오픈, 3누르면 뒤로가기 설정
     * 3번을 제외한 어더한 수도 반응없이 원 메뉴가 유지되어야 함. 3번 누르면 뒤로가기.
     * 
     * boolean: 참과 거짓으로 나뉨. 참이 1 거짓이 0(거짓이 기본값일것임)
     * 
     * 세부 메뉴에서도 값이 참일때는 무한으로 메뉴 반복1
     * 
     * 거짓이면 상위메뉴?
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean run = true;
        while (run) {
            System.out.println("1.남성의류");
            System.out.println("2.여성의류");
            System.out.println("3.종료");
            System.out.print("메뉴 선택 : ");
            int sel = scan.nextInt();
            System.out.println();

            while (run) { // 역시 true일 때
                if (sel == 1) {
                    System.out.println("==<남성의류>==");
                    System.out.println("1)티셔츠");
                    System.out.println("2)바지");
                    System.out.println("3)뒤로가기");
                    System.out.println("선택> ");
                    int subMenu = scan.nextInt();
                    if (subMenu == 3) { // 뒤로가기
                        System.out.println("처음 화면으로 이동합니다.");
                        break;
                    } else if (!(subMenu == 3 || subMenu >= 1 && subMenu <= 2)) {
                        System.out.println("잘못된 선택입니다. 다시 입력하세요>");
                    } else if (subMenu == 1) {
                        System.out.println("티셔츠입니다.");
                    } else if (subMenu == 2) {
                        System.out.println("바지입니다.");
                    }
                    System.out.println();
                } else if (sel == 2) {
                    System.out.println("==<여성의류>==");
                    System.out.println("1)가디건");
                    System.out.println("2)치마");
                    System.out.println("3)뒤로가기");
                    System.out.println("선택> ");
                    int subMenu = scan.nextInt();
                    if (subMenu == 3) { // 뒤로가기
                        System.out.println("처음 화면으로 이동합니다.");
                        break;
                    } else if (!(subMenu == 3 || subMenu >= 1 && subMenu <= 2)) {
                        System.out.println("잘못된 선택입니다. 다시 입력하세요>");
                    } else if (subMenu == 1) {
                        System.out.println("가디건입니다.");
                    } else if (subMenu == 2) {
                        System.out.println("치마입니다.");
                    }
                    System.out.println();
                } else if (sel == 3) {
                    run = false;
                    System.out.println("프로그램 종료");
                } else if (!(sel >= 1 && sel <= 3)) {
                    System.out.println("번호를 다시 확인하세요");
                    break;
                }
            }
        }

    }

}