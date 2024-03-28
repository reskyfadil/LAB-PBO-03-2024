import java.util.Scanner;

public class LiveCoding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Person1 p=new Person1();

        System.out.print("Nama: ");
        String nama=sc.nextLine();
        p.setName(nama);
        System.out.print("Umur: ");
        int umur=sc.nextInt();
        p.setAge(umur);
        System.out.print("Male?: ");
        boolean gender=sc.nextBoolean();
        p.setGender(gender);


        System.out.println("\nNama: "+p.getName());
        System.out.println("Umur: "+p.getAge());
        System.out.println("Male?: "+p.getGender());
        sc.close();
    }
}