package java_Git_jimin;
import java.util.*;
public class Pro_ex12912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a ;
		int b ;
		
		a = sc.nextInt();
		b = sc.nextInt();
		long answer = 0;
		
		if (a<b) {
			answer = (a+b)/2;
			System.out.printf("%d",answer+a+b);
		}else if (a == b) {
			answer = b;
			System.out.printf("%d",answer);
		}
		
		
	}

}
