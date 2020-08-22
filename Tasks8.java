import java.util.Scanner;

public class Tasks8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Test metody if. ");
        System.out.print("Wpisz cyfrę: ");
        int choice = sc.nextInt();
        System.out.println("Twoja cyfra to: " + choice);
        System.out.print("Odpowiada jej znak: ");
        if (choice == 0) {
            System.out.println(")");
        }
        if (choice == 1) {
            System.out.println("!");
        }
        if (choice == 2) {
            System.out.println("@");
        }
        if (choice == 3) {
            System.out.println("#");
        }
        if (choice == 4) {
            System.out.println("$");
        }
        if (choice == 5) {
            System.out.println("%");
        }
        if (choice == 6) {
            System.out.println("^");
        }
        if (choice == 7) {
            System.out.println("&");
        }
        if (choice == 8) {
            System.out.println("*");
        }
        if (choice == 9) {
            System.out.println("(");
        }

        System.out.println();
        System.out.println("Test metody switch.");
        System.out.print("Wpisz cyfrę: ");
        int choice2 = sc.nextInt();

        System.out.println("Twoja cyfra to: " + choice2);
        System.out.print("Odpowiada jej znak: ");

        switch (choice2) {
            case 0: {
                System.out.println(")");
            }
            break;
            case 1: {
                System.out.println("!");
            }
            break;
            case 2: {
                System.out.println("@");
            }
            break;
            case 3: {
                System.out.println("#");
            }
            break;
            case 4: {
                System.out.println("$");
            }
            break;
            case 5: {
                System.out.println("%");
            }
            break;
            case 6: {
                System.out.println("^");
            }
            break;
            case 7: {
                System.out.println("&");
            }
            break;
            case 8: {
                System.out.println("*");
            }
            break;
            case 9: {
                System.out.println("(");
            }
            break;

        }

    }
}
