class Alamat { // not public karena class biasa aja
    public String jalan;
    public String kota;
}

class Mahasiswa { //same with this
    public String nama;
    public String nim;
    public Alamat alamat;

    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

    public String getAlamat() {
        return this.alamat.jalan + ", " + this.alamat.kota; //ini supaya gabung jalan dan kota
    }

    // ingat! this untuk panggil variabel nama
}

public class TP2_4_H071231057 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan  = "Rantepao";
        alamat.kota   = "Toraja Utara";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat    = alamat;
        mahasiswa.nama      = "Reynaldy Al";
        mahasiswa.nim       = "H071231057";

        System.out.println("Nama   : " + mahasiswa.getNama());
        System.out.println("Nim    : " + mahasiswa.getNim());
        System.out.println("Alamat : " + mahasiswa.getAlamat());
    }
}
