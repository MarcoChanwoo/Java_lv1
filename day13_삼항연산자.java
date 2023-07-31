
public class day13_삼항연산자 {

    public static void main(String[] args) {
        int a = 10;
		int b = 0;
		
		if(a == 10) {
			b = 1;
		}else  {
			b = -1;
		}
		System.out.println(b);
		
		//삼항연산자 : 결과 = 비교 ? 참이면 여기를 결과에 저장  : 거짓이면 여기를 결과에저장 
		b = a == 10 ? 1 : -1; 
		System.out.println(b);
		// a == 10 인게 사실이면 ? 1 을 b에저장 
		// a == 10 인게 거짓이면 ? -1 을 b에저장 
        // 내 해석: a값이 10이 맞다면 1(true), 10이 아니라면 -1(false)을 b에 저장하라.
		
		// 위 와같은 상황이 생각보다 많이 나와서 한줄로 쓰면 편하긴하나 
		// 지금은 그냥 if문으로 하는것이 낫다. 익숙해지면 나중에 저절로 쓰게된다. 
		
    }

    
}