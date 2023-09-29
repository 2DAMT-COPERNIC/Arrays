package space.unai.act2;

import space.unai.act2.more.Utils;

import javax.naming.NameNotFoundException;
import javax.net.ssl.SSLEngineResult;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * AUTHOR: UNAI MEDINA FERNÁNDEZ
 * CURSO: 2 DAM
 * FECHA: 29/09/2023 19:07
 */

public class HashMapManager {

    private static HashMap<String, String> words;

    private static Scanner sc;



    public static void main(String[] args) throws InterruptedException {
        words = new HashMap<>();
        int opcio = 0;

        Utils.hardcode(words);

        sc = new Scanner(System.in);
            do {
                try {
                    Utils.sendMenu();
                    opcio = sc.nextInt();
                    switch (opcio) {
                        case 1:
                            try {
                                Utils.addEntry(words);
                            } catch (ArrayStoreException e) {
                                System.out.println("[!] " + e.getLocalizedMessage());
                            }
                            break;
                        case 2:
                            try {
                                Utils.deleteEntry(words);
                            } catch (ArrayStoreException e) {
                                System.out.println("[!] " + e.getLocalizedMessage());
                            }
                            break;
                        case 3:
                            System.out.println("[>] Clau en català per trobar:");
                            String clau = sc.next();
                            try {
                                System.out.println("[&] Traducció de '" + clau + "': " + Utils.showTranslation(words, clau));
                            } catch (NameNotFoundException e) {
                                throw new RuntimeException(e);
                            }
                            break;
                        case 4:
                            words.forEach((key, value) -> {
                                System.out.println("[&] '" + key + "' es en anglès '" + value + "'");
                            });
                            break;
                        case 0:
                            System.out.println("[!?] Sortint del programa...");
                            System.exit(SSLEngineResult.Status.CLOSED.ordinal());
                            break;
                        default:
                            throw new IllegalArgumentException("La opció no es valida");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("[!] " + e.getLocalizedMessage());
                }

                Thread.sleep(3000);
            } while (opcio != 0);
    }
}
