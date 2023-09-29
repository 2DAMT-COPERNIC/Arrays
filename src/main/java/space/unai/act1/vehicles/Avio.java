package space.unai.act1.vehicles;
/*
 * AUTHOR: UNAI MEDINA FERNÁNDEZ
 * CURSO: 2 DAM
 * FECHA: 27/09/2023
 */

import space.unai.act1.manager.Vehicle;

public class Avio extends Vehicle {
    private int ales;

    public Avio(String matricula, int velocitat_maxima, int ales) {
        super(matricula, velocitat_maxima);
        this.ales = ales;
    }

    @Override
    public String toString() {
        return "Avió = " + super.toString() + " | Ales -> " + this.ales;
    }
}
