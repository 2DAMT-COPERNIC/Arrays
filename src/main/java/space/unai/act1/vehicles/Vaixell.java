package space.unai.act1.vehicles;
/*
 * AUTHOR: UNAI MEDINA FERNÁNDEZ
 * CURSO: 2 DAM
 * FECHA: 27/09/2023
 */

import space.unai.act1.manager.Vehicle;

public class Vaixell extends Vehicle {
    private int veles;

    public Vaixell(String matricula, int velocitat_maxima, int veles) {
        super(matricula, velocitat_maxima);
        this.veles = veles;
    }

    @Override
    public String toString() {
        return "Vaixell = " + super.toString() + " | Rodes -> " + this.veles;
    }
}
