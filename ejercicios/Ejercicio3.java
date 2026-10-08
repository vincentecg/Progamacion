import java.util.Scanner;

// Ejercicio 3: pide un número e indica si es par o impar.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " es par");
        } else {
            System.out.println(n + " es impar");
        }
        sc.close();
    }
}
