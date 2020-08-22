import java.util.Scanner;

public class Tasks11 {
    public static void main(String[] args) {
        System.out.println("*** Program zamieniający stopnie Celsjusza na stopnie Farenheita ***");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Poraj jaka temperatura w stopniach Celsjusza Ciebie interesuje: ");
        double tempInCelsjus = sc.nextFloat();
        double tempInFarenheit = 1.8 * tempInCelsjus + 32;
        float tempInFarenheit1 = (float)tempInFarenheit;
        System.out.println("Temperatra równa " + tempInCelsjus + " stopni Celsjusza równa się " + tempInFarenheit1 + " stopni Farenheita."
        );

    }
}
