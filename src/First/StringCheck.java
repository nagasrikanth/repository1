package First;

public class StringCheck {
	
	
	
	public static void main(String args[]) {
		System.out.println(""+checkPol("madam"));
		
	}

	public static boolean checkPol(String s){
		boolean flag = false;		
		if(s.contentEquals(new StringBuffer(s).toString())) {
			flag = true;
			return flag;
		}
		return flag;
	}
}
