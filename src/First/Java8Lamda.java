package First;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Lamda implements DefaultEx {
	public int i=20,y=30,z=40;
	private int pri=120;
	
	
	public static void main(String args[]) {

		walk walk = distance ->
		System.out.println("distance covered"+distance);
		walk.walk("10 miles");
		List<String> list = new <String>ArrayList();
		list.add("naga");
		list.add("srikanth");
		list.add("Navya");
		list.add("Abhinav");
		
		List filteredList = list.stream().filter(e -> e.startsWith("n")).collect(Collectors.toList());
		
		list.parallelStream().forEach(e->System.out.println("e"+e));
		Iterator it = filteredList.iterator();
		while(it.hasNext()) {
			System.out.println("it.next==>"+it.next());
		}
		
	}

}


class reflexionExample {
  public static void main(String args[]) throws ClassNotFoundException {
	  System.out.println("Hai");
	  Java8Lamda ex = new Java8Lamda();
	  Method methods[] = ex.getClass().getMethods();
	  
	  Class s = Class.forName("First.Java8Lamda");
	  System.out.println("s"+s.getName());
	  
	  //Class example = Class.forName("First.Java8Lamda");
	   Field fields[] = ex.getClass().getDeclaredFields();
	    
		Field f = null;
		try {
			f = ex.getClass().getDeclaredField("pri");
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // NoSuchFieldException
		f.setAccessible(true);
	   
	   for(Field i : fields) 
			  System.out.println("Field"+i.getName());
	   System.out.println("fields.length"+fields.length);
	  
	  for(Method i : methods) 
		  System.out.println("method"+i.getName());
	  
	  	Constructor cons[] = ex.getClass().getConstructors();
	  	
	  	for(Constructor i : cons) 
			  System.out.println("Constructor"+i.getName());
		  
	  	
	  
  }
}

@FunctionalInterface
interface walk {
	public void walk(String distance);
}

interface DefaultEx {
	default void walk(String species) {
		System.out.println(species + " walk accordingly");
	}
}