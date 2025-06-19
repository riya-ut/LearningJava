import java.util.Scanner;

class InvalidUserException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid card details. Try again!";
    }

}

class ATM {
    private int accNum = 12345;
    private int pin = 9999;
    private int an;
    private int pwd;

    public void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account number");
        an = scan.nextInt();
        System.out.println("Enter pin");
        pwd = scan.nextInt();
    }

    public void validate() throws InvalidUserException {
        if (accNum == an && pin == pwd) {
            System.out.println("Collect your cash");
        } else {
            InvalidUserException iue = new InvalidUserException();
            System.out.println(iue.getMessage());
            throw iue;
        }
    }

}

class Bank {
    public void initiate() {
        ATM atm = new ATM();
        try {
            atm.acceptInput();
            atm.validate();
        } catch (Exception e) {
            try {
                atm.acceptInput();
                atm.validate();
            } catch (Exception f) {
                try {
                    atm.acceptInput();
                    atm.validate();
                } catch (Exception g) {
                    System.out.println("Card is blocked!");
                }
            }
        }
    }

}

public class customExcLic {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.initiate();

    }

}