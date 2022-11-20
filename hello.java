import java.util.Scanner;

public class hello {
    public static void main(String[] args) {

        String cha;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        cha = sc.nextLine();
        int vowels = 0, consonants = 0, digits = 0, spaces = 0, symbols = 0;

        cha = cha.toLowerCase();
        for (int i = 0; i < cha.length(); ++i) {
            char ch = cha.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ++consonants;
            } else if (ch >= '0' && ch <= '9') {
                ++digits;
            } else if (ch == ' ') {
                ++spaces;
            } else
                ++symbols;
        }

        System.out.println("Vowels:" + vowels);
        System.out.println("Constants:" + consonants);
        System.out.println("Digits:" + digits);
        System.out.println("WhiteSpace:" + spaces);
        System.out.println("Symbols:" + symbols);
    }

}
