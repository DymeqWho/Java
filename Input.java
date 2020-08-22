import java.util.Locale;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        System.out.print("podaj liczbę: ");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int readValue = sc.nextInt();
        System.out.print("readValue = " + readValue);
        System.out.println();
        System.out.println("Podaj liczbę zmiennoprzecinkową: ");
        double readValue2 = sc.nextDouble();
        System.out.println("readValue2 = " + readValue2);
    }
}

