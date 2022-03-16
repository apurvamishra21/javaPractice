package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class HotelTS {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet(new HotelByDescRating());
		ts.add(new Hotel("Mayfair" ,9));
		ts.add(new Hotel("Madhuban" , 8));
		ts.add(new Hotel("Moksh" ,7));
		ts.add(new Hotel("Megha" , 6));
		ts.add(new Hotel("Mayuri" , 5));
		
		System.out.println(ts);
		
	
	
//	for(Object obj : ts) {
//		
//		Hotel h1 = (Hotel)obj;
//		System.out.println(h1);
//	}
		
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			Hotel h1 = (Hotel)obj;
			System.out.println(h1);
		}
	}
	
	

}
