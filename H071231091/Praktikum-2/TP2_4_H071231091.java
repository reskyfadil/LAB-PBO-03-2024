class Alamat{
    String jalan;
    String kota;

    public String getLokasi(){
        return jalan +", " + kota;
    }
    public void setJalan(String jalan){
        this.jalan = jalan;
    }
    public void setKota(String kota){
        this.kota = kota;
    }
    
}
class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat;

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getAlamat(){
        return alamat.getLokasi();
    }
    public void setAlamat(Alamat alamat){
        this.alamat = alamat;
    }
}

public class TP2_4_H071231091 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tello Baru";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Andi Fauzan Alwan";
        mahasiswa.nim = "H071231091";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}
