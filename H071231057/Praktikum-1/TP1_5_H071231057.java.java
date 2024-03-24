import java.util.Scanner;

public class numberfounding5 {
    public static void main(String[] args) {
        int[][] nums = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Masukkan bilangan yang dicari:");
            int target = scanner.nextInt();
            boolean found = false; // kalau boolean salah

            for (int i = 0; i < nums.length && !found; i++) { // looping 
                for (int j = 0; j < nums[i].length && !found; j++) { // Same here
                    if (nums[i][j] == target) {
                        System.out.println("Found " + target + " at [" + i + "][" + j + "]");
                        found = true; // kalau ditemukan jadi true
                    }
                }
            }

            if (!found) { // tidak found
                System.out.println("Number not found in the array.");
            }
        } catch (Exception e) {
            System.out.println("Input bukan angka!");
        }
    }
}