/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import javax.swing.JOptionPane;

/**
 *
 * @author alox1
 */
public class Comprador extends Persona{

    public Comprador() {
    }

    public Comprador(String nombre, String apellido, String celular, String direccion) {
        super(nombre, apellido, celular, direccion);
    }
    
    @Override
    public void muestraDatos() {
        JOptionPane.showMessageDialog(null,
                "Nombre: "+getNombre()+"\n"
                + "Apellido: "+getApellido()+"\n"
                + "Celular: "+getCelular()+"\n"
                + "Direccion: "+getDireccion()+"\n");
    }

    @Override
    public void pedirDatos() {
        String txt;
        txt=JOptionPane.showInputDialog("Ingrese el Nombre de el comprador");
        setNombre(txt);
        txt=JOptionPane.showInputDialog("Ingrese el Apellido de el comprador");
        setApellido(txt);
        txt=JOptionPane.showInputDialog("Ingrese el Celular de el comprador");
        setCelular(txt);
        txt=JOptionPane.showInputDialog("Ingrese la Direccion de el comprador");
        setDireccion(txt);
    }
    
}