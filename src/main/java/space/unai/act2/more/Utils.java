package space.unai.act2.more;

/*
 * AUTHOR: UNAI MEDINA FERNÁNDEZ
 * CURSO: 2 DAM
 * FECHA: 29/09/2023 19:11
 */

import javax.naming.NameNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Utils {

    private static Scanner sc = new Scanner(System.in);

    public static void sendMenu() {
        System.out.println("=========== MENU ===========");
        System.out.println("1. Afegir entrada");
        System.out.println("2. Eliminar entrada");
        System.out.println("3. Mostrar traducció");
        System.out.println("4. Llistar entradas");
        System.out.println("0. Sortir");
        System.out.println("=========== MENU ===========");
        System.out.println("[>] Que vols executar?");
    }

    public static void addEntry(HashMap<String, String> words) throws ArrayStoreException {
        System.out.println("[>] Introdueix un mot en català:");
        String c = sc.next();
        System.out.println("[>] Introdueix la traducció en anglès:");
        String a = sc.next();
        for (Map.Entry<String, String> w : words.entrySet()) {
            if (c.equals(w.getKey())) {
                throw new ArrayStoreException("El mot en català existeix!");
            } else if (a.equals(w.getValue())) {
                throw new ArrayStoreException("El mot en anglès existeix!");
            }
        }

        words.put(c, a);
        System.out.println("[&] Mot afegit al HashMap!");
    }

    public static void deleteEntry(HashMap<String, String> words) throws ArrayStoreException {
        System.out.println("[>] Introdueix la clau de que vols borrar:");
        String c = sc.next();

        for (Map.Entry<String, String> w : words.entrySet()) {
            if (!Objects.equals(c, w.getKey())) {
                throw new ArrayStoreException("No existeix el mot!");
            } else {
                words.remove(c);
                System.out.println("[&] Mot borrat del HashMap.");
            }
        }
    }

    public static String showTranslation(HashMap<String, String> words, String key) throws NameNotFoundException {
        String value = "";
        for (Map.Entry<String, String> w : words.entrySet()) {
            if (w.getKey().equals(key)) {
                value = w.getValue();
            } else {
                throw new NameNotFoundException("El valor " + key + " no està al HashMap!");
            }
            System.out.println("[&] " + key + " encontrada!");
        }
        return value;
    }

    public static void hardcode(HashMap<String, String> words) {
        words.put("Prova", "Test");
        words.put("Hola", "Hello");
        words.put("Idioma", "Language");
        System.out.println("");
        System.out.println("");
        System.out.println("[&] Hardcode executat!!");
        System.out.println("");
        System.out.println("");
    }
}
