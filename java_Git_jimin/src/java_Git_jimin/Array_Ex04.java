package java_Git_jimin;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Array_Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nl = new ArrayList <> ();
		
		nl.add("������0");
		nl.add("������1");
		nl.add("������2");
		nl.add("������3");
		nl.add("������4");
		
		Iterator<String> it =  nl.iterator();	
		System.out.println("<" + it.next() + ">");
		
		while(it.hasNext()) {			
		
			
			
			System.out.println("�̸� " +  it.next());
			

			
		}
	}

}
