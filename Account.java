/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccounts;
/**
 *
 * @author Chester Heitman
 */
public class Account 
{
   
    double acctBalance = 0;
    double initialBalance = .01 ;
    double fee = 2.50;
    double Isf = acctBalance - 35;
   
    

    
        

    public Account(double initialBalance) 
    {
        this.initialBalance = initialBalance;
    }
  
     public void credit(double amount)
     {
        acctBalance += amount;
        System.out.println("Deposit: " + amount 
                + "  Balance: " + acctBalance);
     }
     
     public double debit(double amount)
     {
        acctBalance -= amount;
       
            if(acctBalance < amount)
            {
                System.out.println("Insufficient funds " + " Fee" + Isf);
                System.out.println("Balance " + acctBalance + " Withdrawl fee " + fee);
            }
            
            else 
            {
                System.out.println("Withdrawl: " + amount + " Insufficeint funds");
            }        
                return acctBalance;
     }
     
     

   
        public double getBalance() 
        {
        return acctBalance;
        }

        public void setBalance(double acctBalance) 
        {
        this.acctBalance = acctBalance;
        }

//        public double getInitialBalance() 
//        {
//            return initialBalance;
//        }
//
//        public void setInitialBalance(double initialBalance) 
//        {
//            this.initialBalance = initialBalance;
//        }
}