package functions;

import java.io.File;
import java.util.Scanner;
	
public class PasswordStore {
	public static void fileReader(String input) throws Exception{
	    Scanner sc = new Scanner(new File("userinfo"));
	    while(sc.hasNextLine()){
	    	String sline = sc.nextLine();
	        String s = sline.substring(0, sline.indexOf("||"));
	        System.out.println(s);
	        if (s.equals(input)) {
	        	System.out.println("Line Found\n" + sline);
	        }
	    }
	}
}
    




