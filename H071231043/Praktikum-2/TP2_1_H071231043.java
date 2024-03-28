import java.util.Scanner;

class Person {
    String name;
    int age;
    boolean isMale;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }
    
    public String getGender() {
        return isMale ? "Male" : "Female";
    }
}

public class TP2_1_H071231043 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person person = new Person();

        System.out.print("Nama               : ");
        String name = scan.nextLine();
        person.setName(name);

        System.out.print("Umur               : ");
        int age = scan.nextInt();
        person.setAge(age);

        while (true) {
            System.out.print("Jenis Kelamin(L/P) : ");
            String genderInput = scan.next().trim().toUpperCase();
            
            if (genderInput.equals("L")) {
                person.setGender(true);
                break;
            } else if (genderInput.equals("P")) {
                person.setGender(false);
                break;
            } else {
                System.out.println("Inputan jenis kelamin tidak valid, silahkan masukkan L/P");
            }
        }
        
        System.out.println("\nName    : " + person.getName());
        System.out.println("Age     : " + person.getAge());
        System.out.println("Gender  : " + person.getGender());

        scan.close();
    }
}
