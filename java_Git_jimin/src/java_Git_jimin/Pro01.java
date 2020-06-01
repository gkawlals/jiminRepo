package java_Git_jimin;
import java.util.*;
public class Pro01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//45가지의 정수값을 저장하기 위한 배열 생성
		int[] ball = new int[45];
		
		int temp = 0;//두 값을 바꾸는데 사용할 임시 변수
		
		int j = 0; // 임의의 값을 얻어서 저장할 변수 
		
		//배열의 각 요소에 1~45의 값을 저장합니다.
		for(int i = 0; i < ball.length; i++) 
			ball[i] = i + 1; //ball[0]의 1값을 저장 해줍니다.
			//System.out.println(ball[i]); 했는데 1~45나옴 
		
			//배열에 저장된 값이 잘 섞이도록 충분히 큰 반복횟수를 저장합니다
			// 배열의 첫 번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 저장합니다.
			for(int i = 0;i < 100; i++) {
				//배열의 범위(0~44)의 임의의 값을 얻는다
				j = (int)(Math.random() * 45);
				
				temp = ball[0];
				
				ball[0] = ball[j];
				
				ball[j] = temp;
			}
			//배열 ball의 앞에서부터 6개의 요소를 얻는다
			for(int i = 0; i < 6; i++) {
				System.out.println(ball[i]+" ");	
		}
	}

}
