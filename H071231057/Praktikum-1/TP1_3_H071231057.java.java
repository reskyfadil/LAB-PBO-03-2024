import java.util.Scanner;

public class bulan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan tanggal (format DD-MM-YY):");
        String input = scanner.nextLine();
        System.out.println(convertDate(input));
    }

    public static String convertDate(String input) {
        String[] dateParts = input.split("-");
        int day = Integer.parseInt(dateParts[0]);
        int year = Integer.parseInt(dateParts[2]);

        String[] months = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        String month = months[Integer.parseInt(dateParts[1]) - 1];

        return day + " " + month + " " + (year < 100 ? 2000 + year : year);
    }
}