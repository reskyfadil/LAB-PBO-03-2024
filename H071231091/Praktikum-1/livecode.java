import java.util.Scanner;

class livecode{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        try{
            System.out.println("masukkan jari jari: ");
            double jarijari = input.nextDouble();

            double luasLingkaran = Math.PI  * Math.pow(jarijari, 2);
            System.out.printf("hasil:%.2f", luasLingkaran);


        }catch(Exception e){
            System.out.println("salah input");
        }
    }
}