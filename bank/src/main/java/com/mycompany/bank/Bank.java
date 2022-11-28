/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bank;

/**
 *
 * @author Abdulrhman
 */
import java.util.Scanner;


public class Bank extends services {

    public static void main(String[] args) {

        
        System.out.println("Enter your choice: ");

        Scanner input = new Scanner(System.in);
        
        services mybank = new services();
       
        do{
        System.out.println( "1. Create a new account\n 2. Display all account details\n 3. Deposit the amount \n 4. Withdraw the amount \n 5. other servicess ");
            int a = input.nextInt();
        switch(a){
        
            case 1:{
            mybank.newAccount();
            break;
            }
            case 2:{
            mybank.showAccounts();
            break;
            }
            case 3:{
            mybank.depositAccount();
            break;
            }
            case 4:{
            mybank.withdrawMoney();
            break;
            }
            case 5:{
            mybank.other_servicess();
            }        }
        
        }while (true);
    }
}