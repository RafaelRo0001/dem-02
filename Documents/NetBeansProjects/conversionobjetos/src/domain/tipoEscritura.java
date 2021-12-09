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
public enum tipoEscritura {
    CLASICO("Escriutra a mano"),
    MODERNO("Escritura Digital");
    private final String descripcion;
    private tipoEscritura(String descripcion){
        this.descripcion=descripcion;
        
        
    }
    public String getDescripcion(){
        return this.descripcion;
    }
}
