import java.util.Scanner;

public class TP2_1_H071231057 {
    private String name;
    private int age;
    private boolean isMale;

    public void setName() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Masukkan Nama: ");
        this.name = scanner.nextLine();
    }

    public String getName() {
        return this.name;
    }

    public void setAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Masukkan umur : ");
        this.age = scanner.nextInt();
    }

    public int getAge() {
        return this.age;
    }

    public void setGender() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Masukkan Gender : (True/False) ");
        this.isMale = scanner.nextBoolean();
    }

    public String getGender() {
        return this.isMale ? "Male" : "Female";
    }
}