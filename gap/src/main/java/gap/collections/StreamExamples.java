package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList();
		ArrayList<String> ar1 = new ArrayList();
		// LinkedList ar = new LinkedList();
		ar.add("India");
		ar.add("China");
		ar.add("Japan");
		ar.add("America");
		ar.add("China");
		
		for(String n:ar) {
			if(n.charAt(0)=='I')
				ar1.add(n);
		}
		System.out.println(ar1);
		
		Predicate<String> p = str->str.charAt(0)=='C';
		Function<String,String> f =str->"Hai "+str;
		Stream s = ar.stream();
		
		List<String> ls  = (List<String>) s.map(f).collect(Collectors.toList());
		// filter or map
		//List<String> ls =(List<String>) s.filter(p).collect(Collectors.toList());
		System.out.println(ls);

	}

}
