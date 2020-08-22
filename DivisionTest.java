public class DivisionTest {
    public static void main(String[] args) {
        int dzielna = 1;
        int dzielnik = 3;

        double wynikCalkowity = (double) dzielna / dzielnik; //by wykonać dzielenie, trzeba castować jedną zmienną (bez różnicy która) na double i wynik też podać jako double
        System.out.println("wynikCalkowity: " + wynikCalkowity);
    }
}
