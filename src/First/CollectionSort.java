package First;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static List<String> list = new <String>ArrayList();

	public static String abc = new String("naga");

	public static void main(String args[]) throws ClassNotFoundException, NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException {
		list.add("naga");
		list.add("srikanth");
		list.add("hi");
		list.add("how");
		list.add("your");
		list = sortCollection(list);
		list.forEach(e -> System.out.println(e));

		Class abc = Class.forName("First.CollectionSortsssssssssssssssxdd12344444444");
		System.out.println("class object12 " + abc);
		System.out.println("class object2 " + abc);
		System.out.println("class object3 " + abc);
		System.out.println("class object4 " + abc);
		System.out.println("class object5 " + abc);
		Field field = abc.getField("abc");
		System.out.println("Field" + field);
		System.out.println("Field Name" + field.getName());
		System.out.println("field value" + field.get(field.getName()));
		System.out.println("field value");

	}

	private static List<String> sortCollection(List<String> collection) {
		Collections.sort(collection, (s1, s2) -> s1.compareTo(s2));
		return collection;
	}

}
