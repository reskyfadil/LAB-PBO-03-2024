package Pertemuan1;

import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jarijari = scanner.nextInt();
        double hasil = 3.14*jarijari*jarijari;
        System.out.printf("%.2f", hasil);
        scanner.close();

    }
}