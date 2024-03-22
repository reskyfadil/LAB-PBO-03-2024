package Pertemuan1;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String input = scanner.nextLine();

        String result = capitalizeFirstLetterAlternative(input);
        System.out.println("Hasil: " + result);

        scanner.close();
    }

    public static String capitalizeFirstLetterAlternative(String input) {
        StringBuilder result = new StringBuilder();

        boolean capitalizeNext = true;

        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
                result.append(c); // Menambahkan spasi setelah setiap kata
            } else if (capitalizeNext) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
