package space.unai;
/*
 * AUTHOR: UNAI MEDINA FERNÁNDEZ
 * CURSO: 2 DAM
 * FECHA: 27/09/2023
 */

import java.util.Arrays;

public class AgregarUltimaPosicion {

    public static void main(String[] args) {
        Integer[] miArray = { 56, 12, 64, null, null, null };

        Integer elementoAgregado = 42;

        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] == null) {
                miArray[i] = elementoAgregado;
                break;
            }
        }

        System.out.println(Arrays.toString(miArray));

        Integer[] intArray = { 56, 12, 65 };
        int elemAgregado = 42;

        Integer[] nuevoArray = Arrays.copyOf(intArray, 4);

        nuevoArray[intArray.length] = elemAgregado;
        System.out.println("[!] Array nueva: " + Arrays.toString(nuevoArray));

        intArray = nuevoArray;

        System.out.println("[!] Array vieja: " + Arrays.toString(intArray));
    }
}
