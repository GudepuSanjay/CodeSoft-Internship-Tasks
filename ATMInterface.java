import java.util.Scanner;

public class ATMInterface {
    static Long total_amt = 0L;
    static Long amt;
    static Scanner reads = new Scanner(System.in);

    public static void withdraw() {
        System.out.println("ENTER AMOUNT TO WITHDRAW:");
        amt = reads.nextLong();
        if (amt > total_amt) {
            System.out.println("INSUFFICIENT BALANCE, YOU CAN'T WITHDRAW..");
            System.out.println("YOUR BANK BALANCE IS " + total_amt);
        } else {
            total_amt = total_amt - amt;
            System.out.println("SUCCESSFULLY WITHDRAWN " + amt);
            System.out.println("YOUR CURRENT BANK BALANCE IS " + total_amt);
        }
    }

    public static void deposit() {
        System.out.println("ENTER AMOUNT TO DEPOSIT:");
        amt = reads.nextLong();
        total_amt = total_amt + amt;
        System.out.println("SUCCESSFULLY DEPOSITED: " + amt);
        System.out.println("YOUR CURRENT BANK BALANCE IS: " + total_amt);
    }

    public static void checkbalance() {
        System.out.println("YOUR BANK BALANCE IS: " + total_amt);
    }

    public static void main(String[] args) {
        ATMInterface atm = new ATMInterface();
        boolean condition=true;
       while(condition){
        System.out.println("");
        System.out.println("WELCOME TO SBJ ATM...!!!!");
        System.out.println("WE WILL ASSIST YOU WITH THE FOLLOWING...!!!!");
        System.out.println("1. WITHDRAW AMOUNT");
        System.out.println("2. DEPOSIT AMOUNT");
        System.out.println("3. CHECK BALANCE");
        System.out.println("4. EXIT");
        
        
        System.out.println("ENTER YOUR CHOICE:");
        int response = reads.nextInt();
        
        switch (response) {
            case 1:
                atm.withdraw(); 
                break;
            case 2:
                atm.deposit();  
                break;
            case 3:
                atm.checkbalance();
                break;
            case 4:
                System.out.println("THANK YOU FOR USING SBJ ATM!");
                condition=false;
                break;
            default:
                System.out.println("INVALID CHOICE....!!!");
                break;
        }
    }
    
    }
   
}
