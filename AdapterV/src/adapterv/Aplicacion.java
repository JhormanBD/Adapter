/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterv;

/**
 *
 * @author JhormanB
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Aplicacion miApp = new Aplicacion();
        System.out.println("\n ********************* Comprar Carro ********************");
        miApp.ComprarCarro();
        System.out.println("\n ********************* Comprar Moto ********************");
        miApp.ComprarMoto();
        System.out.println("\n ********************* Comprar Avion ********************");
        miApp.ComprarAvion();
        
        
    }
    public void ComprarCarro(){
        Vehiculo veh = new Carro();
        veh.Motor();
        veh.Cilindraje();
        veh.Color();
        veh.Placa();
    }
    
    public void ComprarMoto(){
        Vehiculo veh = new Moto();
        veh.Motor();
        veh.Cilindraje();
        veh.Color();
        veh.Placa();
    }
    public void ComprarAvion(){
        Vehiculo veh = new AvionAdapter();
        veh.Motor();
        veh.Cilindraje();
        veh.Color();
        veh.Placa();
    }
    
}
