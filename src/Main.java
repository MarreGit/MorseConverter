import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter between A - Z or a number from 0-9 and hit Enter");
        String text = scan.nextLine();
        String code = converter.getMorse(text.toUpperCase());

        System.out.println("You have entered the letter or number " + text + " " +
                "and the morse code will appear as " + code);
    }
}
