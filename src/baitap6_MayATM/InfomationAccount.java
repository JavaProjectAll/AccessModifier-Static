package baitap6_MayATM;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InfomationAccount {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int id;
        int chose;
        boolean check = false;
        Account[] acc = new Account[10];
        displayAcc(acc);
        System.out.println("Nhập id để kiểm tra tài khoản");
        id = sc.nextInt();
        for (int i = 0; i < acc.length; i++) {
            if (id == acc[i].getId()) check = true;
        }
        if (check) {
            do {
                System.out.println();
                System.out.println("MENU");
                System.out.println("1: check balana");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.println("Chọn phương thức bạn muốn kiểm tra: ");
                chose = sc.nextInt();
                if (chose >= 1 || chose <= 4) {
                    switch (chose) {
                        case 1:
                            System.out.println("Số tiền của bạn là " + acc[id].getBalance() + "$");
                            break;
                        case 2:
                            System.out.println("Nhập số tiền bạn muốn rút");
                            double with_money = sc.nextDouble();
                            if (with_money > acc[id].getBalance()) {
                                System.out.println("Bạn có "+acc[id].getBalance()+"$ không đủ tiền để rút");
                            }else {
                                System.out.println("Tổng số tiền của bạn là " + acc[id].withdraw(with_money) + "$");
                            }
                            break;
                        case 3:
                            System.out.println("Nhập số tiền bạn gửi thêm");
                            double money = sc.nextDouble();
                            acc[id].deposit(money);
                            System.out.println("Tổng số tiền của bạn là " + acc[id].getBalance() + "$");
                            break;
                        case 4:
                            System.exit(0);
                            break;
                    }
                } else {
                    System.out.println("Nhập lại giá trị");
                }
            } while (chose != 4);
        } else {
            System.out.println("Chọn lại id để kiểm tra tài khoản");
        }
    }

    private static void displayAcc(Account[] acc) throws Exception {
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse("10/11/2004");
        for (int i = 0; i < acc.length; i++) {
            acc[i] = new Account(i, 100, 5.5, date);
        }
//        Account acc = new Account(01, 1000000, 5.5, date);
//        System.out.println("ID = " + acc.getId());
//        System.out.println("Số tiền = " + acc.getBalance());
//        System.out.println("Thời gian tạo tài khoản " + acc.getDateCreated());
//        System.out.println("Phần trăm lãi theo năm " + acc.getAnnuallnterestRate() + " %");
//        System.out.println("Phần trăm lãi hàng tháng " + acc.getMonthlyInteresRate() + " %");
//        System.out.println("Tiền lãi hàng tháng " + acc.withdraw());
//        System.out.println("Tiền gửi thêm " + acc.deposit(5000000));
    }
}
