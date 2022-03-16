package collections;

import java.util.Comparator;

public class HotelByAscenName implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		
		Hotel h1 = (Hotel)obj1;
		Hotel h2 = (Hotel)obj2;
		
		String n1 = h1.hotelName;
		String n2 = h2.hotelName;
		
		// TODO Auto-generated method stub
		return n1.compareTo(n2);
	}

}
