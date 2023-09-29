package space.unai.act1;
/*
 * AUTHOR: UNAI MEDINA FERNÁNDEZ
 * CURSO: 2 DAM
 * FECHA: 27/09/2023
 */

import space.unai.act1.manager.Vehicle;
import space.unai.act1.manager.VehicleComparator;
import space.unai.act1.vehicles.Avio;
import space.unai.act1.vehicles.Cotxe;
import space.unai.act1.vehicles.Vaixell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActivitatLists {

    private static List<Vehicle> vehicleList;

    public static void main(String[] args) {
        vehicleList = new ArrayList<>();
        vehicleList.add(new Cotxe("9345DFG", 140, 4));
        vehicleList.add(new Cotxe("2233ADG", 180, 4));
        vehicleList.add(new Vaixell("DF-345-TY", 80, 4));
        vehicleList.add(new Vaixell("L-001-EK", 60, 3));
        vehicleList.add(new Avio("X-9008789", 480, 2));
        vehicleList.add(new Avio("X-9008789", 680, 2));

        System.out.println("---------------------------------");
        System.out.println("Llista de vehicles sense ordenar:");
        vehicleList.forEach(vehicle ->
                System.out.println("[?] " + vehicle.toString())
        );

        System.out.println("---------------------------------");
        System.out.println("Vehicle de la primera posició:");
        System.out.println("[?] " + vehicleList.get(0).toString());

        vehicleList.sort(new VehicleComparator());

        System.out.println("---------------------------------");
        System.out.println("Vehicles ordenats per velocitat:");
        vehicleList.forEach(vehicle -> {
            System.out.println("[?] " + vehicle.toString());
        });

        vehicleList.remove(1);

        System.out.println("---------------------------------");
        System.out.println("Element de la segona posició:");
        System.out.println("[?] " + vehicleList.get(1).toString());

        System.out.println("---------------------------------");
    }
}
