package java_Git_jimin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_Map01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 해쉬맵을 import하는 방법 
		Map<String, String> pMap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String st;
		System.out.println("번호입력");
		st = sc.nextLine();
		String.valueOf(st);
		pMap.put("num", st);
		//데이터 저장하기
		pMap.put("name", "함지민");
		pMap.put("email", "hua4187@naver.com");
		pMap.put("dept", "데이터 분석과");
		
		// 데이터 불러오기 
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));
		System.out.println(pMap.get("num"));
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		// 응용으로는 서치문에서 원하는 컬럼 검색하면 나오기가능 
		// 응용으로는 추가 역시 가능하다.
		
		
	}

}
