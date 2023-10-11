public class Ejercicio4Tema2 {
    public static void main(String[] args) {
        float conversion = 0.006f;
        double pesetas = 166;
        System.out.println(pesetas+" pesetas son "+pesetas*conversion+" euros");
        System.out.printf("%.0f pesetas son %.3f\n", pesetas, pesetas*conversion+" euros");
 }
}