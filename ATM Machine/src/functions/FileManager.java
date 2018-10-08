package functions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.mindrot.BCrypt;

public class FileManager {
	public static String encrypt(String input) throws IOException {
		String hashed = BCrypt.hashpw(input, BCrypt.gensalt());
		/*System.out.println(hashed);
		if (BCrypt.checkpw("test input", hashed))
			System.out.println("It matches");
		else
			System.out.println("It does not match");*/
		return hashed;
	}
	
	public static void fileCreate() throws IOException {
		
			String str = "User Information";
		    BufferedWriter writer = new BufferedWriter(new FileWriter("userinfo"));
			writer.write(str);			     
			writer.close();
	}
	
	public static void fileAppend(String input) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("userinfo", true));
	    writer.append(input);     
	    writer.close();
	}
	
	public static boolean fileReader(String input) throws Exception{
	    Scanner sc = new Scanner(new File("userinfo"));
	    while(sc.hasNextLine()){
	    	String sline = sc.nextLine();
	        String s = sline.substring(0, sline.indexOf("||"));
	        System.out.println(s);
	        if (s.equals(input)) {
	        	System.out.println("Line Found\n" + sline);
	        	return true;
	        }
	    }
	    return false;
	}
}

