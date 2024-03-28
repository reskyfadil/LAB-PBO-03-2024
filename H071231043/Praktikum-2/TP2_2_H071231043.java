import java.util.Scanner;

class Produk {
    String id;
    String nama;
    boolean stok;
    int harga;

    public void cekProduk() {
        System.out.println("ID produk    : " + this.id);
        System.out.println("Nama produk  : " + this.nama);
        System.out.println("Stok         : " + (this.stok ? "Ada" : "Tidak ada"));
        System.out.println("Harga produk : Rp. " + this.harga);
    }

    public String cekStok() {
        return (this.stok ? "Produk " + this.nama + " tersedia" : "Produk " + this.nama + " tidak tersedia");
    }
}

public class TP2_2_H071231043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produk baju = new Produk();

        System.out.println("Masukkan ID produk:");
        baju.id = scanner.nextLine();

        System.out.println("Masukkan Nama produk:");
        baju.nama = scanner.nextLine();

        System.out.println("Apakah stok tersedia? (true/false):");
        baju.stok = scanner.nextBoolean();

        System.out.println("Masukkan Harga produk:");
        baju.harga = scanner.nextInt();

        baju.cekProduk();
        System.out.println(baju.cekStok());

        scanner.close(); 
    }
}
