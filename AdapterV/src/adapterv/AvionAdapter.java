/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterv;

/**
 *
 * @author JhormanB,MaryuriM
 */
public class AvionAdapter extends Vehiculo {
    
    private Avion avion1;
    
    public AvionAdapter(){
        super();
        this.avion1 = new Avion();
        System.out.println("Comprando Avión...");
    }
    @Override 
    public void Motor(){
        System.out.println("Seleccionando Motor...");
        this.avion1.Capacidad();
        this.avion1.Fuselaje();
        this.avion1.Turbinas();
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
