package space.unai.act1.manager;
/*
 * AUTHOR: UNAI MEDINA FERNÁNDEZ
 * CURSO: 2 DAM
 * FECHA: 27/09/2023
 */

public class Vehicle {

    public String matricula;
    public int velocitatMaxima;

    public Vehicle(String matricula, int velocitatMaxima) {
        this.matricula = matricula;
        this.velocitatMaxima = velocitatMaxima;
    }

    public int getVelocitatMaxima() {
        return velocitatMaxima;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + " (Velocitat máxima: " + velocitatMaxima + "km/h)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return matricula.equals(vehicle.matricula);
    }
}
