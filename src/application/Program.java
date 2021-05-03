package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		//Set<String> set = new HashSet<>(); //HashSet a ordem não importa;
		Set<String> set = new TreeSet<>(); //TreeSet é ordenado um pouco mais lento que Hash
		set.add("TV");
		set.add("Notebook");
		set.add("Table");

		//set.remove("Tablet");
		//set.removeIf(x -> x.length() >= 6); // Remova item x tal que -> x.length >= 3
		set.removeIf(x -> x.charAt(0)== 'T');// remove TV e o Tablet
		for (String p : set) {

			System.out.println(p);
		}
	}

}
