package com.mycompany.gestionvehiculos;

public abstract class Vehiculo {
    
    protected String matricula;
    protected String marca;
    protected int modelo;
    protected double costoMantenimiento;

    public Vehiculo(String matricula, String marca, int modelo, double costoMantenimiento) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.costoMantenimiento = costoMantenimiento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getCostoMantenimiento() {
        return costoMantenimiento;
    }

    public void setCostoMantenimiento(float costoMantenimiento) {
        this.costoMantenimiento = costoMantenimiento;
    }
    
    public abstract double calcularCostoMantenimiento();
        
}
