package functions;

import java.util.Scanner;

public class LogIn {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Header();
		getInfo();
	}
	public static void Header() {
		System.out.println("---------------------------\r\n" + 
				"|         Log In          |\r\n" + 
				"---------------------------");
	}
	public static void getInfo() {
		System.out.println("Please enter your full legal name: ");
		String userandpass = scan.next();
		System.out.println("Please enter your password: ");
		userandpass += " " + scan.next();
	}
}
