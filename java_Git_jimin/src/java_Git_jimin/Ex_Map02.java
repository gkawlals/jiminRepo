package java_Git_jimin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex_Map02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메소드를 new로 올리면 자바가 스스로 메모리를 지우지 않음
		List<Map<String, String>> Dlis = new ArrayList<>();
		// 위에 어레이리스트에 
		Map<String, String> pMap = new HashMap<> ();
		// 번호받아서 출력
		/*
		 * Scanner sc = new Scanner(System.in); String st; System.out.println("번호입력");
		 * st = sc.nextLine();
		 */
		/*
		 * String.valueOf(st); pMap.put("num", st);
		 */
		pMap.put("name","jimin");
		pMap.put("email","jimin@");
		pMap.put("add","soul"); 
		pMap.put("dept","data");
		
		//리스트에 map값을 넣어준다 
		Dlis.add( pMap);
		// 반드시 널값으로 메모리를 지운다  
		// null값을 시키면 선언상태로 변하는 것이다.
		pMap = null;
		
		//아래와 선언을 다시 안해주는 현상이 변수의 재사용이다. 
		pMap  = new HashMap<>();
		//Scanner sc = new Scanner(System.in);
		//st = null;
		
		// 변수명을 선언하는 꿀팁 r은 출력 p는 입력 이다.
		/*
		 * System.out.println("번호입력"); st = sc.nextLine(); String.valueOf(st);
		 * pMap.put("num", st);
		 */
		pMap.put("name","jimin1");
		pMap.put("email","jimin2");
		pMap.put("add","jimin3");
		pMap.put("dept","jimin4");
		
		Dlis.add(pMap);
		
		// 반드시 널값으로 메모리를 지운다 
		pMap = null;
		for(int i = 0; i < Dlis.size();i++ ) {
			
		
		System.out.println(Dlis.get(i));
		
		}
		/*Iterator<Map<String, String>> it = Dlis.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }*/
		Iterator<Map<String, String>> it = Dlis.iterator();
		while(it.hasNext()) {
			Map<String, String> rmap = it.next();
			
			System.out.println("####### 반복 시작 !########");
			System.out.println( rmap.get("name"));
			System.out.println( rmap.get("num"));
			System.out.println( rmap.get("email"));
			System.out.println( rmap.get("add"));
			System.out.println( rmap.get("dept"));
			
			rmap = null;
			System.out.println("$$$$$$$$$$$$$$$$$$$$$");
		}
		
		
	}

}
