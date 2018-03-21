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
public class Carro extends Vehiculo{
    
    public Carro(){
        super();
        System.out.println("Comprando Carro");
    }
    
    @Override 
    public void Motor(){
        System.out.println("Seleccionando Motor...");
    }
    @Override 
    public void Cilindraje(){
        System.out.println("Seleccionando Cilindraje...");
    }
    @Override 
    public void Color(){
        System.out.println("Seleccionando Color...");
    }
    @Override 
    public void Placa(){
        System.out.println("Seleccionando Placa...");
    }
    
}
