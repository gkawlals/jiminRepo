package java_Git_jimin;

import java.util.Scanner;

public class codeup4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2���� �޾ƿͼ� 10������ ��ȯ�ϱ�
		Scanner sc = new Scanner(System.in);
		int a;
		String b;
		System.out.printf("2������ �Է����ּ���");
		b = sc.nextLine();
		a= Integer.valueOf(b, 2);
		 sc.close();
		 System.out.printf("�Է��� 2������ 10������ �ٲپ��� : %d",a);
	}

}
