package Homework;

import java.util.*;

public class Main {
    //acc id owner balance
    //add acc add edit remove show
    //show account information
    // 1 . descending order by account_id
    // 2.  ascending order by account_id
    // 3. descendinder order by balance
    public static void main(String[] args) {

        int option;
        List<Account> accountList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("--------------------------------");
            System.out.println("1: Add account:");
            System.out.println("2. Edit Account ");
            System.out.println("3: Remove Account: ");
            System.out.println("4. Show account infor:");
            System.out.println("5. Exit ");
            System.out.println("-------------------------------");
            System.out.println("Choose option ( 1 - 5 ) : ");
            System.out.println("-------------------------------");
            option = input.nextInt();
            switch (option) {
                case 1:
                    // enter account information
                    // object add list
                    //accountList.add();
                    System.out.println("Enter your account infor");
                    Account acc = new Account();
                    System.out.print("Input ID:");
                    acc.id = input.nextInt();
                    System.out.print("Name:");
                    input.nextLine();
                    acc.ownerName = input.nextLine();
                    System.out.print("Balance:");
                    acc.balance = input.nextInt();

                    accountList.add(acc);
                    //Iterator<String> i = accountList.iterator();

                    break;
                case 2:
                    boolean eid = false;
                    System.out.print("Input the account ID to edit : ");
                    int editID = input.nextInt();
                    for (Account account : accountList) {
                        if (account.id == editID) {
                            eid = true;
                            System.out.println("---------------Input new account information-----------");
                            System.out.print("Input new account Name : ");
                            input.nextLine();
                            account.ownerName = input.nextLine();
                            System.out.print("Input new Balance : ");
                            account.balance = input.nextDouble();
                            System.out.println("Account with ID : " + editID + " It is successfully.");
                        }
                    }
                    if (!eid) {
                        System.out.println("Wrong ID, Please input ID again.");
                    }
                    break;
                case 3:
                    boolean Searchid = false;
                    System.out.print("Input the account ID to remove : ");
                    int removeID = input.nextInt();
                    Iterator<Account> iterator = accountList.iterator();
                    while (iterator.hasNext()) {
                        Account a = iterator.next();
                        if (a.id == removeID) {
                            Searchid = true;
                            iterator.remove();
                            System.out.println("Account with ID : " + removeID + " has removed successfully.");
                        }
                    }
                    if (!Searchid) {
                        System.out.println("Wrong ID, You can input your id again.");
                    }
                    break;
                case 4:
                    int showOption;
                    System.out.println("Show account information");
                    System.out.println("1. Ascending order (by ID)");
                    System.out.println("2. Descending order (by ID)");
                    System.out.println("3. Descending order (by Balance)");

                    System.out.print("Choose option to show  : ");
                    showOption = input.nextInt();
                    switch (showOption) {
                        case 1:
                            Collections.sort(accountList, Comparator.comparingInt(a -> a.id));
                            for (Account account : accountList) {
                                System.out.println(account);
                            }
                            break;
                        case 2:
                            Collections.sort(accountList, Comparator.comparingInt(Account::getId).reversed());
                            for (Account account : accountList) {
                                System.out.println(account);
                            }
                            break;
                        case 3:
                            Collections.sort(accountList, Comparator.comparingDouble(Account::getBalance).reversed());
                            for (Account account : accountList) {
                                System.out.println(account);
                            }
                            break;
                    }
                    break;

            }
        } while (option != 5);

    }
}
