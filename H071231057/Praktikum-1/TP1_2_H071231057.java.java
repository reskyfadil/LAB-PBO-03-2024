import java.util.Scanner;

public class kecilkapital1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kalimat:");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        String result = String.join(" ", words);

        System.out.println(result);
    }
}