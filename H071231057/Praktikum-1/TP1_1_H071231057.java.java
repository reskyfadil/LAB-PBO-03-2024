import java.util.Scanner;

public class oddeven0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan inputan diks : ");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");
        int bulat = 0;
        int desimal = 0;

        for (String numStr : numbers) {
            try {
                double num = Double.parseDouble(numStr);
                if (num == Math.floor(num)) 
                {
                    bulat++;
                } else   
                {
                    desimal++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input bukan angka!");
            }
        }

        System.out.println(bulat + " Bilangan Bulat");
        System.out.println(desimal + " Bilangan Desimal");
    }
} #HARUS DI UBAH