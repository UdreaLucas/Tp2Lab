/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reserva;

public class Asiento {
    
    private long Id;
    private String numeroAsiento;
    private Reserva reserva;
    private Avion avion;

    public Asiento() {
    }

    public Asiento(long Id, String numeroAsiento, Reserva reserva, Avion avion) {
        this.Id = Id;
        this.numeroAsiento = numeroAsiento;
        this.reserva = reserva;
        this.avion = avion;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    @Override
    public String toString() {
        return "Asiento{" + "Id=" + Id + ", numeroAsiento=" + numeroAsiento + ", reserva=" + reserva + ", avion=" + avion + '}';
    }

    
    
    
    
}
