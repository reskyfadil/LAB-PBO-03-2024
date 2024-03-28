import java.util.Scanner;

class TP2{
    
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        String userinput = new String();

        try {
            System.out.println("Masukan kata: ");
            userinput = inp.nextLine();
        } catch (Exception e) {
            System.out.println("Text Tidak Valid!");
        }

        System.out.println(ubah(userinput));

    }

    public static String ubah(String userinput) {
        userinput = userinput.toLowerCase();
        char[] inputArray = userinput.toCharArray();

        for (int i = 0; i < inputArray.length ; i++) {

            if(i == 0 || inputArray[i-1] == ' '){

                inputArray[i] = Character.toUpperCase(inputArray[i]);
            }
        }
        String result = new String(inputArray);
        return result;
    }





}