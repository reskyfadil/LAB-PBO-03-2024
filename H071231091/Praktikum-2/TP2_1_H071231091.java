import java.util.Scanner;
class person{

    String name;
    int age;
    boolean gender;
    Scanner data = new Scanner(System.in);
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(String gender){
        while(true){
            if (gender.equalsIgnoreCase("M")){
                System.out.println("MALE");
                break;
            }else if (gender.equalsIgnoreCase("F")){             
                System.out.println("FEMALE");
                break;
            }else {
                System.out.println("input tidak valid, masukkan inputan yg valid");
                break;
            }
        }
    }
     public boolean getGender(){
        return gender;
    }

public class TP2_1_H071231091 {

    
}
    public static void main(String[] args) {
        person x = new person();
        Scanner data = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        x.setName(x.data.nextLine());
        System.out.println("masukkan umur: ");
        x.setAge(x.data.nextInt());
        x.data.nextLine();
        System.out.print("Gender? 'M' or 'F' ");
        x.setGender(x.data.nextLine());

        

    }
}