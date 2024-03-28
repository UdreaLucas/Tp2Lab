/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reserva;

import java.util.Date;


public class Recibo {
    private long Id;
    private Date fechaCompra;
    private TipoPago tipoPago;
   

    public Recibo() {
    }

    public Recibo(long Id, Date fechaCompra, TipoPago tipoPago) {
        this.Id = Id;
        this.fechaCompra = fechaCompra;
        this.tipoPago = tipoPago;
       
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    
    @Override
    public String toString() {
        return "Recibo{" + "Id=" + Id + ", fechaCompra=" + fechaCompra + ", tipoPago=" + tipoPago + '}';
    }
    
    
    
    
}
