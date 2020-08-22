public class PreAndPostIncrementation {
    public static void main(String[] args) {

        int liczba = 5;
        int wartosc = liczba++; // wyswietl wartosc i w domysle dodaj jeden
        System.out.println("wartosc = " + wartosc);
        System.out.println("liczba = " + liczba);

        int wartosc2 = ++liczba; //dodaj jeden i wyświetl wartosc z tej sumy
        System.out.println("wartosc2 = " + wartosc2);
        System.out.println("liczba = " + liczba);


    }
}
