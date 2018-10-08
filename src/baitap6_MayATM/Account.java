package baitap6_MayATM;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annuallnterestRate = 0;
    private Date dateCreated;
    private double monthlyInterestRate;

    public Account() {
    }

    public Account(int id, double balance, double annuallnterestRate, Date dateCreated) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInteresRate() {
        this.monthlyInterestRate = this.annuallnterestRate / 12;
        return this.monthlyInterestRate;
    }

    public double withdraw(double money) {
        System.out.println("Đã rút ra "+money+" khỏi tài khoản");
        return this.balance -= money;
    }

    public double deposit(double money) {
        System.out.println("Đã gửi thêm "+money+" vào tài khoản");
        return this.balance += money;
    }
}
