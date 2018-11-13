/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccounts;
import java.util.*;
/**
 *
 * @author Chester Heitman
 */
public class BanckAccounts 
{
    public static void main(String[] args)
    {
        ArrayList<Account> accounts = new ArrayList<Account>();
     
//        Account aAccount = new Account(0);
//         aAccount.setBalance(0);  
//         aAccount.credit(00.00);
//         aAccount.debit(0.00);
                  
         SavingsAccount Save1 = new SavingsAccount (0, 0.25);
         System.out.println("Savings Account ");
         Save1.setBalance(100);
         System.out.println("initial deposit: " + Save1.getBalance());
         Save1.credit(50.00);
         Save1.debit(175.00);
         //Save1.interestRate(.25);
         
        
         System.out.println();
         CheckingAccount Ck1 = new CheckingAccount(0, 0.05);
         System.out.println("Checking Account");
         Ck1.setBalance(200);
         System.out.println("Initial Deposit: " + Ck1.getBalance());
         Ck1.debit(75);
        
      
        Ck1.debit(200.00);
         
         //Ck1.Fee (2.50);
         //System.out.println("Debit fee: " + Ck1.getFee());
         Ck1.credit(150);
         
         
         
         //accounts.add(aAccount);
         accounts.add(Save1);
         accounts.add(Ck1);
    }
}


