import java.util.Scanner;

public class TP1_1_H071231034 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int barisSatu;
        double inputan;
        int bilBul=0;
        int bilDes=0;
        
        while (true){
            if(scanner.hasNextInt()){ //jika integer masuk
                barisSatu=scanner.nextInt();
                if (barisSatu>0){
                    break;
                }else{
                    System.out.println("Masukkan bilangan bulat positif!");
                }
            }else{  //jika bkn integer masuk
                scanner.next();
                System.out.println("Masukkan bilangan bulat positif!");
            }
        }

        for(int i=0;i<barisSatu;i++){
            try {
                inputan=scanner.nextDouble();
                if(inputan%1==0){
                    bilBul++;
                }else{
                    bilDes++;
                }
            } catch (Exception e) {
                System.out.println("Masukkan bilangan!");
                scanner.next(); //kalau nextLine terulang dari awal jika baris kedua ada angka dan bukan angka
                i--;
            }
        }

        System.out.println(bilBul+" Bilangan Bulat");
        System.out.println(bilDes+" Bilangan Desimal");
        scanner.close();
    }
}