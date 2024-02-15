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

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("Enter a Morse code character. Either a letter or number.");
        String text3 = scan.nextLine();
        String text4 = converter.getEng(text3);

        System.out.println("You have entered the morse code " + text3 + " and the english " +
                "character will appear as " + text4);

    }
}
