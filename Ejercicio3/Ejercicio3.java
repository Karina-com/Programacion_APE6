import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        int aprobados = 0;
        int reprobados = 0;
        int suma = 0;
        double promedio;

        do {
            System.out.print("Ingrese la cantidad de estudiantes: ");
            n = entrada.nextInt();
        } while (n <= 0);
        int[] notas = new int[n];

        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.print("Nota del estudiante " + (i + 1) + ": ");
                notas[i] = entrada.nextInt();
                if (notas[i] < 0 || notas[i] > 20) {
                    System.out.println("Error. Ingrese una nota entre 0 y 20.");
                }
            } while (notas[i] < 0 || notas[i] > 20);
            suma = suma + notas[i];
        }

        promedio = (double) suma / n;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 14) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        System.out.println("\nPromedio general: " + promedio);
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);

        System.out.println("\nEstudiantes con notas por debajo del promedio:");

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < promedio) {
                System.out.println("Estudiante " + (i + 1)
                        + " - Nota: " + notas[i]);
            }
        }
        entrada.close();
    }
}
