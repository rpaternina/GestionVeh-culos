package com.mycompany.gestionvehiculos;


public class Auto extends Vehiculo{

    private int numeroPuertas;

    public Auto(int numeroPuertas, String matricula, String marca, int modelo, double costoMantenimiento) {
        super(matricula, marca, modelo, costoMantenimiento);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularCostoMantenimiento() {
        
        double costoAuto = costoMantenimiento * numeroPuertas; 
        return costoAuto;
    }
    
    
}
