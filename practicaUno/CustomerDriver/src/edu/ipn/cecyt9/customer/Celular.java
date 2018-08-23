/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ipn.cecyt9.customer;
import java.util.Locale;
/**
 *
 * @author Alumno
 */
public class Celular {
    private Locale locale;
    private String marca;
    private String modelo;
    private String propietario;
    private String companiaT;
    private String numeroT;
    
    public Celular(){
        this.marca = "Marca de celular";
        this.modelo = "Modelo del celular";
        this.propietario = "Propietario del celular";
        this.companiaT = "Compañia del telefono celular";
        this.numeroT = "12345678";
        this.locale = Locale.ITALY;
    }
    
    public Celular(String MCelular){
        this.marca = MCelular;
        this.modelo = "Modelo del celular";
        this.propietario = "Propietario del celular";
        this.companiaT = "Compañia del telefono celular";
        this.numeroT = "12345678";
        this.locale = Locale.ITALY;
        
    }
    
    public Celular(String MCelular, String CModelo){
        this.marca = MCelular;
        this.modelo = CModelo;
        this.propietario = "Propietario del celular";
        this.companiaT = "Compañia del telefono celular";
        this.numeroT = "12345678";
        this.locale = Locale.ITALY;
    }
    
    public Celular(String MCelular, String CModelo, String CPropietario){
        this.marca = MCelular;
        this.modelo = CModelo;
        this.propietario = CPropietario;
        this.companiaT = "Compañia del telefono celular";
        this.numeroT = "12345678";
        this.locale = Locale.ITALY;
    }
    
    public Celular(String MCelular, String CModelo, String CPropietario, String CCompania){
        this.marca = MCelular;
        this.modelo = CModelo;
        this.propietario = CPropietario;
        this.companiaT = CCompania;
        this.numeroT = "12345678";
        this.locale = Locale.ITALY;
    }
    
    public Celular(String MCelular, String CModelo, String CPropietario, String CCompania, String NumeroC){
        this.marca = MCelular;
        this.modelo = CModelo;
        this.propietario = CPropietario;
        this.companiaT = CCompania;
        this.numeroT = NumeroC;
        this.locale = Locale.ITALY;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getCompaniaT() {
        return companiaT;
    }

    public void setCompaniaT(String companiaT) {
        this.companiaT = companiaT;
    }

    public String getNumeroT() {
        return numeroT;
    }

    public void setNumeroT(String numeroT) {
        this.numeroT = numeroT;
    }
    
    @Override
    
    public String toString() {
        java.text.NumberFormat format
                = java.text.NumberFormat.getCurrencyInstance(locale);
        StringBuilder value = new StringBuilder();
        value.append(String.format("Name: %s%n", this.marca));
        value.append(String.format("Account Number: %s%n",
                this.numeroT));
        value.append(String.format("Balance: %s%n",this.propietario));
        value.append(String.format("Balance: %s%n",(this.companiaT)));
        value.append(String.format("Balance: %s%n",(this.numeroT)));
        return value.toString();
    }
}
