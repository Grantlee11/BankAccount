// This is a beginner project I did back when I first started learning Java years ago, I decided to redo it with a time limit to see how long it would take
// me to complete now.

// The program will ask the user for their account number, then assign a random value to serve as the account balance. The user will then be prompted to choose
// between the following: Check Balance, Withdraw Funds, Deposit Funds, and Exit

import java.util.*;

public class BankAccount
{
    public static void main(String []args)
    {
         Scanner myAccessNum = new Scanner(System.in);
         int num, choice, balance, withdraw, deposit;
         Random rand = new Random();

         // Currently, this has no real point other than to make the UI more believable, when I have some spare time I'll add in a Hashtable to make and organize user accounts
         // and give the ability to create an account from scratch
         System.out.print("Please Enter Your Account Number (4 digits): ");
         num = myAccessNum.nextInt();

         balance = rand.nextInt(1001);


         while (true)
         {
             System.out.println("\n1. Check Balance");
             System.out.println("2. Withdraw Funds");
             System.out.println("3. Deposit Funds");
             System.out.println("4. Exit");
             System.out.print("Make a selection (1, 2, 3, or 4): ");
             choice = myAccessNum.nextInt();

             switch (choice)
             {
                 case 1:
                 {
                     System.out.println("\nYour Account Balance is $" + balance);
                     break;
                 }
                 case 2:
                 {
                     System.out.print("\nHow Much Money Would You Like To Withdraw (in $1 increments): $");
                     withdraw = myAccessNum.nextInt();
                     balance -= withdraw;
                     break;
                 }
                 case 3:
                 {
                     System.out.print("\nHow Much Money Would You Like To Deposit (in $1 increments): $");
                     deposit = myAccessNum.nextInt();
                     balance += deposit;
                     break;
                 }
                 case 4:
                 {
                     System.out.print("\nEnjoy Your Day!");
                     return;
                 }
                 default:
                 {
                     System.out.println("Invalid Selection. Try Again.");
                 }
             }
         }
    }
 }
