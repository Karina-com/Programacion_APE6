public class Ejercicio5 {
    public static void main(String[] args) {

        // Arreglo
        String[] nombres = {"Ana", "Luis", "Marta", "Pedro"};
        int[] notas = {15, 8, 18, 11};

        // Variables
        int posMax = 0;
        int posMin = 0;
        int suma = 0;

        // Uso de for
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notas[posMax]) {
                posMax = i;
            }

            if (notas[i] < notas[posMin]) {
                posMin = i;
            }
            suma += notas[i];
        }

        double promedio = (double) suma / notas.length;

        System.out.println("Nota mas alta: " + nombres[posMax] + " con " + notas[posMax]);
        System.out.println("Nota mas baja: " + nombres[posMin] + " con " + notas[posMin]);
        System.out.printf("Promedio: %.2f%n", promedio);

    }
}
