/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reserva;


public class Cliente extends Persona{
    private Reserva reserva;

    public Cliente() {
    }

    public Cliente(Reserva reserva) {
        this.reserva = reserva;
    }

    public Cliente(Reserva reserva, String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.reserva = reserva;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public String toString() {
        return "Cliente{" + "reserva=" + reserva + '}';
    }

   
    
    
    
}
