import java.util.Scanner;

public class Ejercicio3Tema2 {
    public static void main(String[] args) {
       String nombre,apellidos,numero;
       Scanner teclado=new Scanner(System.in);
       System.out.print("Por favor introduzca su nombre: ");
       nombre = teclado.nextLine();
       System.out.print("Por favor introduzca sus apellidos: ");
       apellidos = teclado.nextLine();
       System.out.print("Por favor introduzca su teléfono: ");
       numero = teclado.nextLine();
       System.out.println(nombre+" "+apellidos+" "+numero);    
       teclado.close();
    }
}
