package functions;

import java.util.Base64;

public class Encryptor {
	public static void main (String[] args) {
		String originalInput = "test input";
		String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
		System.out.println(encodedString);
	}
}