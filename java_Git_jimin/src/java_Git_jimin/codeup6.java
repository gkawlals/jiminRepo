package java_Git_jimin;

import java.util.Scanner;

public class codeup6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 입력받 아스키 코드로 받아오기
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.printf("정수를 입력해줘 ");
		a = sc.nextInt();
		char b = (char)a;
		 sc.close();
		 System.out.println(b);
	}

}
