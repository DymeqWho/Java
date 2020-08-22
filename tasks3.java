import java.util.Scanner;

public class tasks3 {
    public static void main(String[] args) {

        System.out.println("program zsumuje dwie liczby całkowite. Podaj pierwszą liczbę całkowitą: ");
        Scanner sc = new Scanner(System.in);
        int readValue = sc.nextInt();
        System.out.print("pierwsza liczba: " + readValue);
        System.out.println();
        int readValue2 = sc.nextInt();
        System.out.println("podaj drugą liczbę całkowitą: ");
        System.out.println("kolejna liczba: " + readValue2);
        int suma = readValue + readValue2;
        System.out.println("suma wynosi: " + suma);


    }
}
