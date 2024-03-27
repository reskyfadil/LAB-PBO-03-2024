import java.util.Scanner;
class Toko {
    String id;
    String nama;
    int stock;
    double harga;

    public boolean cekStock() {
        return stock > 0;
    }
    public String cekProduk() {
        if (cekStock()) {
            return "\n----" + nama + " tersedia di Toko----\n";
        }else {
            return "\n----" + nama + " tidak tersedia di Toko----\n";
        }
    }
    public String getInfo() {
        return "\nID Produk: " + id + "\nNama Produk: " + nama + "\nStock Produk: " + stock + "\nHarga Produk: " + harga + "\n" + cekProduk();
    }
}

public class TP2_2_H071231009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Toko[] daftarProduk = new Toko[10];
        int jumlahProduk = 0;

        while (true) {
            System.out.println("\nPilihan");
            System.out.println("1. Tambah Produk: ");
            System.out.println("2. Info Produk: ");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan: ");
            int pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n----Tambah Produk----");
                    System.out.print("Masukkan ID Produk: ");
                    String id = scan.nextLine();
                    System.out.print("Masukkan Nama Produk: ");
                    String nama = scan.nextLine();
                    System.out.print("Masukkan Stock Produk: ");
                    int stock = scan.nextInt(); 
                    System.out.print("Masukkan Harga Produk: ");
                    double harga = scan.nextDouble();

                    Toko produkBaru = new Toko();
                    produkBaru.id = id;
                    produkBaru.nama = nama;
                    produkBaru.stock = stock;
                    produkBaru.harga = harga;
                    
                    daftarProduk[jumlahProduk] = produkBaru;
                    jumlahProduk++;
                    System.out.println("\n----Produk behassil ditambahkan----");
                    break;
                case 2:
                    System.out.println("\n----Tampilkan Info Produk----");
                    for (int i = 0 ; i < jumlahProduk; i++) {
                        System.out.print("\nProduk ke-" + (i + 1) + " ");
                        System.out.print(daftarProduk[i].getInfo());
                    }
                    break;
                case 3:
                    System.out.println("\n----PROGRAM SELESAI----");
                    System.exit(0);
                    scan.close();
            
                default:
                    break;
            }

            
                
            
        }
    }
}