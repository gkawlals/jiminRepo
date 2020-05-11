package java_Git_jimin;

public class Ex_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for문을 이용하여 2개의 문장을 5번씩 찍어준다
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요 for2번째 입니다\n");
			System.out.println("##또 인사 오지게박습니다\n");
		}
		System.out.println("\n\n");
		//for문을 {}로 안 가두었을때 바로 아랫줄인 "hello forEx)2"문장만 3번 찍힌다
		for (int i = 0; i < 3; i++) 
			System.out.println("hello forEx)2");
			System.out.println("##또 인사 오지게 박습니다");
		
	}

}
