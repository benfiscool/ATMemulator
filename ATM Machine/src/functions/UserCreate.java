package functions;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

public class UserCreate {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		Header();
		UserSetup();
	}
	public static void Header() {
		System.out.println("-------------------------------------\r\n" + 
				"|         Create an account         |\r\n" + 
				"-------------------------------------");
	}
	private static void UserSetup() throws IOException {
		System.out.print("Thank you for choosing to create an account at Benny's Bank. Please enter your legal first and last name.\nName: ");
		String userandpass = scan.nextLine().replaceAll("[, ;]", "").toLowerCase();
		System.out.print("Please enter your new password: ");
		userandpass += " " + scan.next();
		FileManager.fileAppend(FileManager.encrypt(userandpass));
		System.out.println("Your account was created. You may sign in now.");
		LogIn.main(null);
	}
	//\nIt must include at least one upper case letter, lower case letter, number, and one of the following *, _, -, %, @.\nPassword: 
}
