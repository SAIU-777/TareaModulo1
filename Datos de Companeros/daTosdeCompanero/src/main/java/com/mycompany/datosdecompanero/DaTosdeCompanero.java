/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datosdecompanero;

/**
 *
 * @author DPLPT90
 */
public class DaTosdeCompanero {

    public static void main(String[] args) {
        // Arreglo multidimensional con datos personales
        String[][] companeros = {
            {"Gissel", "Aguilera", "Ingenieria en Sistemas", "Google"},
            {"Andrea", "Acosta", "Derecho", "UTH"},
            {"Eros", "Barriery", "Medicina", "Hospital La Paz"},
            {"Juan Carlos", "Cabrera", "Arquitectura", "Freelancer"},
            {"Carlos", "Reyes", "Contabilidad", "Banco Atlantida"}
        };

        // Imprimir datos de los compañeros
        for (String[] companero : companeros) {
            System.out.println(companero[0] + " " + companero[1] + " - " + companero[2] + " - " + companero[3]);
        }
    }
}


