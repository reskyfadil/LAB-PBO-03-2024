class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length; // rumus volume
    }
}

public class TP2_3_H071231057 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 50;
        cuboid.width = 30; // set
        cuboid.length = 3; 
        System.out.printf("Volume = %.2f\n", cuboid.getVolume()); // Print the volume
    }
}