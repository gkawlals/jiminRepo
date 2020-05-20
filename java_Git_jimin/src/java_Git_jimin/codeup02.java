package java_Git_jimin;

import java.util.*;

public class codeup02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8진수 받아와서 10진수로 변환하기
		Scanner sc = new Scanner(System.in);
		int a;
		String b;
		System.out.printf("8진수를 입력해주세요");
		b = sc.nextLine();
		a= Integer.valueOf(b, 8);
		 sc.close();
		 System.out.printf("입력한 8진수를 10진수로 바꾸었다 : %d",a);
		
	}	

}
