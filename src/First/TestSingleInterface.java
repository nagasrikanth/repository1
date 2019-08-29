package First;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class TestSingleInterface {
	
	static TestSingleInterface a = new TestSingleInterface();
	
	public static void main(String args[]) {
	      List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Mathoperation addition =  (a,b) -> a+b;
		Mathoperation subtraction = (a,b) -> a-b;
		Mathoperation multiplication = (a,b) -> a*b;
		Mathoperation division =(a,b) -> a/b;
		
		System.out.println("10 + 5 = > "+ a.operate(10,5,addition));
	      eval(list, n-> n%2 == 0 );

	}
	
	private int operate(int a, int b, Mathoperation operation) {
		return operation.operation(a, b);
	}
	
	 public static void eval(List<Integer> list, Predicate<Integer> predicate) {

	      for(Integer n: list) {

	         if(predicate.test(n)) {
	            System.out.println(n + " ");
	         }
	      }
	   }
}

interface Mathoperation {
	int operation (int a, int b);
}