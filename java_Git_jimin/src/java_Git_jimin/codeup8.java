package java_Git_jimin;

import java.util.Scanner;

public class codeup8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ƽ�Ű�ڵ带 �Ẹ��2. ���� �ϳ� �Է¹޾� ���� ���� ����
		Scanner sc = new Scanner(System.in);
		char a;
		int b;
		char c;
		System.out.printf("���� �ƹ��ų� �ϳ� �Է��ع�");
		a = sc.next().charAt(0);
		b = (int)a;
		b+=1;
		c = (char) b;
		sc.close();
		System.out.println(c);

	}
}
