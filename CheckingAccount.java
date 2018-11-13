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
public class CheckingAccount extends Account
{
      private double fee = 2.5;

    public CheckingAccount(double initialBalance, double fee) 
    {
        super(initialBalance);
    }

        public double debit(double amount)
            {
            if (acctBalance - amount <=0){
                acctBalance -= fee;
                System.out.println("Fee " + fee);
            }
         return  acctBalance;
     }
 @Override
    public void credit(double amount)
    {
        if (acctBalance - amount <= 0)
        {
            acctBalance -= fee;
            System.out.println("Fee " + fee);
        }
    }

    public void setAcctBalance(double acctBalance) {
        this.acctBalance = acctBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public double setFee(double fee) {
        this.fee = fee;
        return fee;
    }
        
    public double getAcctBalance() {
        return acctBalance;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public double getFee() {
        return fee;
    }

}

