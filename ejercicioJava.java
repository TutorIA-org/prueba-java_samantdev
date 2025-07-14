import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Suma
        int suma = num1 + num2;
        System.out.println("Suma: " + suma);

        // Resta
        int resta = num1 - num2;
        System.out.println("Resta: " + resta);

        // Multiplicación
        int multiplicacion = num1 * num2;
        System.out.println("Multiplicación: " + multiplicacion);

        // División (controlando la división por cero)
        if (num2 != 0) {
            double division = (double) num1 / num2;
            System.out.println("División: " + division);
        } else {
            System.out.println("No es posible dividir entre cero.");
        }

        scanner.close();
    }
}