package java_Git_jimin;
import java.util.*;
public class Git_t1 {
	
	public static void main(String[] args) {
		float x;
		String c;
		int a;
		String[][] b = new String [6][7];
		//String [] [] ex = new String[6][7];
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 13자리를 입력해주세요 ");
		b[6][7] = sc.next();
		System.out.printf("주민번호 이거 맞아? : %s",b[6][7]);
		System.out.println("실수를 입력해주세요 ");
		x = sc.nextFloat();
		
		System.out.printf("실수를 받은 숫자입니다 : %f\n",x);
		
		System.out.println("정수를 입력헤 ");
		a = sc.nextInt();
		System.out.printf(" 입력한 정수는 %d 이게 맞니? \n",a);
		System.out.println("단어를 입력해 ");
		c = sc.next();
		System.out.printf("입력한 단어는 %s 이게 맞니?",c);
		

	}

}
