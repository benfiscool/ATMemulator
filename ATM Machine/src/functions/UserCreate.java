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
	
	public static void main(String[] args) {
		Header();
		FileWrite(UserSetup());
	}
	public static void Header() {
		System.out.println("-------------------------------------\r\n" + 
				"|         Create an account         |\r\n" + 
				"-------------------------------------");
	}
	private static String[] UserSetup() {
		String userandpass[] = new String[2];
		System.out.print("Thank you for choosing to create an account at Benny's Bank. Please enter your legal first and last name.\nName: ");
		userandpass[0] = scan.nextLine().replaceAll("[, ;]", "").toLowerCase();
		System.out.print("Please enter your new password.\nIt must include at least one upper case letter, lower case letter, number, and one of the following *, _, -, %, @.\nPassword: ");
		String passraw = scan.nextLine();
		userandpass[1] = PasswordEncrypt(passraw);
		return (userandpass);
	}
	public static String PasswordEncrypt(String passraw){
		String passencrypted = Base64.getEncoder().encodeToString(passraw.getBytes());
		return passencrypted;
		}
	
	private static void FileWrite(String[] userandpass) {
		String username = userandpass[0];
		String password = PasswordEncrypt(userandpass[1]);
		Writer writer = null;

		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream("users.txt"), "utf-8"));
		    writer.write(username + " " + password);
		} catch (IOException ex) {
		    System.out.println("IO Exception");
		} finally {
		   try {writer.close();} catch (Exception ex) {/*ignore*/}
		}
	}
}
