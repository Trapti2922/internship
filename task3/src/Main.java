import java.util.Scanner;
class Bankaccount{
    private String accountno;
    private int pin;
    private long balance;
    Scanner sc=new Scanner(System.in);



public void createaccount(){
    System.out.print("enter account number");
    accountno=sc.next();
    System.out.println("enter pin");
    pin=sc.nextInt();
    System.out.println("enter balance");
    balance=sc.nextLong();}}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ATM {
    public static void main (String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("----****----ATM MACHINE----****----");
        Scanner sc=new Scanner(System.in);
        int balance;

        while(true)
        {
            System.out.println("Press 1 for withdraw");
            System.out.println("Press 2 for Deposit") ;
            System.out.println("Press 3 for Check Balance");
            System.out.println("Press 4 for exit");
            System.out.println("Enter your Choice");

            int choice=sc.nextInt();
            switch(choice)
            {case 1:
                System.out.println("enter amount to be withdrawn");
                int withdraw=sc.nextInt();

                if(balance >= withdraw){
                    balance = balance - withdraw;
                    System.out.println("****take your money****");

                }
                else{
                    System.out.println("****insufficient balance8****");

                }
                break;
                case 2:
                    System.out.println("Enter amount to be deposited");
                    int deposit=sc.nextInt();
                    balance= balance + deposit;
                    System.out.println("****Successfylly deposited****");
                    break;
                case 3:
                    System.out.println("your balance is:"+  balance);
                    break;
                case 4:
                    System.exit(0);


        }




    }
}}

