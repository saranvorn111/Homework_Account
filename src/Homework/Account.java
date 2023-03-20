package Homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Account {
    int id;
    double balance;
    String ownerName;

    public static <T> int getId(T t) {
        return 0;
    }
    public static <T> double getBalance(T t) {
        return 0;
    }
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }


}

