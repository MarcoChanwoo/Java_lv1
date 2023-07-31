
public class day12_for응용1문제 {

    public static void main(String[] args) {
        // for를 사용해서 풀어보세요
        // 문제1) 9의 배수중 일의 자리가 6인 첫번째 배수 출력 ==> 답 : 36
        for (int i = 9; true; i += 9) { // 범위를 정하지 않음
            if (i % 10 == 6) {
                System.out.print(i); // 처음 나오는 숫자
                break;
            }
        }
        System.out.println();

        // 문제2) 9의 배수중 십의 자리가 6인 첫번째 배수 출력 ==> 답 : 63
        for (int i = 9; true; i += 9) {
            if (i / 10 == 6) {
                System.out.print(i + " ");
                break;
            }
        }
        System.out.println();

        // 문제3) 8의 배수중 150보다 작고 150 에 가장 가까운수를 출력 ==> 답 : 144
        for (int i = 150; i >= 8; i--) {
            if (i % 8 == 0) {
                System.out.print(i);
                break; // 150에서 1씩 줄여나가면서 8의 배수가 나오면 되는거
            }
        }
        System.out.println();

        /*
         * break를 잊지 말자. 원하는 순간이 있다면 중간에 멈추도록 하는 고마운 것임
         */

        // 문제4) 7의 배수를 돌리면서 50을 넘기는 첫번째 수를 찾으시오
        for(int i=7; ;i+=7){ // 범위가 없을땐 true 혹은 빈칸
            if(i>50 && i%7==0){
                System.out.println(i);
                break;
            }
        }
        System.out.println();

        // 문제5) 4의 배수를 돌리며 70~90 사이의 모든 배수를 나열하시오
        for(int i=4;;i+=4){ // 범위 제한 없음
            if(i>=70 && i<=90){
                System.out.print(i+" ");
                break;
            } // 72만 나옴. 
        }

    }
}