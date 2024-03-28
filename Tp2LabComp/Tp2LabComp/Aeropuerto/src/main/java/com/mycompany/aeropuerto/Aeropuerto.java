/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aeropuerto;

import java.util.ArrayList;


public class Aeropuerto {

    public static void main(String[] args) {
        ArrayList<Reserva> reservas = new ArrayList();
        reservas.add( new Reserva(1, null));
        reservas.add( new Reserva(2, null));

        Flota flota = new Flota();

        //creo los pilotos
        Piloto[] pilotos = new Piloto[2];
        pilotos[0] = new Piloto(23456,null,"Jose","2342342");
        pilotos[1] = new Piloto(23450,null,"Luis","2343222");



        Vuelo vuelo = new Vuelo(8514,null,reservas);
        ArrayList<Vuelo> vuelos= new ArrayList();
        vuelos.add(vuelo);


        //setear reservas en vuelo
        reservas.get(0).setV(vuelo);
        reservas.get(1).setV(vuelo);

        Avion avion = new Avion(12000,
                vuelos,
                flota,
                pilotos);

        vuelo.setPertenece(avion);

        pilotos[0].setVuela(avion);
        pilotos[1].setVuela(avion);

        pilotos[0].vuela();

        
        
    }
}
