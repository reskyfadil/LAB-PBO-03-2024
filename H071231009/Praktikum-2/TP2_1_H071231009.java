import java.util.Scanner;

class Person {
    String name;
    int age;
    boolean isMale;
    public void setName (String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge (int age) {
        this.age = age ;
    }
    public int getAge() {
        return this.age;
    }
    public void setGender (boolean isMale) {
        this.isMale = isMale;
    }
    public String getGender () {
        if (isMale) {
            return "Male";
        } else {
            return "Female";
        }
    }

}

public class TP2_1_H071231009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person person1 = new Person();

        System.out.print("Masukkan nama: ");
        String name = scan.nextLine();
        person1.setName(name);

        System.out.print("Masukkan umur: ");
        int age = scan.nextInt();
        person1.setAge(age);

        System.out.print("Masukkan gender(True for male, False for famale): ");
        boolean isMale = scan.nextBoolean();
        person1.setGender(isMale);

        scan.close();

        System.out.println("\nOutput: ");
        System.out.println("Nama  : " + person1.getName());
        System.out.println("Umur  : " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());


    }
    
}
