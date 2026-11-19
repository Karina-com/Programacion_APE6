import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] produccion = new int[10];
        int sumaPares = 0;
        int contadorImpares = 0;
        int sumaTotal = 0;
        double promedio;

        // Ingresar los 10 valores
        for (int i = 0; i < produccion.length; i++) {
            System.out.print("Ingrese las piezas del turno " + (i + 1) + ": ");
            produccion[i] = entrada.nextInt();
            sumaTotal += produccion[i];

            // Sumar unicamente los indices pares
            if (i % 2 == 0) {
                sumaPares += produccion[i];
            }

            // Contar valores impares mayores a 15
            if (produccion[i] % 2 != 0 && produccion[i] > 15) {
                contadorImpares++;
            }
        }

        // Calcular el promedio general
        promedio = (double) sumaTotal / produccion.length;

        // Mostrar resultados
        System.out.println("\nSuma de indices pares: " + sumaPares);
        System.out.println("Turnos con produccion impar mayor a 15: "
                + contadorImpares);

        System.out.printf("Promedio general: %.2f%n", promedio);

        entrada.close();
    }
}
