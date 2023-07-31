    // 끝낼때까지 계속해서 화면에 띄우기

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;
        int subMenu=0;

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("1- square");
            System.out.println("2- square root");
            System.out.println("3- log");
            System.out.print("선택. (종료는 0)>");
            System.out.println();
            menu = scan.nextInt();

            if(menu==0){
                System.out.println("종료.");
                break;
            }else if(!(menu >= 1 && menu <=3 )){
                System.out.println("잘못 선택함(종료는 0>)");
                continue;
            }
            System.out.println("선택하신 메뉴는 "+menu+"입니다.");





        }
    }
}
