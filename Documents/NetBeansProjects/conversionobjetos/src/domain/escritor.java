/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Rafael Rosas
 */
public class escritor extends Empleado {
    
    final tipoEscritura tipoescritura;
    
    public escritor(String nombre, double sueldo,tipoEscritura tipoescritura) {
        super(nombre, sueldo);
     this.tipoescritura=tipoescritura; 
    }
    @Override
   public String obtenerDetalles(){
       return super.obtenerDetalles()+", tipoEscritura: "+tipoescritura.getDescripcion();
       
       
   } 

    @Override
    public String toString() {
        return "escritor{" + "tipoescritura=" + tipoescritura + '}'+" "+super.toString();
    }
   public tipoEscritura getTipoEscritura(){
       return this.tipoescritura;
   }
}
