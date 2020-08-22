import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Tasks5 {
    public static void main(String[] args) {


        // potrzebne zmienne od usera
        double a;
        double b;
        double c;

        //wyliczane miejsca zerowe
        double x0; // jedno miejsce zerowe
        double x1; // pierwsze miejsce zerowe
        double x2; // drugie miejsce zerowe

        //import biblioteki do scanowania wpisów
        Scanner sc = new Scanner(System.in);


        //powitanie
        System.out.println();
        System.out.println("Program do obliczania miejsc zerowych równań kwadratowych o wzorze ax^2 + bx + c = 0: ");
        System.out.println("(Stosuj proszę w liczbach zmiennoprzecinkowych przecinki a nie kropki przed miejscami dziesiętnymi)");
        System.out.println();

        //zbieranie danych
        System.out.print("Podaj wartość zmiennej a: ");
         a = sc.nextDouble();
        System.out.print("Podaj wartość zmiennej b: ");
         b = sc.nextDouble();
        System.out.print("Podaj wartość zmiennej c: ");
         c = sc.nextDouble();
        System.out.println();
        System.out.println("Podałeś a równe: " + a + ", podałeś b równe: " + b + ", podałeś c równe: " + c);

        //obliczanie delty

        double d = Math.pow(b, 2) - 4 * a * c;
        System.out.print("Delta wynosi: " + d);
        System.out.println();

        // obliczanie miejsc zerowych
        if (d == 0) {
            System.out.println("Jest jedno miejsce zerowe i ono wynosi: ");
            x0 = (-b) / 2 * a;
            System.out.println(x0);
        } else if (d > 0) {
            System.out.println("Są dwa miejsca zerowe i wynoszą one kolejno: ");
            x1 = ((-b) + Math.sqrt(d)) / 2 * a;
            x2 = ((-b) - Math.sqrt(d)) / 2 * a;
            System.out.print("x1 wynosi: " + x1 + "; x2 wynosi: " + x2);
            System.out.println();
        } else {
            System.out.println("To równanie nie posiada miejsc zerowych.");
        }





       /* System.out.println("Program do obliczania równań kwadratowych!");
        System.out.println();
        System.out.println("Podaj proszę po kolei wartości a, b i c.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj wartość a: ");
        double a = sc.nextInt();
        System.out.println();
        System.out.println("Podałeś wartość a równą: " + a);
        System.out.println("Czy chcesz zmienić zadeklarowaną wartość a równą " + a + "?");
        System.out.println("Wpisz 1 jeżeli tak, w przeciwnym razie wpisz 0");
        int yes1 = sc.nextInt();
       /* int i;

       if (yes1 != 1 && yes1 != 0) {
            for (i > 1; i <= yes1; i--) {
                System.out.println("Nie jestem pewien, czy chcesz mienić wartość a równą: " + a);
                System.out.println("Wpisz 1 jeżeli tak, w przeciwnym razie wpisz 0");
                yes1 = sc.nextInt();
            }
        } else if (yes1 == 1) {
            for (int j = 0; j >= 0; j++) {
                System.out.print("Podaj wartość a: ");
                a = sc.nextInt();
                System.out.println();
                System.out.println("Podałeś wartość a równą: " + a);
                System.out.println("Czy chcesz zmienić zadeklarowaną wartość a równą " + a + "?");
                System.out.println("Wpisz 1 jeżeli tak, w przeciwnym razie wpisz 0");
                yes1 = sc.nextInt();
            }
        } else {
            System.out.println("Twoja zmienna a wynosi ostatecznie: " + a);
            System.out.println("Następna zmienna");
        }





        /*if (yes1 == 1) {
            System.out.print("Podaj wartość a: ");
            a = sc.nextInt();
            System.out.println();
            System.out.println("Podałeś wartość a równą: " + a);
            System.out.println("Czy chcesz zmienić zadeklarowaną wartość a równą " + a + "?");
            System.out.println("Wpisz 1 jeżeli tak, w przeciwnym razie wpisz 0");
            yes1 = sc.nextInt();
        }
        if (yes1 != 0 && yes1 != 1); {
            System.out.println("Nie jestem pewien, czy chcesz mienić wartość a równą: " + a);
            System.out.println("Wpisz 1 jeżeli tak, w przeciwnym razie wpisz 0");
            yes1 = sc.nextInt();
        }
        System.out.println("Twoja zmienna a wynosi ostatecznie: " + a);
        System.out.println("Następna zmienna");
       /* System.out.print("Podaj wartość b: ");
        double b = sc.nextInt();
        System.out.println();
        System.out.println("Podałeś wartość b równą: " + b);
        System.out.println("Czy chcesz zmienić zadeklarowaną wartość b równą " + b + "?");
        System.out.println("Wpisz 1 jeżeli tak, w przeciwnym razie wpisz 0");
        int yes2 = sc.nextInt();

        while (yes2 == 1) {
            System.out.print( "Podaj wartość b: ");
            b = sc.nextInt();
            System.out.println();
            System.out.println("Podałeś wartość b równą: " + b);
            System.out.println("Czy chcesz ");
        }*/












       /* int x;
Math.pow(x) // podnosi do kwadratu (trzeba wcisnąć tab po Math)
        Math.sqrt(x) // robi pierwiastek kwadratowy (trzeba wcisnąć tab po Math) */
    }
}
