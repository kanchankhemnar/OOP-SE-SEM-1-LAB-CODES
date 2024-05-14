
/*Create following classes and Methods
class Account : Set balance(),Getbalance(),setAccount type(),getaccounttype
Class Bank: creatAccount(),withdrawAmount(),depositAmount(),displayinfo()
Class customer: getCustomerName(),setCustomerName(),getcustomerAge(),setCustomerAge()
Class saving account: setMinimumBalance (),withdraw() */
/*1.create account
2.deposit money
3.withdraw money
4.honor daily limit
5.check balance 
6.display account info */

import java.util.Scanner;

class Bank {
    String name, address, email, accountID;
    int age;
    long mobile, amount, withdrawamount;
    double balance;
    long limit = 50000;

    Scanner sc = new Scanner(System.in);

    Bank() {
        System.out.println("Enter your details-");
        // System.out.println("Enter account id: ");
        // accountID = sc.next();
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("Age: ");
        age = sc.nextInt();
        System.out.println("Email: ");
        email = sc.next();
        System.out.println("Mobile number: ");
        mobile = sc.nextLong();
        System.out.println("Address: ");
        address = sc.next();
        System.out.println("Intial money deposit: ");
        balance = sc.nextDouble();
    }

    int password() {
        System.out.println("Enter number password");
        int password = sc.nextInt();
        return password;
    }

    boolean access() {

        System.out.println("Enter your password ");
        int pass = sc.nextInt();
        if (pass == password()) {

            return true;
        } else {
            System.out.println("Wrong password plz get lost and complete assisgnments");
            return false;
        }
    }

    void depositAmount() {
        System.out.println("Enter amount to deposit: ");
        amount = sc.nextLong();
        System.out.println(amount + "/- amount deposited");

    }

    void withdrawAmount() {
        System.out.println("Enter amount to be withdrawn: ");
        withdrawamount = sc.nextLong();
        if (withdrawamount <= limit && withdrawamount <= balance) {

            System.out.println(withdrawamount + "/- amount is withdrawn");
        } else if (withdrawamount > balance) {
            System.out.println("You are out of balance.");
        } else {
            System.out.println("This amount is exceeding daily limit.");

        }
    }

    void dailyLimit() {
        limit = 50000 - withdrawamount;
        System.out.println("Daily limit remaining: " + limit);
    }

    void display() {

        System.out.println("------------------------------------------------------");
        System.out.println("Name: " + name + "\t\t\tage: " + age + "\nMobile: " + mobile
                + "\tEmail: " + email + "\nAddress: " + address);
        System.out.println("------------------------------------------------------");

    }

    // class Account : Set balance(),Getbalance(),setAccount type(),getaccounttype
    void setAccountType() {
        System.out.println(
                "Enter account type-\n1-Savings Bank Account\n2-Current Deposit Account\n3-Fixed Deposit Account");
        sc.nextInt();
        System.out.println("Daily limit for your account type is 50,000/-");
    }

    void Getbalance() {
        balance = balance + amount - withdrawamount;
        System.out.println("Current balance: " + balance);
    }

    // void show() {
    // System.out.println("accountID " + accountID);
    // }

    // int arr[];
    // vector <int> arra[];

}

class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank[] b = new Bank[10];
        int choice;
        int i = 0;
        while (true) {
            int id = i + 1;
            System.out.println(
                    "Enter\n1.create account\n2.deposit money\n3.withdraw money\n4.honor daily limit\n5.check balance \n6.display account info\n0-stop");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    b[i] = new Bank();
                    b[i].password();
                    System.out.println("Your id: " + id);
                    i++;
                    break;

                case 2:
                    System.out.println("Enter id");
                    int id2 = sc.nextInt();
                    int id1 = id2 - 1;
                    b[id1].access();
                    b[id1].depositAmount();
                    break;

                case 3:
                    System.out.println("Enter id");
                    id2 = sc.nextInt();
                    id1 = id2 - 1;

                    b[id1].access();
                    b[id1].withdrawAmount();
                    break;

                case 4:
                    System.out.println("Enter id");
                    id2 = sc.nextInt();
                    id1 = id2 - 1;

                    b[id1].access();
                    b[id1].dailyLimit();
                    break;

                case 5:
                    System.out.println("Enter id");
                    id2 = sc.nextInt();
                    id1 = id2 - 1;

                    b[id1].access();
                    b[id1].Getbalance();
                    break;
                case 6:
                    System.out.println("Enter id");
                    id2 = sc.nextInt();
                    id1 = id2 - 1;

                    b[id1].access();
                    b[id1].display();
                    break;
            }

            // System.out.println("Account ");
            // System.out.println(i + 1);
            // b[i].show();
            // break;

            if (choice == 0) {
                System.out.println("Operation terminated");
                break;
            }
        }
        sc.close();
    }

}
