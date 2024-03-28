import java.util.Scanner;

class Produk {
    String nama;
    int ID;
    int harga;
    int stok;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }
    public int getID() {
        return ID;
    }
    public int getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }

    public void infoProduk() {
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + ID);
        System.out.println("Harga: " + formatHarga());
        System.out.println("Stok: " + stok);
    }

    public String formatHarga() {
        return String.format("%.d", harga).replace(',', '.');
    }
    public void cekStok() {
        if (stok > 0) {
            System.out.println("Masih ada ji, pesan maki.");
        } else {
            System.out.println("Maaf, habis mi barangnya.");
        }
    }

public class TP2_2_H071231091 {    
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produk produk = new Produk();

        System.out.println("Masukkan nama produk:");
        produk.setNama(scanner.nextLine());

        System.out.println("Masukkan ID produk:");
        produk.setID(scanner.nextInt());

        System.out.println("Masukkan harga produk:");
        produk.setHarga(scanner.nextInt());

        System.out.println("Masukkan stok produk:");
        produk.setStok(scanner.nextInt());

        produk.infoProduk();
        produk.cekStok();
        

    }
}
