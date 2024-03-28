class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length;
    }
}

public class livecode {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 50;
        cuboid.width = 30;
        cuboid.length = 3;
        System.out.printf("Volume =  %.2f", cuboid.getVolume());
    }
}

// note : 50 * 30 * 3 for volume diks