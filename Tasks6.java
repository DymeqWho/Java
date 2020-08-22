import java.util.Scanner;

public class Tasks6 {
    public static void main(String[] args) {

        //wstęp
        System.out.println("*** Program do sprawdzania czy zadana liczba całkowita jest podzielna przez 3 lub 7 ***");
        System.out.println();

        //zmienna int podana przez usera
        int number;

        //inicjacja Scannera
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj proszę, jaka liczba Ciebie interesuje: ");
        number = sc.nextInt();

        if (number % 3 == 0 && number % 7 == 0) {
            System.out.println(number + " jest podzielna przez 3 i 7");
        } else if (number % 3 == 0) {
            System.out.println(number + " jest podzielne przez 3");
        } else if (number % 7 == 0) {
            System.out.println(number + " jest podzielne przez 7");
        } else {
            System.out.println(number + " nie dzieli się ani przez 3 ani przez 7");
        }


    }
}
