package java_Git_jimin;

import java.util.Scanner;

public class back_2440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = n; j > 0; j--) {
				if(j <= n-i ) {
					System.out.printf("*");
				}else {
					System.out.printf(" ");
				}

			}
			 System.out.println(" ");

		}

	}

}
