/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reserva;

import java.util.Date;


public class Reserva {
    private long Id;
    private Date salida;
    private Cliente cliente;
    private Recibo recibo;

    public Reserva() {
    }

    public Reserva(long Id, Date salida, Cliente cliente, Recibo recibo) {
        this.Id = Id;
        this.salida = salida;
        this.cliente = cliente;
        this.recibo = recibo;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
    }

    @Override
    public String toString() {
        return "Reserva{" + "Id=" + Id + ", salida=" + salida + ", cliente=" + cliente + ", recibo=" + recibo + '}';
    }

    

    
    
    
}
