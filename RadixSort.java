import java.io.*;
import java.util.*;

public class RadixSort {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("radix.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lista.add(Integer.parseInt(linea.trim()));
            }
        } catch (Exception e) {
            System.out.println("Error al leer entrada.txt: " + e.getMessage());
            return;
        }
        int[] arr = lista.stream().mapToInt(i -> i).toArray();
        radixSort(arr);
        try (PrintWriter pw = new PrintWriter(new FileWriter("salida.txt"))) {
            for (int n : arr) {
                pw.println(n);
            }
        } catch (Exception e) {
            System.out.println("Error al escribir salida.txt: " + e.getMessage());
        }
        System.out.println("Radix Sort terminado. Revisa salida.txt");
    }

    public static void radixSort(int[] arr) {
        int max = obtenerMax(arr);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortPorDigito(arr, exp);
        }
    }

    public static int obtenerMax(int[] arr) {
        int max = arr[0];
        for (int n : arr)
            if (n > max)
                max = n;
        return max;
    }

    public static void countingSortPorDigito(int[] arr, int exp) {
        int n = arr.length;
        int[] salida = new int[n];
        int[] conteo = new int[10];
        for (int i = 0; i < n; i++) {
            int digito = (arr[i] / exp) % 10;
            conteo[digito]++;
        }
        for (int i = 1; i < 10; i++)
            conteo[i] += conteo[i - 1];
        for (int i = n - 1; i >= 0; i--) {
            int digito = (arr[i] / exp) % 10;
            salida[conteo[digito] - 1] = arr[i];
            conteo[digito]--;
        }
        for (int i = 0; i < n; i++)
            arr[i] = salida[i];
    }
}