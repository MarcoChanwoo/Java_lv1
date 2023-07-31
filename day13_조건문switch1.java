
public class day13_조건문switch1 {
    /*
	 * 	스위치 케이스 (switch case)
	 *  사용예 : 비교대상이 전부 == 일때만 사용가능 
	 *  모양이 많이 불편하다 (그냥 if문 쓰는게 낫다)
	 *  
	 * 1) switch    ==> 키워드
	 * 2) (값)       ==> 비교할값 
	 * 3) {}    	==> 영역 
	 * 4) case 값:   ==> 비교할값 
	 * 5)  내용  break ==> 비교할값과 내용 
	 */	
    public static void main(String[] args) {
        int a = 2;			
		//----------------------------------
		if(a == 1) {
			System.out.println("a 는 1이다");
		}else if(a == 2) {
			System.out.println("a 는 2이다");
		}else if(a == 3) {
			System.out.println("a 는 3이다");
		}		
		//----------------------------------
		switch(a) {
		case 1:
			System.out.println("a 는 1이다");
			break;
		case 2:
			System.out.println("a 는 2이다");
			break;
		case 3:
			System.out.println("a 는 3이다");
			break;
		}		

        // int a = 4;			
		// //----------------------------------
		// if(a == 1) {
		// 	System.out.println("a 는 1이다");
		// }else if(a == 2) {
		// 	System.out.println("a 는 2이다");
		// }else if(a == 3) {
		// 	System.out.println("a 는 3이다");
		// }else {
		// 	System.out.println("1~3은 아니다.");
		// }
		// //----------------------------------
		// switch(a) {
		// case 1:
		// 	System.out.println("a 는 1이다");
		// 	break;
		// case 2:
		// 	System.out.println("a 는 2이다");
		// 	break;
		// case 3:
		// 	System.out.println("a 는 3이다");
		// 	break;
		// default :
		// 	System.out.println("1~3은 아니다.");
		// }		

        /*
         * 원래 두 페이지로 나뉘었으나, 개념 부분이므로 하나로 합침. 변수 a가 겹쳐서 주석처리함
         */
    }
}