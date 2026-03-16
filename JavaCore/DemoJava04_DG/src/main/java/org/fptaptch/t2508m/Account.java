package org.fptaptch.t2508m;

public class Account {
    private double balance;
    private String name;

    private void getBalance(){
        System.out.println("My balance is " + this.balance);
    }
    public void setBalance(double balance){
        this.balance += balance;
    }
    public void getInfor(){
        getBalance();
    }
}
