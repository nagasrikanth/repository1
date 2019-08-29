import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        StringTokenizer st = new StringTokenizer(s,"");
        while(st.hasMoreTokens()) {
        	System.out.println(st.nextToken());
        }
    }
}
