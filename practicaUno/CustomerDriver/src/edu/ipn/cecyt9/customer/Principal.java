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
public class Principal {
    public static void main(String[] args) {
        Celular celular1 = new Celular("marca");
        Celular celular2 = new Celular("marca", "modelo");
        Celular celular3 = new Celular("marca", "modelo", "propietario");
        Celular celular4 = new Celular("marca", "modelo", "propietario", "Compania");
        Celular celular5 = new Celular("marca", "modelo", "propietario", "compania", "12345678");
        
        System.out.println(celular1.toString());
        System.out.println(celular2.toString());
        System.out.println(celular3.toString());
        System.out.println(celular4.toString());
        System.out.println(celular5.toString());
    }
}
