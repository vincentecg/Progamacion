import java.util.Scanner;

// Ejercicio 7: calcula la potencia de un número dado su exponente.
// - Exponente positivo: se calcula normalmente.
// - Exponente 0: el resultado es 1.
// - Exponente negativo: el resultado es 1 / potencia con el exponente positivo.
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        double base = sc.nextDouble();
        System.out.print("Introduce el exponente (entero): ");
        int exponente = sc.nextInt();

        double resultado;
        if (exponente > 0) {
            resultado = potencia(base, exponente);
        } else if (exponente == 0) {
            resultado = 1;
        } else {
            resultado = 1 / potencia(base, -exponente);
        }
        System.out.println(base + " ^ " + exponente + " = " + resultado);
        sc.close();
    }

    // Multiplica la base por sí misma 'exp' veces (exp > 0).
    private static double potencia(double base, int exp) {
        double r = 1;
        for (int i = 0; i < exp; i++) {
            r *= base;
        }
        return r;
    }
}
