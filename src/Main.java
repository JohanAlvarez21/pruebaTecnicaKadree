import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arregloNumeros = {1,2,3,4};

        System.out.print("Ingrese el número de vueltas: ");
        int vueltas = sc.nextInt();

        for (int i = 0; i < vueltas; i++) {
            int ultimoNumero = arregloNumeros[arregloNumeros.length - 1];
            for (int v = arregloNumeros.length -1; v > 0; v--) {
                arregloNumeros[v] = arregloNumeros[v - 1];
            }
            arregloNumeros[0] = ultimoNumero;
            System.out.println(Arrays.toString(arregloNumeros));
        }
    }
}
