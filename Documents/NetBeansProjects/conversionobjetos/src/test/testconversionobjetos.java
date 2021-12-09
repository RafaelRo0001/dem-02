/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.*;

/**
 *
 * @author Rafael Rosas
 */
public class testconversionobjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new escritor("Juan",5000,tipoEscritura.CLASICO);
//        System.out.println("empleado = "+empleado);
      
//  System.out.println(empleado.obtenerDetalles());

//downcasting convirtiendo clase padre empleado hacia un hijo escritor
        //((escritor)empleado).getTipoEscritura();
        escritor escritor=(escritor)empleado;
        escritor.getTipoEscritura();
        Empleado empleado2=escritor;
        System.out.println( empleado2.obtenerDetalles());
    }
   
}
