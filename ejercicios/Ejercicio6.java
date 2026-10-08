import java.util.Scanner;

// Ejercicio 6: lee una cadena y comprueba si es una letra mayúscula.
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String s = sc.nextLine();

        if (s.length() == 1 && Character.isUpperCase(s.charAt(0))) {
            System.out.println("\"" + s + "\" es una letra mayúscula");
        } else {
            System.out.println("\"" + s + "\" no es una letra mayúscula");
        }
        sc.close();
    }
}
