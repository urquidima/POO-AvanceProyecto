/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import proyecto_final.MuestraPedirDatos;

/**
 *
 * @author alox1
 */
public abstract class Vehiculo implements MuestraPedirDatos {
   private int cilindros;
   private String traccion;
   private String transmision;
   private int numVel;
   private String color;
   private String descripcion;
   private String marca;
   private String modelo;
   private int pasajeros;
   private double precio;
   private String placas;

    public Vehiculo() {
        cilindros=0;
        traccion="";
        transmision="";
        numVel=0;
        color="";
        descripcion="";
        marca="";
        modelo="";
        pasajeros=0;
        precio=0.0;
        placas="";
    }

    public Vehiculo(int cilindros, String traccion, String transmision, int numVel, String color, String descripcion, String marca, String modelo, int pasajeros, double precio, String placas) {
        this.cilindros = cilindros;
        this.traccion = traccion;
        this.transmision = transmision;
        this.numVel = numVel;
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.modelo = modelo;
        this.pasajeros = pasajeros;
        this.precio = precio;
        this.placas = placas;
    }


    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public int getNumVel() {
        return numVel;
    }

    public void setNumVel(int numVel) {
        this.numVel = numVel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }
   
    
}
