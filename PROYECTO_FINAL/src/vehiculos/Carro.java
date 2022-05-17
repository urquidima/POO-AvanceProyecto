/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;
import javax.swing.*;
/**
 *
 * @author alox1
 */
public class Carro extends Vehiculo{
    private String estereo;
    private String ventilacion;

    public Carro() {
        super();
        estereo="";
        ventilacion="";
    }

    public Carro(String estereo, String ventilacion, int cilindros, String traccion, String transmision, int numVel, String color, String descripcion, String marca, String modelo, int pasajeros, double precio, String placas) {
        super(cilindros, traccion, transmision, numVel, color, descripcion, marca, modelo, pasajeros, precio, placas);
        this.estereo = estereo;
        this.ventilacion = ventilacion;
    }    

    public String getEstereo() {
        return estereo;
    }

    public void setEstereo(String estereo) {
        this.estereo = estereo;
    }

    public String getVentilacion() {
        return ventilacion;
    }

    public void setVentilacion(String ventilacion) {
        this.ventilacion = ventilacion;
    }

    @Override
    public void muestraDatos() {
        JOptionPane.showMessageDialog(null,
                "Estereo: "+estereo+"\n"
                + "Ventilacion: "+ventilacion+"\n"
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
        txt=JOptionPane.showInputDialog("Descripcion estereo");
        setEstereo(txt);
        txt=JOptionPane.showInputDialog("Descripcion ventilacion");
        setVentilacion(txt);
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
        txt=JOptionPane.showInputDialog("Ingrese la Direccion de el comprador");
        setModelo(txt);
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Celular de el comprador"));
        setPasajeros(x);
        txt=JOptionPane.showInputDialog("Ingrese las Placas del vehiculo");
        setPlacas(txt);
    }
    
}
