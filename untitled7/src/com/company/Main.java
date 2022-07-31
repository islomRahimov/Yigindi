package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 7; i <50; i++) {
            if (i % 7 == 0){
                count += i;
            }
        }
        System.out.println("Jami:" + count);



    }
}
