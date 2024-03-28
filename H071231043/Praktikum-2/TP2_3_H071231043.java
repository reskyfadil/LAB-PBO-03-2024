import java.util.Scanner;

class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length;
    }
}
public class TP2_3_H071231043 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
         Cuboid cuboid = new Cuboid();

        System.out.println("height :");
        cuboid.height = scanner.nextDouble();

        System.out.println("Width :");
        cuboid.width = scanner.nextDouble();

        System.out.println("Length :");
        cuboid.length = scanner.nextDouble();


        System.out.printf("Volume = %.2f", cuboid.getVolume());

        scanner.close();
    }
}