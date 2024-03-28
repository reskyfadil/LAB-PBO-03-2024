import java.util.Scanner;

public class TP1_3_H071231043 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String Date = input.nextLine();

        String hasil = KonverseDate(Date);
        System.out.println(hasil);

        input.close();
    }

    public static String KonverseDate(String Date) {
        String[] parts = Date.split("-");

        int tanggal = Integer.parseInt(parts[0]);
        String bulan = new String(parts[1]);
        int tahun = Integer.parseInt(parts[2]);

        switch (bulan) {
            case "01":
                bulan = "Januari";
                break;
            case "02":
                bulan = "Febuari";
                break;
            case "03":
                bulan = "Maret";
                break;
            case "04":
                bulan = "April";
                break;
            case "05":
                bulan = "May";
                break;
            case "06":
                bulan = "Juni";
                break;
            case "07":
                bulan = "Juli";
                break;
            case "08":
                bulan = "Agustus";
                break;
            case "09":
                bulan = "September";
                break;
            case "10":
                bulan = "Oktober";
                break;
            case "11":
                bulan = "November";
                break;
            case "12":
                bulan = "Desember";
                break;
            default:
                break;
        }

        if (tahun >= 00 && tahun <= 30) {
            tahun += 2000;
        }
        else {
            tahun += 1900;
        }

        return tanggal + " " + bulan + " " + tahun;

        
    }

    
}
