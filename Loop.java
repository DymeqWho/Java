public class Loop {
    public static void main(String[] args) {

        int x = 8;

        if (x == 7) {
            System.out.println("x = 7");
            System.out.println("x na prawdę równa się 7");
        }

        if (x == 7) // if bez klamry wyświetli tylko to, co jest tuż pod nim. Druga linijka nie należy do tego ifa i wyświetli się niezależnie! ZAWSZE DODAWAJ KLAMRY!
            System.out.println("x = 7");
        // to już nie jest część ifa
        System.out.println("x na prawdę równa się 7");

        if (x == 7) {
            System.out.println("x = 7");
        } else {
            System.out.println("x != 7");
        }

        // w if ma znaczenie kolejność pisanego kodu! bo wykonuje tylko to, co pierwsze pasuje! reszta moze być martwa
        if (x > 5) {
            System.out.println("x > 5");
        } else if (x == 8) { // dead code
            System.out.println("x = 8");
        } else if (x > 5) { // dead code
            System.out.println("x = 7");
        } else {
            System.out.println("x < 5");

        }
    }

}
