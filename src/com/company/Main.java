package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n sum: " + sum(300));

    }
    public static int sum(int a){
        int counter = 0;

        for (int i = 1; i < a; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                counter += i;
                System.out.print( i + " ");

            }
        }
        return  counter;
    }
}
