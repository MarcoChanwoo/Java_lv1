import java.util.Scanner;
public class day08_조건문_지하철추가요금 {
    /*
	 * # 지하철 요금 계산
	 * 1. 이용할 정거장 수를 입력받는다.
	 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
	 * 3. 요금표
	 * 1) 1~5	: 500원
	 * 2) 6~10	: 600원
	 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)
	 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
	 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)	
	 * 특징=> 10정거장 이후부터는 2정거장씩 추가 이용시마다 50원씩 추가(바가지)
	 * 최종적으로 이용한 정거장에 따라 발생하는 비용 계산하기.
	 * ... 
	 */
    public static void main(String[] args) {
        
//		이용할 변수를 생각해보자
//		이용할 정거장 횟수를 입력 => stn
//		10정거장 이후부터 두정거장마다 50원이 추가되므로 cnt 변수를 통해 이동거리를 카운트하기
//		발생되는 최종 비용을 저장하는 변수 => toll
		
		// 변수
		int stn = 0; // 입력받을 정거장 수
		int toll = 650; // 11정거장부터 발생되는 기본요금
		int addPee = 50; // 50원씩 추가운임
		int overStn = 0; // 11정거장부터 이동할 정거장 갯수

		// 1. 이동할 정거장 수 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("이동할 정거장 수 입력>");
		stn = scan.nextInt();

		// 0 정거장
		if (stn == 0) {
			System.out.println("최소 한 정거장 이상 이동");
		}
		// 1~5 정거장
		if (stn >= 1 && stn <= 5) {
			System.out.println("요금: 500원");
		}
		// 6~10 정거장
		if (stn >= 6 && stn <= 10) {
			System.out.println("요금: 600원");
		}
		// 11번째 정거장부터
		if (stn >= 11) {
			overStn = stn - 11; // 입력한 정거장 - 11(추가 시작되는 구간)
			addPee = (overStn / 2) * addPee;
			toll += addPee;
			System.out.println("요금: " + toll + "원");
		}
		
		
		
		
//		제 2안 - 총 이동 가능한 정거장이 n개라고 정해졌다 가정할 때
//		if(stn > 0 && stn <= 30) { // 총 30 정거장 이동
//			if(stn >= 1 && stn <= 5) {
//				System.out.println("요금: 500원");
//			}
//			if(stn >=6 && stn <= 10) {
//				System.out.println("요금: 600원");
//			}
//			if(stn >= 11) { // 11번째 정거장부터
//				overStn = stn - 11; // 입력한 정거장 - 11(추가 시작되는 구간)
//				addPee = (overStn/2)*addPee;
//				toll += addPee;
//				System.out.println("요금: "+toll+"원");
//			}
//		}else if(stn == 0 || stn > 30){
//			System.out.println("이동이 불가합니다.");
//		}

		
        
    }
    
}
