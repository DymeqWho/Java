import java.util.Scanner;

public class Tasks4 {
    public static void main(String[] args) {

        //wstęp
        System.out.println();
        System.out.println("    *** Program do obliczania czy jakiś rok jest rokiem przestępnym ***");
        System.out.println();
        System.out.print("Podaj rok, którego przestępnośc Ciebie interesuje: ");

        //inicjacja biblioteki do zbierania wpisów
        Scanner sc = new Scanner(System.in);

        //zmienna od usera
        int year;
        year = sc.nextInt();

        //ozdobniki
        System.out.println("Czy rok " + year + " jest przestępny?");
        System.out.println();

        //warunki i równania sprawdzające czy rok jest przestepny
        if (year % 4 == 0 && year % 100 != 00 || year % 400 == 0) {
            System.out.println("Rok " + year + " jest przestępny.");
        } else {
            System.out.println("Rok " + year + "r jest nieprzestępny.");
        }

    }
}
