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
public interface CelularInter {
    public String encender(boolean encendido);
    public String llamada(String llamar);
    public String conexionInter(boolean conexion);
    public String senal(int senal);
    public String telefonica(String compania);
}
