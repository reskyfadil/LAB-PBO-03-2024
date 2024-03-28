import java.util.Scanner;
class Cuboid{
    double panjang;
    double tinggi;
    double lebar;

    double getVolume(){
        return panjang * tinggi * lebar;
    }
}
public class livecoding {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        Scanner input = new Scanner(System.in);
        cuboid.panjang=(input.nextDouble());
        cuboid.tinggi=(input.nextDouble());
        cuboid.lebar=(input.nextDouble());
        
        System.out.printf("hasil:%.2f",cuboid.getVolume());
    }

    
}