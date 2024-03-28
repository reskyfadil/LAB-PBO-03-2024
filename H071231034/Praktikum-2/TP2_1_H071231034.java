import java.util.Scanner;

public class TP2_1_H071231034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.print("Name: ");
        person.setName(sc.nextLine());
        System.out.print("Age: ");
        person.setAge(sc.nextInt());
        System.out.print("Male?: ");
        String gndr=sc.next();
        if ("male".equalsIgnoreCase(gndr) || "true".equalsIgnoreCase(gndr)||"yes".equalsIgnoreCase(gndr)) {
            person.setGender(true);
        } else if ("female".equalsIgnoreCase(gndr) || "false".equalsIgnoreCase(gndr)||"no".equalsIgnoreCase(gndr)) {
            person.setGender(false);
        }
        System.out.println("\nName: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Male?: " + person.getGender());
        sc.close();
    }
}