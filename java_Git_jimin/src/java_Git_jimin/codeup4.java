package java_Git_jimin;

import java.util.Scanner;

public class codeup4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2진수 받아와서 10진수로 변환하기
		Scanner sc = new Scanner(System.in);
		int a;
		String b;
		System.out.printf("2진수를 입력해주세요");
		b = sc.nextLine();
		a= Integer.valueOf(b, 2);
		 sc.close();
		 System.out.printf("입력한 2진수를 10진수로 바꾸었다 : %d",a);
	}

}
