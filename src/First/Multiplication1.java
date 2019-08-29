package First;

public class Multiplication1 {


public static int multiplication(int x, int y) {
	
	if( y == 0) 
		return 0;
	else if (y > 0){
		return x;
	}
	
    return 0;	
}

public static int multiply(int x, int y) {
	int result=0;
	for (int i=0; i<y; i++) {
		result = result + x;
	}
	return result;
}
	
public static void main(String args[]) {
	System.out.println("==>"+multiply(10,0));
}

}
