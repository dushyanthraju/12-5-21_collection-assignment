package collectionAssignment;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
	public static void convertToArray() {
		List<Integer> inputList = new ArrayList<Integer>();
		inputList.add(100);
		inputList.add(200);
		inputList.add(300);

		Integer[] array = (Integer[]) inputList.toArray(new Integer[inputList.size()]);

		System.out.println("[" + array[0] + "," + array[1] + "," + array[2] + "]");

	}

	public static void main(String[] args) {
		convertToArray();
	}
}

