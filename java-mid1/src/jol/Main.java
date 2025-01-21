package jol;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] b = new char[3][5];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                char a = scan.next().charAt(0);
                b[i][j] = a;
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print((char)(b[i][j] + 32) + " ");
            }
            System.out.println();
        }


    }
}
