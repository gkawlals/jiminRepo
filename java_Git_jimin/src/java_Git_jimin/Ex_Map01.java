package java_Git_jimin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_Map01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ؽ����� import�ϴ� ��� 
		Map<String, String> pMap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String st;
		System.out.println("��ȣ�Է�");
		st = sc.nextLine();
		String.valueOf(st);
		pMap.put("num", st);
		//������ �����ϱ�
		pMap.put("name", "������");
		pMap.put("email", "hua4187@naver.com");
		pMap.put("dept", "������ �м���");
		
		// ������ �ҷ����� 
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));
		System.out.println(pMap.get("num"));
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
		// �������δ� ��ġ������ ���ϴ� �÷� �˻��ϸ� �����Ⱑ�� 
		// �������δ� �߰� ���� �����ϴ�.
		
		
	}

}
