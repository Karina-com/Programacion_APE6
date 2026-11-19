import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {

        // Arreglo
        int[] datos = {14, 7, 25, 3, 18};

        // Copia real (el original no se modifica)
        int[] copia = Arrays.copyOf(datos, datos.length);

        // Ordenar solo la copia
        Arrays.sort(copia);

        System.out.println("Original: " + Arrays.toString(datos));
        System.out.println("Copia ordenada: " + Arrays.toString(copia));

        // Segundo mayor: en la copia ordenada es el penultimo
        int segundoMayor = copia[copia.length - 2];
        System.out.println("Segundo numero mayor: " + segundoMayor);

        // Posicion del 14 en la copia (binarySearch exige arreglo ordenado)
        int pos14 = Arrays.binarySearch(copia, 14);
        System.out.println("Posicion del 14 en la copia: " + pos14);
    }
}
