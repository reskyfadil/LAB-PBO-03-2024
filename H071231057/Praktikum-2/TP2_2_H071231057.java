import java.text.DecimalFormat;
import java.util.Scanner;

public class TP2_2_H071231057 {
    public static class Product {
        private String id;
        private String name;
        private int stock;
        private double price;

        public Product() {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Masukkan product ID : ");
            this.id = scanner.nextLine();

            System.out.printf("Masukkan product name : ");
            this.name = scanner.nextLine();

            System.out.printf("Masukkan product stock : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Bukan angka, pastikan hanya memasukkan angka! try again : ");
                scanner.next();
            }
            this.stock = scanner.nextInt();

            System.out.printf("Masukkan product price : ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Bukan angka, pastikan hanya memasukkan angka! try again : ");
                scanner.next();
            }
            this.price = scanner.nextDouble();
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getStock() {
            return stock;
        }

        public double getPrice() {
            return price;
        }

        public boolean isAvailable() {
            return stock > 0;
        }

        public void printProductDetails() {
            DecimalFormat formatter = new DecimalFormat("#,###");
            System.out.println("---------DETAIL PRODUK---------");
            System.out.println("ID        : " + getId());
            System.out.println("Name      : " + getName());
            System.out.println("Stock     : " + getStock());
            System.out.println("Price     : " + formatter.format(getPrice()));
            System.out.println("Available : " + (isAvailable() ? "Yes" : "No"));
        }
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.printProductDetails();
    }
}