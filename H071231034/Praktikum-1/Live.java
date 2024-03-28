import java.util.Scanner;

public class Live {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); //ini alatnya, kita buat alatx dluwz

        double barisKedua;
        int barisPertama;
        int bulat=0;
        int desimal=0;

        while(true){
            if(scanner.hasNextInt()){
                barisPertama=scanner.nextInt();
                if(barisPertama>0){
                    break;
                }else{
                    System.out.println("Masukkan bilangan bulat positif!");
                    scanner.next();
                }
            }else{
                System.out.println("Masukkan bilangan bulat positif!");
                scanner.next();
            }
        }

        for(int i=0;i<barisPertama;i++){
            try{
                barisKedua=scanner.nextDouble();
                if(barisKedua%1==0){ //jika bulat
                    bulat++;
                }else{
                    desimal++;
                }
            }catch(Exception e){ //jika yang dimasukkan bukan angka
                System.out.println("Masukkan angka valid!");
                scanner.next();
                i--;
            }
        }
        
        System.out.println(bulat+" Bilangan Bulat");
        System.out.println(desimal+" Bilangan Desimal");
        scanner.close();
        }
}