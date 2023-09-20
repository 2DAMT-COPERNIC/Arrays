package space.unai;

import javax.net.ssl.SSLEngineResult;
import java.util.Arrays;
import java.util.Scanner;

public class WarmupArrays {


    private Scanner sc;

    private WarmupArrays() throws InterruptedException {
        int[] numeros = new int[10];
        sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("[!] Introdueix el numero en posició #" + (i + 1) + ":");
            numeros[i] = sc.nextInt();
            if (numeros[i] == 0) {
                System.out.println("[!] Deuuu");
                System.exit(SSLEngineResult.Status.CLOSED.ordinal());
                break;
            }
        }
        System.out.println("[!] Guardando numeros...");
        Thread.sleep(1000L);

        System.out.println("========== OPERACIONS ==========");


        System.out.println("[!] Numero més petit: " + numPetit(numeros));
        System.out.println("[!] Numero més gran: " + numGran(numeros));
        System.out.println("[!] Suma total: " + sumaTotal(numeros));

        System.out.println("");

        Arrays.sort(numeros);
        System.out.println("[!] Ordenats ascendents: " + Arrays.toString(numeros).replace("[", "").replace("]", ""));

        ordenarDescendent(numeros);
        System.out.println("[!] Ordenats descendents: " + Arrays.toString(numeros).replace("[", "").replace("]", ""));

    }

    public static void main(String[] args) {
        try {
            new WarmupArrays();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    private void ordenarDescendent(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

    }

    private int sumaTotal(int array[]) {
        int suma_total = 0;
        for (int i = 0; i < array.length; i++) {
            suma_total += array[i];
        }

        return suma_total;
    }

    private int numGran(int[] array) {
        int n_gran = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n_gran) {
                n_gran = array[i];
            }
        }
        return n_gran;
    }

    private  int numPetit(int[] array) {
        int n_petit = 999999999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < n_petit) {
                n_petit = array[i];
            }
        }
        return n_petit;
    }
}