package oop1.ex;

public class Account {
    int balance; // 잔액

    void deposit(int amount) {     // 입금
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔고가 부족합니다.");
        }
    }
}
