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
		//�޼ҵ带 new�� �ø��� �ڹٰ� ������ �޸𸮸� ������ ����
		List<Map<String, String>> Dlis = new ArrayList<>();
		// ���� ��̸���Ʈ�� 
		Map<String, String> pMap = new HashMap<> ();
		// ��ȣ�޾Ƽ� ���
		/*
		 * Scanner sc = new Scanner(System.in); String st; System.out.println("��ȣ�Է�");
		 * st = sc.nextLine();
		 */
		/*
		 * String.valueOf(st); pMap.put("num", st);
		 */
		pMap.put("name","jimin");
		pMap.put("email","jimin@");
		pMap.put("add","soul"); 
		pMap.put("dept","data");
		
		//����Ʈ�� map���� �־��ش� 
		Dlis.add( pMap);
		// �ݵ�� �ΰ����� �޸𸮸� �����  
		// null���� ��Ű�� ������·� ���ϴ� ���̴�.
		pMap = null;
		
		//�Ʒ��� ������ �ٽ� �����ִ� ������ ������ �����̴�. 
		pMap  = new HashMap<>();
		//Scanner sc = new Scanner(System.in);
		//st = null;
		
		// �������� �����ϴ� ���� r�� ��� p�� �Է� �̴�.
		/*
		 * System.out.println("��ȣ�Է�"); st = sc.nextLine(); String.valueOf(st);
		 * pMap.put("num", st);
		 */
		pMap.put("name","jimin1");
		pMap.put("email","jimin2");
		pMap.put("add","jimin3");
		pMap.put("dept","jimin4");
		
		Dlis.add(pMap);
		
		// �ݵ�� �ΰ����� �޸𸮸� ����� 
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
			
			System.out.println("####### �ݺ� ���� !########");
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
