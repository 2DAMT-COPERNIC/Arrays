package space.unai.act1.manager;

import java.util.Comparator;

/*
 * AUTHOR: UNAI MEDINA FERNÁNDEZ
 * CURSO: 2 DAM
 * FECHA: 27/09/2023 19:33
 */

public class VehicleComparator implements Comparator<Vehicle> {
    public int compare(Vehicle v1, Vehicle v2) {
        return Integer.compare(v2.getVelocitatMaxima(), v1.getVelocitatMaxima()); // Ordena de més ràpid a menys ràpid
    }
}
