package java_Git_jimin;

import java.util.Scanner;

public class codeup8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아스키코드를 써보자2. 문자 하나 입력받아 다음 문자 띄우기
		Scanner sc = new Scanner(System.in);
		char a;
		int b;
		char c;
		System.out.printf("문자 아무거나 하나 입력해바");
		a = sc.next().charAt(0);
		b = (int)a;
		b+=1;
		c = (char) b;
		sc.close();
		System.out.println(c);

	}
}
