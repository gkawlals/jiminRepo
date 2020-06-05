package java_Git_jimin;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Array_Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nl = new ArrayList <> ();
		
		nl.add("วิม๖นฮ0");
		nl.add("วิม๖นฮ1");
		nl.add("วิม๖นฮ2");
		nl.add("วิม๖นฮ3");
		nl.add("วิม๖นฮ4");
		
		Iterator<String> it =  nl.iterator();	
		System.out.println("<" + it.next() + ">");
		
		while(it.hasNext()) {			
		
			
			
			System.out.println("ภฬธง " +  it.next());
			

			
		}
	}

}
