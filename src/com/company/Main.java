package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Main objektas = new Main();

        objektas.ivedimas();

    }


    public void ivedimas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite kiek norit skaiciu");
        int a = sc.nextInt();
        int[] masyvas = new int[a];
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Iveskite dar 1 skaiciu");
            masyvas[i] = sc.nextInt();


        }
        isvedimas(masyvas);
    }

    public void isvedimas(int[] masyvas) {
        System.out.println("=================");
        for (int i = 0; i < masyvas.length; i++) {
            if(masyvas[i] > 100){
                System.out.println(masyvas[i]);
            }

        }
    }
}