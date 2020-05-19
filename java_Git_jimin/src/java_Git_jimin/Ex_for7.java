package java_Git_jimin;
//import java.util.*;
public class Ex_for7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//별찍기 를 해보자 
		//System.out.println("별을 몇단으로 쌓을까요 ? : ");
		//int x ;
		//int a[] = new a[5];// [] [] [] [] []
		//x = sc.nextInt();
		for (int i = 1; i <= 5; i++) {
			for( int j = 1; j <= i; j++) {
				System.out.printf("*",j);
		}System.out.printf(" \n");
		}
		for (int i = 1; i <= 5; i++) {
			for( int j = 5; j >= i; j--) {
				System.out.printf("*",j);
		}System.out.printf(" \n");
		}
		
	}

}
