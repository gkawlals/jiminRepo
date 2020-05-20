package java_Git_jimin;

import java.util.Scanner;

public class codeup5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아스키코드로 입력하면 정수로 받아오기
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.printf("알파벳을 입력해줘 ");
		char b = sc.nextLine().charAt(0);
		a = (int)b;
		 sc.close();
		 System.out.println(a);
	}

}
