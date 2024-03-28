/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aeropuerto;

import java.util.ArrayList;

public class Avion {
    private int autonomia;
    private ArrayList<Vuelo>vuelos;
    private Flota flota;
    private Piloto piloto[];
    public Avion() {
    }

    public Avion(int autonomia, ArrayList<Vuelo> vuelos, Flota flota, Piloto[] piloto) {
        this.autonomia = autonomia;
        this.vuelos = vuelos;
        this.flota = flota;
        this.piloto = piloto;
    }

   
    
    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public Flota getFlota() {
        return flota;
    }

    public void setFlota(Flota flota) {
        this.flota = flota;
    }

    public Piloto[] getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto[] piloto) {
        this.piloto = piloto;
    }

    
    
    
    
}
