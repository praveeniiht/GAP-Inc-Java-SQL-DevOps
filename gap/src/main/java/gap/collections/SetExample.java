package collections;
import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet();
		hs.add(null);
		hs.add("praveen");
		hs.add("anil");
		hs.add("sunil");
		hs.add("kishore");
		hs.add("anil");
		hs.add("praveen");
		hs.add(null);
		System.out.println(hs);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("praveen");
		lhs.add("anil");
		lhs.add("sunil");
		lhs.add("kishore");
		lhs.add("anil");
		hs.add("praveen");
		System.out.println(lhs);
		
		TreeSet<String> ts = new TreeSet();
		ts.add("praveen");
		ts.add("anil");
		ts.add("sunil");
		ts.add("kishore");
		ts.add("anil");
		ts.add("praveen");
		System.out.println(ts);
		

	}

}
