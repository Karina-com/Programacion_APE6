import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] gastos = new double[7];
        double suma = 0;
        double promedio;
        int diasIncrementados = 0;

        // Registrar los gastos de los 7 dias
        for (int i = 0; i < gastos.length; i++) {
            System.out.print("Ingrese el gasto del día " + (i + 1) + ": ");
            gastos[i] = entrada.nextDouble();
            suma += gastos[i];
        }

        // Calcular el promedio diario
        promedio = suma / gastos.length;
        System.out.println("\nGasto total: " + suma);
        System.out.println("Promedio diario: " + promedio);

        // Aplicar incremento del 10%
        for (int i = 0; i < gastos.length; i++) {
            if (gastos[i] > promedio) {
                gastos[i] = gastos[i] * 1.10;
                diasIncrementados++;
            }
        }

        // Mostrar el arreglo en orden inverso
        System.out.println("\nGastos actualizados en orden inverso:");
        for (int i = gastos.length - 1; i >= 0; i--) {
            System.out.println("Día " + (i + 1) + ": " + gastos[i]);
        }

        // Mostrar cantidad de dias incrementados
        System.out.println("\nDías con incremento: " + diasIncrementados);
        entrada.close();
    }
}
