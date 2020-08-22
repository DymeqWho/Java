import java.util.Scanner;

public class Tasks7 {
    public static void main(String[] args) {

        //wstęp
        System.out.println("*** Program, który sprawdza, jakie z trzech zmienny typu zmiennoprzecinkowego, zadeklarowanych przez urzytkownika, są większe od 0 ***");
        System.out.println();

        //opis zadania dla usera
        System.out.println("Zadeklaruj proszę kolejno trzy zmienne typu zmiennoprzecinkowego: ");
        System.out.println();

        //inicjacja scannera
        Scanner sc = new Scanner(System.in);

        //określenie zmiennych wprowadzonych przez usera
        double zmienna1;
        double zmienna2;
        double zmienna3;

        //wprowadzanie zmiennych przez usera

        System.out.print("Wprowadź pierwszą zmienną typu zmiennoprzecinkowego: ");
        zmienna1 = sc.nextDouble();
        System.out.println();
        System.out.print("Wprowadź drugą zmienną typu zmiennoprzecinkowego: ");
        zmienna2 = sc.nextDouble();
        System.out.println();
        System.out.print("Wprowadź trzecią zmienna typu zmiennoprzecinkowego: ");
        zmienna3 = sc.nextDouble();
        System.out.println();
        System.out.println("Zadeklarowane przez Ciebie zmienne to: ");
        System.out.println("Zmienna 1: " + zmienna1);
        System.out.println("Zmienna 2: " + zmienna2);
        System.out.println("Zmienna 3: " + zmienna3);

        //zamiana zmiennych na wartości logiczne
        boolean zmienna1Boo = zmienna1 > 0;
        boolean zmienna2Boo = zmienna2 > 0;
        boolean zmienna3Boo = zmienna3 > 0;

        //równania logiczne
        // p and q and r -> 1 and 1 and 1
        boolean all = zmienna1Boo && zmienna2Boo && zmienna3Boo;
        // (p xor q) or r -> 1 or 1
        boolean two1 = (zmienna1Boo ^ zmienna2Boo) || zmienna3Boo;
        // p or (q xor r) -> 1 or 1
        boolean two2 = zmienna1Boo || (zmienna2Boo ^ zmienna3Boo);
        // p xor q xor r -> 1
        boolean one = zmienna1Boo ^ zmienna2Boo ^ zmienna3Boo;

        //ile zmiennych większych od 0 zadeklarowano?
        //wszystkie
        if (all) {
            System.out.println("Trzy zmienne są większe od 0");
            System.out.println("Te zmienne to: " + zmienna1 + " i " + zmienna2 + " oraz " + zmienna3);
            //jedną
        } else if (one) {
            System.out.println("Jenda zmienna jest większa od 0");
            //którą jedną?
            System.out.print("Ta zmienna to: ");
            if (zmienna1Boo) {
                System.out.println(zmienna1);
            } else if (zmienna2Boo) {
                System.out.println(zmienna2);
            } else {
                System.out.println(zmienna3);
            }
            //dwie, przypadek 1:
        } else if (two1) {
            System.out.println("Dwie zmienne są większe od 0");
            //które dwie?
            System.out.print("Te zmienne to: ");
            if (zmienna1Boo) {
                System.out.print(zmienna1 + " i ");
            }
            if (zmienna2Boo) {
                System.out.print(zmienna2 + " i ");
            }
            if (zmienna3Boo) {
                System.out.println(zmienna3);
            }
            //diwe, przypadek 2:
        } else if (two2) {
            System.out.println("Dwie zmienne są większe od 0");
            //które 2?
            System.out.print("Te zmienne to: ");
            if (zmienna1Boo) {
                System.out.print(zmienna1 + " i ");
            }
            if (zmienna2Boo) {
                System.out.println(zmienna2);
            }
            if (zmienna3Boo) {
                System.out.println(zmienna3);
            }
        }   //żadnej
        else {
            System.out.println("Nie zadeklarowano zmiennej większej od 0");
        }
    }
}
