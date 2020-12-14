import java.util.ArrayList;
//import java.util.Comparator;
import java.util.List;

class ArrayClass {
	int ArrayNo;

	public ArrayClass(int num) {
		this.ArrayNo = num;
	}

	public void printArray() {
		System.out.println("ArrayListof arraycalss wrote this" + this.ArrayNo);
//		return true;
	}
}

public class arrayclass {

	//private Object comparator;

	public static void main(String[] args) {
		
		//String
		String[] values = new String[3];
		values[0] = "example1";
		values[1] = "example2";
		values[2] = "example3";
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		System.out.println();
		//ArrayList
		List<String> list1 = new ArrayList<String>();
		list1.add("Array1");
		list1.add("Array2");
		list1.add("Array3");
//		list1.clear();
//		list1.removeAll(list1);
//		System.out.println(list1);
//		System.out.println(list1.get(0));
//		System.out.println(list1.get(1));
//		System.out.println(list1.get(2));
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println();
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		//Object comparator;
	//	list2.sort(Comparator.reverseOrder());
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		System.out.println();
//		list2.sort(Comparator.reverseOrder());
		//create new arrayclass
		List<ArrayClass> list3 = new ArrayList<ArrayClass>();
		//instance change
		ArrayClass a1= new ArrayClass(1);
		list3.add(a1);
		list3.add(new ArrayClass(2));
//		a1.printArray();
		for (int i = 0; i < list3.size(); i++) {
//		System.out.println()
				list3.get(i).printArray();
		
		}
	}
}
