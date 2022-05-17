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
public class Vendedor extends Persona {

    public Vendedor() {
    }

    public Vendedor(String nombre, String apellido, String celular, String direccion) {
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
        txt=JOptionPane.showInputDialog("Ingrese el Nombre de el vendedor");
        setNombre(txt);
        txt=JOptionPane.showInputDialog("Ingrese el Apellido de el vendedor");
        setApellido(txt);
        txt=JOptionPane.showInputDialog("Ingrese el Celular de el vendedor");
        setCelular(txt);
        txt=JOptionPane.showInputDialog("Ingrese la Direccion de el vendedor");
        setDireccion(txt);
    }
    
}
