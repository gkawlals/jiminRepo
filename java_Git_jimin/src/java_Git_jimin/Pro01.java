package java_Git_jimin;
import java.util.*;
public class Pro01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//45������ �������� �����ϱ� ���� �迭 ����
		int[] ball = new int[45];
		
		int temp = 0;//�� ���� �ٲٴµ� ����� �ӽ� ����
		
		int j = 0; // ������ ���� �� ������ ���� 
		
		//�迭�� �� ��ҿ� 1~45�� ���� �����մϴ�.
		for(int i = 0; i < ball.length; i++) 
			ball[i] = i + 1; //ball[0]�� 1���� ���� ���ݴϴ�.
			//System.out.println(ball[i]); �ߴµ� 1~45���� 
		
			//�迭�� ����� ���� �� ���̵��� ����� ū �ݺ�Ƚ���� �����մϴ�
			// �迭�� ù ��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 �����մϴ�.
			for(int i = 0;i < 100; i++) {
				//�迭�� ����(0~44)�� ������ ���� ��´�
				j = (int)(Math.random() * 45);
				
				temp = ball[0];
				
				ball[0] = ball[j];
				
				ball[j] = temp;
			}
			//�迭 ball�� �տ������� 6���� ��Ҹ� ��´�
			for(int i = 0; i < 6; i++) {
				System.out.println(ball[i]+" ");	
		}
	}

}
