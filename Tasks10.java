import java.util.Scanner;

public class Tasks10 {
    public static void main(String[] args) {
        System.out.println("*** Program do sprawdzania czy przejedziesz się kolejką górską! ***");
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Podaj swój wzrost w cm: ");
        int height = sc.nextInt();
        System.out.print("Podaj swoją masę w kg: ");
        float weight = sc.nextFloat();
        System.out.println();
        System.out.println("Twój wzrost to: " + height + ", Twoja masa to: " + weight + "kg.");

        if (height > 150 && weight <= 180) {
            System.out.println("Zapnij pasy!");
        } else {
            System.out.println("Przykro mi, nie możesz jechać!");
        }
    }
}
