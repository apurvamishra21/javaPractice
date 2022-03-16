package collections;

import java.util.Comparator;

public class HotelByDescRating implements Comparator {
	



	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		
		Hotel h1 = (Hotel)obj1;
		Hotel h2 = (Hotel)obj2;
		
		Integer i = h1.ratings;
		Integer j = h2.ratings;
		
	
		return -i.compareTo(j);
	}
}
