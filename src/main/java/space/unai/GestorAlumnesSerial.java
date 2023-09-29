/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package space.unai;
import java.nio.file.Path;
import java.util.Scanner;

/**
 *
 * @author polri
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Alumne implements Serializable {
    private static final long serialVersionUID = 1L;

    private String idMatricula;
    private String nom;

    public Alumne(String idMatricula, String nom) {
        this.idMatricula = idMatricula;
        this.nom = nom;
    }

    public String getIdMatricula() {
        return idMatricula;
    }

    public String getNom() {
        return nom;
    }
}


public class GestorAlumnesSerial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix el nom del directori on treballar: ");
        String directori = scanner.nextLine();
        File directoriAlumnes = new File(directori);

        if (directoriAlumnes.exists()) {
            System.out.println("El directori ja existeix.");
        } else {
            if (directoriAlumnes.mkdirs()) {
                System.out.println("Directori creat amb èxit.");
            } else {
                System.out.println("No s'ha pogut crear el directori.");
                return;
            }
        }

        List<Alumne> alumnes = new ArrayList<>();
        int alumnesEntrats = 0;

        while (true) {
            System.out.print("Introdueix el codi d'estudiant ('S' per sortir): ");
            String codi = scanner.nextLine().trim().toUpperCase();

            if (codi.equals("S")) {
                System.out.println("Nombre d'alumnes entrats: " + alumnesEntrats);
                System.out.println("Llista d'alumnes:");

                for (Alumne alumne : alumnes) {
                    System.out.println(alumne.getIdMatricula() + " " + alumne.getNom());
                    // Serializar el objeto Alumne y guardarlo en un archivo
                    guardarAlumneEnArchivo(directoriAlumnes, alumne);
                }
                break;
            }

            boolean jaExisteix = alumnes.stream().anyMatch(a -> a.getIdMatricula().equals(codi));

            if (jaExisteix) {
                System.out.println("Aquest alumne ja existeix.");
            } else {
                System.out.print("Introdueix el nom de l'alumne: ");
                String nom = scanner.nextLine();
                Alumne nouAlumne = new Alumne(codi, nom);
                alumnes.add(nouAlumne);
                alumnesEntrats++;

                // Serializar el objeto Alumne y guardarlo en un archivo
                guardarAlumneEnArchivo(directoriAlumnes, nouAlumne);

                System.out.println("Alumne afegit amb èxit.");
            }
        }

        scanner.close();
    }

    private static void guardarAlumneEnArchivo(File directorio, Alumne alumne) {
        String nomFitxer = alumne.getIdMatricula() + ".alumne";
        File fitxerAlumne = new File(directorio, nomFitxer);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fitxerAlumne))) {
            outputStream.writeObject(alumne);
        } catch (IOException e) {
            System.out.println("Error en guardar l'alumne en el fitxer.");
            e.printStackTrace();
        }
    }
}
