import java.util.*;

public class Sets {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		
		set1.add("Raebareli");
		set1.add("Lucknow");
		set1.add("Delhi");
		set1.add("Cochin");
		set1.add("Mumbai");
		set1.add("Shimla");
		set1.add("Singapore");
		set1.add("Chennai");
		set1.add("KanyaKumari");
		set1.add("Bangalore");
		set1.add("Rohtak");
		set1.add("Chandigarh");
		set1.add("Greater Noida");
		System.out.println("Set 1 is " + set1);
		
		set2.add("Singapore");
		set2.add("Chennai");
		set2.add("KanyaKumari");
		set2.add("Bangalore");
		set2.add("Rohtak");
		set2.add("Chandigarh");
		set2.add("Greater Noida");
		set2.add("Varanasi");
		System.out.println("Set 2 is "+ set2);
		
		set1.addAll(set2);
		System.out.println("Updated Set 1 is " + set1);
		
		set2.add("one");
		set2.removeAll(set1);
		System.out.println("Updaed Set 2 is "+ set2);
		
	}

}
