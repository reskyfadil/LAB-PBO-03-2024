package Pertemuan1;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3}, {4,5,6}, {7,8,9}};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka yang ingin dicari: ");
            int target = scanner.nextInt();
            
            boolean Found = false;

            for (int i = 0; 1 < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == target) {
                        System.out.printf("Found %d at [%d][%d]\n", target, i, j);
                        Found = true;
                        break;
                    }
                }
                if (Found)
                    break;
            }

            if (!Found)
                System.out.printf("%d tidak ditemukan dalam array. \n", target);
                
        } catch (Exception e) {
            System.out.println("Input harus berupa angka.");
        } finally {
            scanner.close();
        }
    }
}
