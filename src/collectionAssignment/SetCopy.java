package collectionAssignment;

import java.util.HashSet;

public class SetCopy {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		HashSet<String> copy = new HashSet<String>();
		hs.add("raju");
		hs.add("nani");
		System.out.println("Main :" + hs);
		copy = (HashSet) hs.clone();
		System.out.println("Copy :" + copy);
	}
}
