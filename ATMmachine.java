// package Oops;

import java.util.Scanner;

class ATM{
    float balance;
    int PIN=5674;
    ATM(){
        System.out.println("enter your pin");
        Scanner sc=new Scanner(System.in);
        int pin=sc.nextInt();
        if(pin==PIN) menu();
        else{ System.out.println("enter the valid pin!");
        // ATM();
      checkPin();
    }
    }
    void checkPin(){
        System.out.println("enter your pin");
        Scanner sc=new Scanner(System.in);
        int pin=sc.nextInt();
        if(pin==PIN) menu();
        else{ System.out.println("enter the valid pin!");checkPin();}
    }
    void menu(){
        System.out.println("enter your choice");
        System.out.println("1. check balance");
        System.out.println("2. withdraw money");
        System.out.println("3. deposit money");
        System.out.println("4. exit");
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1) checkBalance();
        else if(opt==2)withDraw();
        else if(opt==3)deposit();
        else if(opt==4)return;
        else System.out.println("enter a valid choice!");
    }
    void checkBalance(){
        System.out.println("Balance : "+balance);
        menu();
    }
    void withDraw(){
        System.out.println("enter the amount to withdraw");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>balance)System.out.println("insufficient balance");
        else{
            balance-=amount;System.out.println("money withdrawal successful");
        }
        menu();
    }
    void deposit(){
        System.out.println("enter the amount");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        balance+=amount;
        menu();
    }

}
public class ATMmachine {
    public static void main(String[] args) {
        ATM process=new ATM();
        // process.checkPin();
    }
}
