package java_Git_jimin;
import java.util.*;
public class Pro_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int [45];
		//ball배열에 45칸을 잡아준다 
		
		int temp = 0;
		//두 값을 바꾸는데 사용할 임시 변수
		int j = 0; 
		// 임의의 값을 얻어서 저장할 변수 
		
		for(int i = 0; i < ball.length; i++) {
			//i가 [0]~[44]값을 [0]~[45]값으로 바꿔준다
		 ball[i] = i + 1;
		 //System.out.println(ball[i]); 잘들어가는지 테스트 
		}
		
		//베열안의 숫자들을 섞어준다 
		for(int i = 0; i < 100; i++) {
			j = (int)(Math.random() * 45 );
			
			temp = ball[0];
			
			ball[0] = ball[j];
			
			ball[j] = temp;
		}
		// ball[]6가지의 랜덤값을 뽑아준다.
		for(int i = 0; i < 6; i++) {
			System.out.println(ball[i]+" ");
		}
		
	}

}
