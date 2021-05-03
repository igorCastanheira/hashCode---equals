package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program2 {
	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		// union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b); //uniao conjunto a com b
		System.out.println(c);
		
		// intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);  // unir só o que é comum nos dois arrays
		System.out.println(d);
		
		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b); // oque existe no conjunto a e nao existe no conjunto b
		System.out.println(e);
	}
}
