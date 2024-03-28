import java.util.Scanner;

public class lingkaran3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.printf("MASUKKAN JARI-JARI LINGKARAN : ");
            double radius = scanner.nextDouble();
            double area   = Math.PI * radius * radius;
            System.out.printf("LUAS LINGKARAN ADALAH : %.2f\n" , area);

        } catch (Exception e) {
            System.out.println("MASUKKAN INPUTAN VALID, ANGKA!");
            
        }
    }
}




