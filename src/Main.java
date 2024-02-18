import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter between A - Z or a number from 0-9 and hit Enter");
        String text = scan.nextLine();
        String text2 = converter.getMorse(text.toUpperCase());
        System.out.println("You have entered the letter or number " + text + " " +
                "and the morse code will appear as " + text2);
        if (text2 == null){
            System.out.println("This sign is is not allowed. It cant be null. Please enter a letter or single number");
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println("Enter Morse code characters to form either a letter or a number and then press Enter " +
                "using * (for short) and - (for long)");
        String text3 = scan.nextLine();
        String text4 = converter.getEng(text3);
        System.out.println("You have entered the morse code " + text3 + " and the english " +
                "character will appear as " + text4);
        if (text4 == null){
            System.out.println("This sign is is not allowed. It cant be null. Please enter a correct morse code sign " +
                    " with * and/or -");
        }
        scan.close();

    }
}