package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccount(77504, "Budi", 50000);
        Assert.assertEquals(bankAccount.deposit(2000), 52000);
    }

    @Test
    public void testWithdraw() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccount(400328, "Farandy", 70000);
        Assert.assertEquals(bankAccount.withdraw(50000), 20000);
    }

}