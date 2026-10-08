import java.util.Scanner;

// Ejercicio 1: recibe dos números e indica cuál es mayor o si son iguales.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double a = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double b = sc.nextDouble();

        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else if (b > a) {
            System.out.println(b + " es mayor que " + a);
        } else {
            System.out.println("Los dos números son iguales");
        }
        sc.close();
    }
}
