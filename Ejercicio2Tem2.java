import java.util.Scanner;

public class Ejercicio2Tem2 {
    public static void main(String[] args) {
       String nombre;
       Scanner teclado=new Scanner(System.in);
       System.out.print("Por favor introduzca su nombre: ");
       nombre = teclado.nextLine();
       System.out.println(nombre);
       teclado.close();
    }
}
