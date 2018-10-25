package functions;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StartUp {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		greeting();
		menuSelect();
	}
	
	public static void greeting() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println("--------------------------------------\n|  Benny's Bank                      |\n|  Where banking is done right       |\n|  "
				+ "Today's Date: " + dtf.format(now) +  "          |\n--------------------------------------");  
	}
public static void menuSelect() throws Exception {
		System.out.print("\nPlease select one of the following options:\n1.Create new account\n2.Sign in to an existing account\n");
		System.out.print("Please enter a selection: ");
        if(scan.hasNextInt()){
        	int selection = scan.nextInt();
        	if (selection == 1) {
        		System.out.println();
        		UserCreate.main(null);
        	}
        	else if (selection == 2) {
        		System.out.println();
        		LogIn.main(null);
        	}
        }
        else{
            scan.nextLine();
            System.out.print("Please enter a valid selection: ");
            Retry();
        }
		
	} 
	public static void Retry() throws Exception {
        if(scan.hasNextInt()){
        	int selection = scan.nextInt();
        	if (selection == 1) {
        		System.out.println();
        		UserCreate.main(null);
        	}
        	else if (selection == 2) {
        		System.out.println();
        		LogIn.main(null);
        	}
        }
        else{
            scan.nextLine();
            System.out.print("Please enter a valid selection: ");
            Retry();
        }
	}
}
