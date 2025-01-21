package Encapsulation;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Money deposit");
        System.out.println("Enter 2 for Money Withdraw");
        System.out.println("Enter 3 for Balance Enquiry");
        int pin=0;
        int amount=0;
        int option=sc.nextInt();

        
        Bank b=new Bank();
        if(option==1){
        System.out.println("Enter Pin Number:");
        pin=sc.nextInt();
        System.out.println("Enter Amount To deposit:");
        amount=sc.nextInt();
        b.setAmount(pin, amount);

        }else if(option==2){
        System.out.println("Enter Pin Number:");
        pin=sc.nextInt();
        System.out.println("Enter amount to Withdraw:");
        amount=sc.nextInt();
        b.WithdrawAmount(pin, amount);


        }else if(option==3){
            System.out.println("Enter Your Pin:");
            pin=sc.nextInt();
            System.out.println("Your Total Amount:" + b.getAmount(pin) );

        }
        
    }
    
}
