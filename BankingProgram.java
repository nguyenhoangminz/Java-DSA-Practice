import java.util.Scanner;
public class BankingProgram{
        static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException{

        int choice;
        double balance = 10;
        boolean validChoice = true;

        while(validChoice){
        System.out.println("**********************************");
        System.out.println("     Welcome to Minu's Bank");
        System.out.println("**********************************");
        System.out.println("Here are your services");
        System.out.println("1 - Display Balance");
        System.out.println("2 - Deposite Money");
        System.out.println("3 - Withdraw Money");
        System.out.println("4 - Exit");
        System.out.print("Please choose your number: ");
        if(!scanner.hasNextInt()){
            System.out.println("INVALID");
            scanner.nextLine();
            continue;
        }
        choice = scanner.nextInt();
        System.out.println("**********************************");
        switch(choice){
            case 1 -> showBalance(balance);
            case 2 -> {
                double check = deposite();
                if(check > 0){
                    balance += check;
                    Thread.sleep(1000);
                    System.out.println("Deposite Successfully");
                }else{
                    Thread.sleep(1000);
                    System.out.println("Deposite Failed");
                }
            }
            case 3 -> {
                double mistake = withdraw(balance);
                if(mistake > 0){
                    balance -= mistake;
                    Thread.sleep(1000);
                    System.out.println("Withdraw Successfully");
                }else{
                    Thread.sleep(1000);
                    System.out.println("Withdraw Failed");
                }
                
                
            }
            case 4 -> validChoice = false;
            default -> System.out.println("INVALID number");
        }
    }
    System.out.println("Thank you! Have a nice day");
    scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("You have $%.2f\n", balance);
    }
    static double deposite(){
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        if(!scanner.hasNextDouble()){
            System.out.println("INVALID");
            scanner.nextLine();
            return 0;
        }
        amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("Amount can't be negative !");
            return 0;
        }else{
            return amount;
        }
    }
    static double withdraw(double balance){
        double amount;
            System.out.print("Enter an amount to be withdrawn: ");
            if(!scanner.hasNextDouble()){
                System.out.println("INVALID");
                scanner.nextLine();
                return 0;
        }
        amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }else{
            return amount;
        }
    }
}