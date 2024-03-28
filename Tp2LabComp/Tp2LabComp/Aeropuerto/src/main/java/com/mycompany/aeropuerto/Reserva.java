/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aeropuerto;


public class Reserva {
    private int numeroReserva;
    private Vuelo v;

    public Reserva() {
    }

    public Reserva(int numeroReserva, Vuelo v) {
        this.numeroReserva = numeroReserva;
        this.v = v;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public Vuelo getV() {
        return v;
    }

    public void setV(Vuelo v) {
        this.v = v;
    }
    
    
}
