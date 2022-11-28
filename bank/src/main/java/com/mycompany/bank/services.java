/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank;

/**
 *
 * @author Abdulrhman
 */
 import java.util.*;
class services {
    int accnum;
    String name;
    String acctype;
    int Birthday;
    int Password;
    long balanceAmount;
    long balanceAmount1;
    long balanceAmount2;
    long balancedep;
    long balanceAmountwith;
    long invest;
    int id;
    long with;
  
    Scanner input = new Scanner(System.in);

    public void newAccount() {
System.out.print("Please Fill ur personal information carefully \n");
        System.out.print("Enter Your Account id: ");
        accnum = input.nextInt();
        System.out.print("Enter your FullName: ");
        name = input.nextLine();
        System.out.print("Account type (personal or company): ");
        acctype = input.nextLine();
        System.out.print("Enter Birthday: ");
        Birthday = input.nextInt();
        System.out.print("Enter  Password: ");
        Password = input.nextInt();
        System.out.print("Enter Your Balance: ");
        balanceAmount = input.nextLong();

    }

    public void showAccounts() {
       System.out.print("All Accounts :");
        System.out.println("Name : ahmed \n Birthday : 2002/12/2 \n Account id : 65281627 \n Account tpye: personal \n balance : 7531$ \n ");
        System.out.println("--------------------------------------------------------");
        System.out.println("Name : akram \n Birthday : 1990/1/21 \n Account id : 97642340 \n Account tpye: personal \n balance : 12900$ \n ");
        System.out.println("--------------------------------------------------------");
        System.out.println("Name : ali \n Birthday : 1985/4/2 \n Account id : 3090012 \n Account tpye: company \n balance : 4309888$ \n ");
        System.out.println("--------------------------------------------------------");
        System.out.println(" Your FullName is: " + name);
        System.out.println("Your Account id is: " + accnum);
        System.out.println(" Your Birthday is: " + Birthday );
        System.out.println("Your Account Type is: " + acctype);
        balanceAmount = balanceAmount  + balancedep  - balanceAmountwith ;
       System.out.println("Your Balance is: " + balanceAmount   );
    }

    public void depositAccount() {
        long amount;
        System.out.println("Be Carefull to put your correct id." );
        System.out.println("Enter Your Account id :");
        id = input.nextInt();
        if (id == accnum ) {
            System.out.println("Enter the account you want to deposit:");
        amount = input.nextLong();
        balancedep = amount + balancedep;
        System.out.println("Successfully Deposit " + " " + " Your Balance is" + " " + balancedep);
        }else {
        System.out.println("There are no account" + " " +id);
    }}

    public void withdrawMoney() {

        long amount1;
        System.out.println("Enter the withdraw amount:");
        amount1 = input.nextLong();
        if (amount1 >= balanceAmountwith) {
            balanceAmountwith = balanceAmount - amount1;
            System.out.println(" Transaction Successfully ");
//            
        } else {
            System.out.println("You balance is less than the amount" + "\n Failed to withdraw");
        }
    }
    public void other_servicess(){
        System.out.println("We have other services which are \n 1 invest \n 2 Book your hotel ");
        int inv = input.nextInt();
        if (inv == 1) {
            System.out.println("you choose to invest");
            System.out.println("Enter the amount you want to invest with");
            invest = input.nextLong();
            if (invest < balanceAmount) {
                System.out.println(" INVESTMENT Successfully ");
            } else {
                System.out.println("You dont have enogh money");
            }
        }
        if(inv == 2){
            int book;
            System.out.println("Choose any of those hotels to book to: \n 1. ADENHOTEL \n 2. Sanaahotel \n 3. Taizhotel");
            book = input.nextInt();
            System.out.print("You choose : " + " " + book);
        
        }

}
}
    

