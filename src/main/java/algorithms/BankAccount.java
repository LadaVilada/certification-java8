package algorithms;

import java.io.IOException;

class PortConnector {
    public PortConnector(int port) throws Exception {
        if (Math.random() > 0.5) {
            throw new IOException();
        }
        throw new RuntimeException();
    }
}

public class BankAccount {

    private int myValue = 0;
    int[] a[] = new int[5][4];
    int b[][] = new int[5][4];

    public int luckyNumber(int seed) {
        if (seed > 10) return seed % 10;
        int x = 0;
        try {
            if (seed % 2 == 0) throw new Exception("No Even no.");
            else return x;
        } catch (Exception e) {
            return 3;
        } finally {
            return 7;
        }
    }


    public void showOne(int myValue) {
        myValue = myValue;
    }

    public void showTwo(int myValue) {
        this.myValue = myValue;
    }

    public static void main(String[] args) {
        do {
            System.out.println("1");
            break;
        } while (true);
        int res = 5%2;
        BankAccount ct = new BankAccount();
        ct.showOne(100);
        System.out.println(ct.myValue);
        ct.showTwo(200);
        System.out.println(ct.myValue);
    }
}