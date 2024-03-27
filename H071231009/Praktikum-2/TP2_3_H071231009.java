class Cuboid{
    double height;
    double width;
    double length;

    double getVolume(){
        return height * width * length;
    }
}

public class TP2_3_H071231009 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 5.0;
        cuboid.width = 6.0;
        cuboid.length = 7.0;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
