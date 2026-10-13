package com.ejercicios;

import java.util.Scanner;

// Ejercicio 4: divide dos números; si el divisor es 0 muestra un error.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el dividendo: ");
        double a = sc.nextDouble();
        System.out.print("Introduce el divisor: ");
        double b = sc.nextDouble();

        if (b == 0) {
            System.out.println("Error: no se puede dividir entre 0");
        } else {
            System.out.println(a + " / " + b + " = " + (a / b));
        }
        sc.close();
    }
}
