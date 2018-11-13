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
public class SavingsAccount extends Account
{
    private  double interestRate = .25;

        public SavingsAccount (double initialBalance, double interestRate )
        {
            super(initialBalance);
        }
        public double CalculateInterest(double interest )
        {
            return interestRate * acctBalance;
        }

        public void setInterestRate(double interestRate) 
        {
            this.interestRate = interestRate;
        }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }
        
        public double getInterestRate() 
        {
            return interestRate;
    }   

        
}

