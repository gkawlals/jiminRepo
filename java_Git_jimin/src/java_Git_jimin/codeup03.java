package java_Git_jimin;

import java.util.Scanner;

public class codeup03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//16���� �޾ƿͼ� 10������ ��ȯ�ϱ�
		Scanner sc = new Scanner(System.in);
		int a;
		String b;
		System.out.printf("16������ �Է����ּ���");
		b = sc.nextLine();
		a= Integer.valueOf(b, 16);
		 sc.close();
		 System.out.printf("�Է��� 16������ 10������ �ٲپ��� : %d",a);
	}

}
