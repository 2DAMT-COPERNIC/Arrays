package space.unai;
/*
 * AUTHOR: UNAI MEDINA FERNÁNDEZ
 * CURSO: 2 DAM
 * FECHA: 27/09/2023
 */

import java.util.Arrays;

public class EliminarSegundaPosicion {
    public static void main(String[] args) {
        Integer[] miArray = { 56, 12, 65, 42, 78 };

        int posicionAEliminar = 1;

        if (posicionAEliminar >= 0 && posicionAEliminar < miArray.length) {
            miArray[posicionAEliminar] = null;
            Integer[] nuevoArray = new Integer[miArray.length - 1];
            for (int i = 0; i < miArray.length; i++) {
                if (miArray[i] != null) {
                    nuevoArray[i] = miArray[i];
                }
            }

            System.out.println("[!] " + Arrays.toString(nuevoArray));
        }
    }
}
