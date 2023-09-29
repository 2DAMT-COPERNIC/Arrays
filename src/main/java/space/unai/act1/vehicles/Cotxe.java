package space.unai.act1.vehicles;
/*
 * AUTHOR: UNAI MEDINA FERNÁNDEZ
 * CURSO: 2 DAM
 * FECHA: 27/09/2023
 */

import space.unai.act1.manager.Vehicle;

public class Cotxe extends Vehicle {

    private int rodes;

    public Cotxe(String matricula, int velocitat_maxima, int rodes) {
        super(matricula, velocitat_maxima);
        this.rodes = rodes;
    }

    @Override
    public String toString() {
        return "Cotxe = " + super.toString() + " | Rodes -> " + this.rodes;
    }
}
