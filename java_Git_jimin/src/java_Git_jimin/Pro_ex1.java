package java_Git_jimin;
import java.util.*;
public class Pro_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int [45];
		//ball�迭�� 45ĭ�� ����ش� 
		
		int temp = 0;
		//�� ���� �ٲٴµ� ����� �ӽ� ����
		int j = 0; 
		// ������ ���� �� ������ ���� 
		
		for(int i = 0; i < ball.length; i++) {
			//i�� [0]~[44]���� [0]~[45]������ �ٲ��ش�
		 ball[i] = i + 1;
		 //System.out.println(ball[i]); �ߵ����� �׽�Ʈ 
		}
		
		//�������� ���ڵ��� �����ش� 
		for(int i = 0; i < 100; i++) {
			j = (int)(Math.random() * 45 );
			
			temp = ball[0];
			
			ball[0] = ball[j];
			
			ball[j] = temp;
		}
		// ball[]6������ �������� �̾��ش�.
		for(int i = 0; i < 6; i++) {
			System.out.println(ball[i]+" ");
		}
		
	}

}
