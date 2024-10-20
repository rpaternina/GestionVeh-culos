/*
 * Crea un programa que gestione un inventario de vehículos. 
El sistema debe permitir agregar diferentes tipos de vehículos 
(autos y motocicletas) con atributos comunes y específicos para 
cada tipo de vehículo. Además, debe permitir realizar operaciones 
como mostrar los vehículos registrados, buscar por matrícula, y calcular 
el costo total de mantenimiento para todos los vehículos.
 */
package com.mycompany.gestionvehiculos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionVehiculos {

    public static void main(String[] args) {

        List<Auto> listaAuto = new ArrayList<Auto>();

        List<Motocicleta> listaMotocicleta = new ArrayList<Motocicleta>();

        boolean salirMenu1 = true;

        while (salirMenu1) {

            try {
                int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "GESTIÓN DE VEHÍCULO \n"
                        + "1: Agregar vehículo \n"
                        + "2: Mostrar vehículos \n"
                        + "3: Buscar vehículo por matricula \n"
                        + "4: Calcular costo total de mantenimiento \n"
                        + "5: Salir"));

                switch (menu) {
                    case 1:

                        boolean salirMenu2 = true;
                        while (salirMenu2) {
                            try {
                                int menu2 = Integer.parseInt(JOptionPane.showInputDialog(null, "ESCOJA EL TIPO DE VEHÍCULO \n"
                                        + "1: Auto \n"
                                        + "2: Motocicleta \n"
                                        + "3: Menú principal"));

                                switch (menu2) {
                                    case 1:
                                        boolean guardarAuto = true;
                                        int numeroPuertas = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de puertas"));
                                        String marca = JOptionPane.showInputDialog(null, "Marca");
                                        String matricula = JOptionPane.showInputDialog(null, "Matricula");
                                        int modelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Modelo"));
                                        //float mantenimiento = Float.parseFloat(JOptionPane.showInputDialog(null, "Costo del mantenimiento"));

                                        double mantenimiento = Double.parseDouble(JOptionPane.showInputDialog(null, "Costo del mantenimiento"));

                                        if (guardarAuto) {

                                            Auto nuevoAuto = new Auto(numeroPuertas, matricula, marca, modelo, mantenimiento);
                                            listaAuto.add(nuevoAuto);
                                            JOptionPane.showMessageDialog(null, "Auto registrado con exito!");
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Error en el registro");
                                        }

                                        //JOptionPane.showMessageDialog(null, "Costo mantenimiento: " + nuevoAuto.calcularCostoMantenimiento());
                                        break;
                                    case 2:

                                        boolean guardarMotocicleta = true;
                                        int cilindraje = Integer.parseInt(JOptionPane.showInputDialog(null, "Cilindraje"));
                                        String marcaMoto = JOptionPane.showInputDialog(null, "Marca");
                                        String matriculaMoto = JOptionPane.showInputDialog(null, "Matricula");
                                        int modeloMoto = Integer.parseInt(JOptionPane.showInputDialog(null, "Modelo"));
                                        float mantenimientoMoto = Float.parseFloat(JOptionPane.showInputDialog(null, "Costo del mantenimiento"));

                                        if (guardarMotocicleta) {
                                            Motocicleta nuevaMotocicleta = new Motocicleta(cilindraje, matriculaMoto, marcaMoto, modeloMoto, mantenimientoMoto);
                                            listaMotocicleta.add(nuevaMotocicleta);
                                            JOptionPane.showMessageDialog(null, "Motocicleta registrada con exito");
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Error en el registro");
                                        }

                                        //JOptionPane.showMessageDialog(null, "Costo mantenimiento: " + nuevaMotocicleta.calcularCostoMantenimiento());
                                        break;

                                    case 3:
                                        salirMenu2 = false;
                                        break;

                                    default:
                                        JOptionPane.showMessageDialog(null, "Ingrese una opción valida 1-5");
                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Ingrese una opción valida 1-5");
                            }
                        }

                        break;

                    //Mostrar todos los vehículos    
                    case 2:

                        boolean salirMenu3 = true;
                        while (salirMenu3) {
                            try {
                                int menu3 = Integer.parseInt(JOptionPane.showInputDialog(null, "MOSTRAR VEHÍCULOS \n"
                                        + "1: Autos \n"
                                        + "2: Motocicletas \n"
                                        + "3: Menú principal"));

                                switch (menu3) {
                                    case 1:
                                        StringBuilder vehiculos = new StringBuilder();

                                        if (listaAuto.isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "No hay Autos registrados");
                                        } else {
                                            for (Auto mostrarAutos : listaAuto) {
                                                vehiculos
                                                        .append("\nMarca: ").append(mostrarAutos.getMarca().toUpperCase()).append("\n")
                                                        .append("Modelo: ").append(mostrarAutos.getModelo());
                                            }

                                            JOptionPane.showMessageDialog(null, "Autos" + vehiculos.toString());
                                        }
                                        break;
                                    case 2:
                                        StringBuilder motos = new StringBuilder();
                                        if (listaMotocicleta.isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "No hay Motos registradas");
                                        } else {
                                            for (Motocicleta mostrarMotos : listaMotocicleta) {
                                                motos.append("\nMarca: ").append(mostrarMotos.getMarca().toUpperCase()).append("\n")
                                                        .append("Modelo: ").append(mostrarMotos.getModelo()).append("\n")
                                                        .append("Cilindraje: ").append(mostrarMotos.getCilindraje());
                                            }

                                            JOptionPane.showMessageDialog(null, "Motocicletas" + motos.toString());
                                        }
                                        break;
                                    case 3:
                                        salirMenu3 = false;
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Ingrese una opción valida 1-5");
                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Ingrese una opción valida 1-5");
                            }
                        }

                        break;

                    //Buscar vehículo por matricula    
                    case 3:
                        boolean salirMenu4 = true;
                        boolean placaEncontrada = false;
                        boolean placaEncontradaMoto = false;

                        while (salirMenu4) {
                            try {
                                int menu4 = Integer.parseInt(JOptionPane.showInputDialog(null, "VEHÍCULOS POR MATRICULA \n"
                                        + "1: Autos \n"
                                        + "2: Motocicletas \n"
                                        + "3: Menú principal"));

                                switch (menu4) {
                                    case 1:

                                        String matriculaAuto = JOptionPane.showInputDialog(null, "Matricula");

                                        if (listaAuto.isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "No hay autos registrados");

                                        } else {
                                            StringBuilder placa = new StringBuilder();
                                            for (Auto autoPlaca : listaAuto) {

                                                if (matriculaAuto.equals(autoPlaca.getMatricula())) {
                                                    placa
                                                            .append("Marca \n").append(autoPlaca.getMarca().toUpperCase())
                                                            .append("\nModelo \n").append(autoPlaca.getModelo())
                                                            .append("\n# Puertas \n").append(autoPlaca.getNumeroPuertas())
                                                            .append("\nMatricula \n").append(autoPlaca.getMatricula().toUpperCase());
                                                    placaEncontrada = true;
                                                    break;

                                                }

                                            }
                                            if (placaEncontrada) {
                                                JOptionPane.showMessageDialog(null, "Auto \n" + placa.toString());
                                            } else {
                                                JOptionPane.showMessageDialog(null, "No existe");
                                            }

                                        }

                                        break;

                                    case 2:
                                        String matriculaMoto = JOptionPane.showInputDialog(null, "Matricula");

                                        if (listaMotocicleta.isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "No hay Motos registradas");

                                        } else {
                                            StringBuilder placa = new StringBuilder();
                                            for (Motocicleta motoPlaca : listaMotocicleta) {

                                                if (matriculaMoto.equals(motoPlaca.getMatricula())) {
                                                    placa
                                                            .append("Marca \n").append(motoPlaca.getMarca().toUpperCase())
                                                            .append("\nModelo \n").append(motoPlaca.getModelo())
                                                            .append("\nCilindraje \n").append(motoPlaca.getCilindraje())
                                                            .append("\nMatricula \n").append(motoPlaca.getMatricula().toUpperCase());
                                                    placaEncontradaMoto = true;
                                                    break;

                                                }

                                            }
                                            if (placaEncontradaMoto) {
                                                JOptionPane.showMessageDialog(null, "Motocicleta \n" + placa.toString());
                                            } else {
                                                JOptionPane.showMessageDialog(null, "No existe");
                                            }

                                        }

                                        break;

                                    case 3:
                                        salirMenu4 = false;
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Ingrese una opción valida 1-5");
                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Ingrese una opción valida 1-5");
                            }

                        }

                        break;

                    //calcular costo mantenimeinto        
                    case 4:
                        boolean salirMenu5 = true;
                        double costoTotal = 0;
                        double cosTotalMotos = 0;
                        while (salirMenu5) {
                            try {
                                int menu3 = Integer.parseInt(JOptionPane.showInputDialog(null, "COSTO TOTAL DE MANTENIMIENTO \n"
                                        + "1: Autos \n"
                                        + "2: Motocicletas \n"
                                        + "3: Menú principal"));

                                switch (menu3) {
                                    case 1:
                                        StringBuilder vehiculos = new StringBuilder();

                                        if (listaAuto.isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "No hay Autos registrados");
                                        } else {
                                            for (Auto mostrarAutos : listaAuto) {

                                                double costoMantenimientoAuto = mostrarAutos.calcularCostoMantenimiento();
                                                costoTotal += costoMantenimientoAuto;
                                                vehiculos
                                                        .append("\nMarca: ").append(mostrarAutos.getMarca().toUpperCase()).append("\n")
                                                        .append("Modelo: ").append(mostrarAutos.getModelo()).append("\n")
                                                        .append("Costo de mantenimeinto: ").append(mostrarAutos.calcularCostoMantenimiento());
                                            }

                                            JOptionPane.showMessageDialog(null, "Autos" + vehiculos.toString() + "\n "
                                                    + "---------------------------------------------" + "\n"
                                                    + "Costo total: " + costoTotal);

                                        }
                                        break;
                                    case 2:
                                        StringBuilder motos = new StringBuilder();

                                        if (listaMotocicleta.isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "No hay Motos registradas");
                                        } else {
                                            for (Motocicleta mostrarMotos : listaMotocicleta) {

                                                double costoMotos = mostrarMotos.calcularCostoMantenimiento();
                                                cosTotalMotos += costoMotos;

                                                motos.append("\nMarca: ").append(mostrarMotos.getMarca().toUpperCase()).append("\n")
                                                        .append("Modelo: ").append(mostrarMotos.getModelo()).append("\n")
                                                        .append("Cilindraje: ").append(mostrarMotos.getCilindraje()).append("\n")
                                                        .append("Costo de mantenimiento: ").append(mostrarMotos.calcularCostoMantenimiento());
                                            }

                                            JOptionPane.showMessageDialog(null, "Motocicletas" + motos.toString() + "\n"
                                                    + "---------------------------------------------" + "\n"
                                                    + "Costo toal: " + cosTotalMotos);
                                        }
                                        break;
                                    case 3:
                                        salirMenu5 = false;
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Ingrese una opción valida 1-5");
                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Ingrese una opción valida 1-5");
                            }
                        }

                        break;

                    case 5:
                        salirMenu1 = false;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Ingrese una opción valida 1-5");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese una opción valida 1-5");
            }

        }

    }
}
