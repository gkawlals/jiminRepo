package java_Git_jimin;
import java.util.*;
public class Git_t1 {
	
	public static void main(String[] args) {
		float x;
		String c;
		int a;
		String[][] b = new String [6][7];
		//String [] [] ex = new String[6][7];
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ 13�ڸ��� �Է����ּ��� ");
		b[6][7] = sc.next();
		System.out.printf("�ֹι�ȣ �̰� �¾�? : %s",b[6][7]);
		System.out.println("�Ǽ��� �Է����ּ��� ");
		x = sc.nextFloat();
		
		System.out.printf("�Ǽ��� ���� �����Դϴ� : %f\n",x);
		
		System.out.println("������ �Է��� ");
		a = sc.nextInt();
		System.out.printf(" �Է��� ������ %d �̰� �´�? \n",a);
		System.out.println("�ܾ �Է��� ");
		c = sc.next();
		System.out.printf("�Է��� �ܾ�� %s �̰� �´�?",c);
		

	}

}
