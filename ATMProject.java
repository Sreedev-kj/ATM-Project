import java.util.*;

public class ATMProject {
     public static void main(String[] args) {
        
    
        int pin = 1234;
        int balance = 10000;
        int AddAmount = 0;
        int TakeAmount = 0;
        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pin number");
        int password = scanner.nextInt();

        if (password == pin) {
            System.out.println("Enter your name");
            name = scanner.next();
            System.out.println("Welcome " + name);

            while (true) {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 to take resipt");
                System.out.println("Press 5 to EXIT");

                int opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Your current balance is " + balance);
                        break;
                    case 2:
                        System.out.println("How much amount did you want to ADD to your account");
                        AddAmount=scanner.nextInt();
                        System.out.println("Successfully credited");
                        balance=AddAmount+balance;
                        break;
                        case 3:
                        System.out.println("How much amount did you want to take");
                        TakeAmount=scanner.nextInt();
                        if(TakeAmount>balance){
                            System.out.println("Your balance is insufficient");
                        }
                        else{
                            System.out.println("Successfully taken");
                            balance=balance-TakeAmount;
                        
                        }
                        break;
                        case 4:
                        System.out.println("Welcome to Our Bank ATM");
                        System.out.println("Available balance is "+balance);
                        System.out.println("Amount deposited "+AddAmount);
                        System.out.println("Amount taken "+ TakeAmount);
                        System.out.println("Thank You....");
                        break;
                }
                if(opt==5)
                {
                    System.out.println("Thank You Visit Again");
                    break;
                }
            }
        }
        else{
            System.out.println("Wrong pin number");
        }

    }

}
