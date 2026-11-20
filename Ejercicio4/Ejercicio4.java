import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        // Arreglo
        int[] numeros = {14, 7, 25, 3, 18, 7, 30};
        Scanner sc = new Scanner(System.in);

        // Pedir el numero
        System.out.print("Ingrese un numero: ");
        int buscado = sc.nextInt();

        int contador = 0;
        int posicion = -1;

        // Uso del for
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                contador++;

                if (posicion == -1) {
                    posicion = i;
                }
            }
        }

        if (posicion == -1) {
            System.out.println("No existe.");
        } else {
            System.out.println("Aparece " + contador + " veces");
            System.out.println("Primera posicion: " + posicion);
        }
    }
}
