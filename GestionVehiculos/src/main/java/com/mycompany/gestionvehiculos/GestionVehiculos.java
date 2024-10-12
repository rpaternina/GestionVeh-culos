/*
 * Crea un programa que gestione un inventario de vehículos. 
El sistema debe permitir agregar diferentes tipos de vehículos 
(autos y motocicletas) con atributos comunes y específicos para 
cada tipo de vehículo. Además, debe permitir realizar operaciones 
como mostrar los vehículos registrados, buscar por matrícula, y calcular 
el costo total de mantenimiento para todos los vehículos.
 */

package com.mycompany.gestionvehiculos;

import javax.swing.JOptionPane;

public class GestionVehiculos {

    public static void main(String[] args) {
        
        boolean salir = true;

        while (salir) {
            
            try {
                int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "GESTIÓN DE VEHÍCULO \n"
                        + "1: Agregar vehículo \n"
                        + "2: Mostrar vehículo \n"
                        + "3: Buscar vehículo por matricula \n"
                        + "4: Calcular costo total de mantenimiento \n"
                        + "5: Salir"));

                switch (menu) {
                    case 1:
                        
                        break;
                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    case 5:
                        salir = false;
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
