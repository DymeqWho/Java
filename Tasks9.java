import java.util.Scanner;

public class Tasks9 {
    public static void main(String[] args) {
        System.out.println("Podaj dwie liczby, a program zamieni je kolejnością");
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int zmienna1 = sc.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int zmienna2 = sc.nextInt();
        System.out.println();
        System.out.println("Podałeś dwie zmienne. Pierwsza to: " + zmienna1 + ". Drugą zmienną jest: " + zmienna2);

        int savezmienna1 = zmienna1;
        zmienna1 = zmienna2;
        zmienna2 = savezmienna1;
        System.out.println();

        System.out.println("Po zamianie kolejności, pierwsza zmienna to: " + zmienna1 + ". Drugą zmienną jest: " + zmienna2);

    }
}

