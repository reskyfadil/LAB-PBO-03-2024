package Pertemuan1;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Masukkan jumlah bilangan: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            int bilanganbulat = 0;
            int bilangandesimal = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                String input = scanner.nextLine();

                try{
                    double num = Double.parseDouble(input);
                    if (num == (int) num) {
                        bilanganbulat++;
                    } else{
                        bilangandesimal++;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input bukan angka.");
                    return;
                }
            }

        System.out.println(bilanganbulat + " Bilangan Bulat");
        System.out.println(bilangandesimal + " Bilangnan Desimal");

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan.");  
        } finally {
            scanner.close();
        }
    }
}
