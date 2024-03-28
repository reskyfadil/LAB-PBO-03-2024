class Cuboid{
    double tinggi;
    double panjang;
    double lebar;

    double getVolume(){
        return tinggi* panjang * lebar;
    }
}
public class TP2_3_H071231091 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.tinggi = 25;
        cuboid.panjang = 15;
        cuboid.lebar = 20;
        System.out.printf("hasil:%.2f", cuboid.getVolume());
    }

    
}