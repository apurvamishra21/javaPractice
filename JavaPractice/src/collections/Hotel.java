package collections;

public class Hotel implements Comparable{
	
	String hotelName;
	int ratings;
	
	public Hotel(String hotelName , int ratings) {
		
		this.hotelName = hotelName ;
		this.ratings = ratings;
	}
	
	@Override
	public String toString() {
		
		return "hotelName :" + hotelName + "ratings :" + ratings;
		
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		
		Hotel h1 = this;
		Hotel h2 = (Hotel)obj;
		
		Integer i = h1.ratings;
		Integer j = h2.ratings;
		
		return i.compareTo(j);
	}

}
