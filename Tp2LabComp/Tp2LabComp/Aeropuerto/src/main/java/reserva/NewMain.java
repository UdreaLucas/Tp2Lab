/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reserva;

import java.util.Date;


public class NewMain {

    public static void main(String[] args) {

   
        Piloto piloto1 = new Piloto("Licencia123", null); 
        Piloto piloto2 = new Piloto("Licencia456", null); 

        Piloto[] pilotos = {piloto1, piloto2};
        Avion avion = new Avion(1, pilotos);
        

        piloto1.setVuela(avion);
        piloto2.setVuela(avion);
        

        Cliente cliente1 = new Cliente();
        cliente1.setDni("11111111A");
        cliente1.setNombre("Pedro");
        cliente1.setApellido("Martínez");
        
        Cliente cliente2 = new Cliente();
        cliente2.setDni("22222222B");
        cliente2.setNombre("Ana");
        cliente2.setApellido("López");
        

        Recibo recibo1 = new Recibo(101, new Date(), TipoPago.EFECTIVO);
        Recibo recibo2 = new Recibo(102, new Date(), TipoPago.TARJETA);
    
      
        Date salida = new Date(); // Fecha actual como ejemplo
        Reserva reserva1 = new Reserva(1, salida, cliente1, recibo1);
        cliente1.setReserva(reserva1);
        
        Reserva reserva2 = new Reserva(2, salida, cliente2, recibo2);
        cliente2.setReserva(reserva2);
        
        System.out.println("Avión: " + avion.getId());
        System.out.println("Pilotos: ");
        for (Piloto piloto : avion.getPilotos()) {
            System.out.println(piloto);
        }
        
        System.out.println("hola");
        System.out.println("\nReserva 1: " + reserva1.getId());
        System.out.println("Cliente 1: " + cliente1.getDni());
        
        System.out.println("\nReserva 2: " + reserva2.getId());
        System.out.println("Cliente 2: " + cliente2.getDni());
    }
    
}
