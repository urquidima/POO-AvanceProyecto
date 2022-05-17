/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import javax.swing.JOptionPane;

/**
 *
 * @author alox1
 */
public class Troca extends Vehiculo{
    private int  capCargaKg;

    public Troca() {
        super();
        capCargaKg=0;
    }

    public Troca(int capCargaKg, int cilindros, String traccion, String transmision, int numVel, String color, String descripcion, String marca, String modelo, int pasajeros, double precio, String placas) {
        super(cilindros, traccion, transmision, numVel, color, descripcion, marca, modelo, pasajeros, precio, placas);
        this.capCargaKg = capCargaKg;
    }

    public int getCapCargaKg() {
        return capCargaKg;
    }

    public void setCapCargaKg(int capCargaKg) {
        this.capCargaKg = capCargaKg;
    }
    
     @Override
    public void muestraDatos() {
        JOptionPane.showMessageDialog(null,
                "Capacidad de carga en Kilogramos: "+capCargaKg+"\n"
                + "Cilindros: "+getCilindros()+"\n"
                + "Traccion: "+getTraccion()+"\n"
                + "Transmision: "+getTransmision()+"\n"
                + "numVel: "+getNumVel()+"\n"
                + "Color: "+getColor()+"\n"
                + "Descripcion: "+getDescripcion()+"\n"
                + "Marca: "+getMarca()+"\n"
                + "Modelo: "+getModelo()+"\n"
                + "Pasajeros: "+getPasajeros()+"\n"
                + "Placas: "+getPlacas()+"\n"+"\n");
    }
    
    @Override
    public void pedirDatos() {
        String txt;
        int x;
        x=Integer.parseInt(JOptionPane.showInputDialog("Capacidad de carga (KG)"));
        setCapCargaKg(x);
        x=Integer.parseInt(JOptionPane.showInputDialog("Numero de cilindros"));
        setCilindros(x);
        txt=JOptionPane.showInputDialog("Traccion del vehiculo");
        setTraccion(txt);
        txt=JOptionPane.showInputDialog("Transmision del vehiculo");
        setTransmision(txt);
        x=Integer.parseInt(JOptionPane.showInputDialog("Numero de velocidades"));
        setNumVel(x);
        txt=JOptionPane.showInputDialog("Color del vehiculo");
        setColor(txt);
        txt=JOptionPane.showInputDialog("Descripcion del vehiculo");
        setDescripcion(txt);
        txt=JOptionPane.showInputDialog("Marca del vehiculo");
        setMarca(txt);
        txt=JOptionPane.showInputDialog("Modelo del vehiculo");
        setModelo(txt);
        x=Integer.parseInt(JOptionPane.showInputDialog("Numero de pasajeros"));
        setPasajeros(x);
        txt=JOptionPane.showInputDialog("Ingrese las Placas del vehiculo");
        setPlacas(txt);
    }
    
}
