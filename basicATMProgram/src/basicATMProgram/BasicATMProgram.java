package basicATMProgram;
import java.util.Scanner;
public class BasicATMProgram {

	public static void main(String[] args) {
		
		double balance=0.0;
		int choice =0;
		
		while(choice!=4) {
		System.out.println("**************");
		System.out.println("Basic ATM");
		System.out.println("--------------");
		System.out.println("1.Show balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Quit");
		System.out.println("**************");
		
		Scanner sc = new Scanner (System.in);
		System.out.println("\nchoose: ");
		 choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Your current balance is: "+ balance);
		    break;
		case 2:
			System.out.println("Enter your money to be deposited: $");
			double depositAmount = sc.nextDouble();
			if(depositAmount>0) {
				balance += depositAmount;
				System.out.println("$ deposited sucess " + depositAmount);
			}
			else {
				System.out.println("deposited amount must be positive");
			}
			
			break;
			
		case 3:
			System.out.println("Enter withdrawed amount: $");
			double withdrawAmount = sc.nextDouble();
		    if(withdrawAmount>0 && withdrawAmount<=balance) {
		    	balance -= withdrawAmount;
		    	System.out.println("$ withdraw sucess " + withdrawAmount);
		    }
		    else if(withdrawAmount > balance) {
		    	System.out.println("insufficent balance");
		    }
		    else {
		    	System.out.println("withdraw amount must be positive");
		    }
		    break;
		    
		case 4:
			System.out.println("Thank you for using this ATM.");
			break;
			
			default:
				System.out.println("invalid choice");

		}
		
		System.out.println("");
	}
}

}
/*Basic ATM:
	1. Show Balance
	2. Deposit
	3. Withdraw
	4. Quit
	
	hints:
		1. scanner
		2. switch .. case
		3. deposit, withdraw logic
		
*/