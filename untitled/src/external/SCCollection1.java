package external;

import entitiy.Account;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class SCCollection1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Account account = null;
        HashMap<String, Account> hashMap = new HashMap<>();

        try {
            FileInputStream fis = new FileInputStream("Account.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int count = ois.readInt();
            for (int i = 0; i < count; i++) {
                account = (Account) ois.readObject();

                System.out.println(account);
                hashMap.put(account.accNo, account);
            }

            fis.close();
            ois.close();

        } catch (Exception e) {

        }

        FileOutputStream fos = new FileOutputStream("Account.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        int choice;
        String accno, name;
        double balance;

        do {
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View All Accounts");
            System.out.println("5. Save Account");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            sc.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");

            switch (choice) {
                case 1:
                    System.out.println("Enter details, account, name, balance ");
                    accno = sc.nextLine();
                    name = sc.nextLine();
                    balance = sc.nextDouble();
                    account = new Account(accno, name, balance);
                    hashMap.put(accno, account);
                    System.out.println("Account created for " + name);
                    break;
                case 2:
                    System.out.println("Enter Account ");
                    accno = sc.nextLine();
                    hashMap.remove(accno);
                    break;
                case 3:
                    System.out.println("Enter Account ");
                    accno = sc.nextLine();
                    account = hashMap.get(accno);
                    System.out.println(account);
                    break;
                case 4:
                    for (Account a: hashMap.values())
                        System.out.println(a);
                    break;
                case 5:
                case 6:
                    oos.writeInt(hashMap.size());
                    for (Account a: hashMap.values())
                        oos.writeObject(a);
            }
        } while (choice != 6);
            oos.flush();
            oos.close();

            fos.close();

    }
}
