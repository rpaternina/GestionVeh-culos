package com.mycompany.gestionvehiculos;

public class Motocicleta extends Vehiculo{

    private int cilindraje;

    public Motocicleta(int cilindraje, String matricula, String marca, int modelo, double costoMantenimiento) {
        super(matricula, marca, modelo, costoMantenimiento);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    
}
