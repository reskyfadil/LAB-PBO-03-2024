import java.util.Scanner;

public class TP1_4_H071231009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan jari-jari Lingkaran: ");
            double jarijari = scanner.nextDouble();
            double luas = 3.14159 * jarijari * jarijari;
            
            System.out.printf("Luas lingkaran tersebut adalah: %.2f\n", luas);

        } catch (Exception e) {
            System.out.println("Inputan harus berupa angka.");
        } finally {
            scanner.close();
        }
    }
}
