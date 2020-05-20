package java_Git_jimin;

import java.util.Scanner;

public class codeup7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// long 데이터 형 사용하여 합구하기 // 변수 앞에'-'를 붙이면 부호가 바뀐다. 
		Scanner sc = new Scanner(System.in);
		long a;
		long b;
		System.out.printf("합칠 첫 번째 숫자는 ? :  ");
		a = sc.nextLong();
		System.out.printf("합칠 두 번째 숫자는 ? :  ");
		b = sc.nextLong();	
		System.out.printf("합은  : %d \n", a*b);
		System.out.printf("합은  : %d ", (-a));
		

	}

}
