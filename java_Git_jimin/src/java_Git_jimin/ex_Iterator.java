package java_Git_jimin;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class ex_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> na = new HashSet<String>();
		
		na.add("°´Ã¼ÁöÇâ");
		na.add("ÇÏµÓ");
		na.add("Mongo DB");
		
		Iterator<String> it = na.iterator();
		
		//int i = 1;
		
		//System.out.println("<" + na.get(0)+ " >");
		while(it.hasNext()) {
		String st = it.next();
			if(st.equals("ÇÏµÓ")) {
				System.out.println("<" + st +">" );
				//break;
			}else System.out.println(st);
			//i++;
			
						
		}

	}

}
