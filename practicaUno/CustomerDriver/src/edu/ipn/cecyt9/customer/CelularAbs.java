/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ipn.cecyt9.customer;

/**
 *
 * @author Alumno
 */
abstract class CelularAbs {
    abstract String encender(boolean encendido);
    
    public String llamada(String llamar){
        System.out.println("Si llama" + llamar);
        return llamar;
    }
    
    abstract String conexionInter(boolean conexion);
    
    public String senal(int senal){
        System.out.println("hay señal" + senal);
        return null;
    }
    
    public String telefonica(String compania){
        System.out.println("Tal compania" + compania);
        return compania;
    }
}
