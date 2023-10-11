public class Ejercicio5Tema2 {
    public static void main(String[] args) {
        float conversion = 0.006f;
        double euros = 200;
        System.out.println(euros+" euros son "+euros*conversion+" pesetas");
        System.out.printf("%.2f euros son %.0f", euros, euros*conversion);
    }
}
