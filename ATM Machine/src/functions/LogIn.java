package functions;

import java.io.IOException;
import java.util.Scanner;

public class LogIn {
	public static void main(String[] args) throws IOException, Exception {
		Header();
		getInfo();
	}
	public static void Header() {
		System.out.println("---------------------------\r\n" + 
				"|         Log In          |\r\n" + 
				"---------------------------");
	}
	public static void getInfo() throws IOException, Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("\nPlease enter your full legal name: ");
		String userandpass = scan.nextLine().replaceAll("[, ;]", "").toLowerCase();
		System.out.print("Please enter your password: ");
		String pass = scan.nextLine();
		userandpass += " " + pass;
		System.out.println(FileManager.fileReader(userandpass));
	}
}
