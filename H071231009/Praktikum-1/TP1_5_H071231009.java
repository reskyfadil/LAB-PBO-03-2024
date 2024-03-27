import java.util.Scanner;

public class TP1_5_H071231009 {
    public static void main(String[] args) {
        int[][] nomor = {{1,2,3}, {4,5,6}, {7,8,9}};
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Input Angka yang mau dicari : ");
            int cariAngka = input.nextInt();

            boolean ditemukan = false;

            for (int i = 0; i < nomor.length; i++) {
                for (int j = 0; j < nomor[i].length; j++) {
                    int angka = nomor[i][j];

                    if (angka == cariAngka) {
                        System.out.println("Found " + cariAngka + " at [" + i + "][" + j + "]");
                        ditemukan = true;
                    }
                }
            }

            if (!ditemukan) {
                System.out.println("Tidak ditemukan");
            }

        } catch (Exception e) {
            System.out.println("Inputan Harus Angka");
        } finally {
            input.close();
        }
    }
}
