/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reserva;


public class Piloto extends Persona{
    private String Credencial;
    private Avion vuela;

    public Piloto() {
    }

    public Piloto(String Credencial, Avion vuela) {
        this.Credencial = Credencial;
        this.vuela = vuela;
    }

    public Piloto(String Credencial, Avion vuela, String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.Credencial = Credencial;
        this.vuela = vuela;
    }

    public String getCredencial() {
        return Credencial;
    }

    public void setCredencial(String Credencial) {
        this.Credencial = Credencial;
    }

    public Avion getVuela() {
        return vuela;
    }

    public void setVuela(Avion vuela) {
        this.vuela = vuela;
    }

    @Override
    public String toString() {
        return "Piloto{" + "Credencial=" + Credencial + ", vuela=" + vuela + '}';
    }

    
    
}
