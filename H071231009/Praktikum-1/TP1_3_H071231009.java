import java.util.Scanner;
public class TP1_3_H071231009{
    public static String konversiTanggal( String tanggal) {
        String[] ubahTanggal = tanggal.split("-");
        String[] bulanArray = {
            "januari", "februari", "maret", "april", "mei", "juni", "juli", "agustus", "september", "oktober", "november", "desember"
        };

        int tanggal1 = Integer.parseInt(ubahTanggal[0]);
        int indeksBulan = Integer.parseInt(ubahTanggal[1]) - 1;
        String bulan = bulanArray[indeksBulan];
        int tahun = Integer.parseInt(ubahTanggal[2]);

        if(tahun >= 0 && tahun <=30){
            return tanggal1 + " " + bulan + " " + "20" + ubahTanggal[2];
        } else {
            return tanggal1 + " " + bulan + " " + "19" + ubahTanggal[2];
        }
    } 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input: ");
        String input = scan.nextLine();
        String output = konversiTanggal(input);
        System.out.println("output: " + output);
        scan.close();
    }
}