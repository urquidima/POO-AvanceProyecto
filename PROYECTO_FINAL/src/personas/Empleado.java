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
public class Empleado extends Persona {
    private String numEmpleado;

    public Empleado() {
    }

    public Empleado(String numEmpleado, String nombre, String apellido, String celular, String direccion) {
        super(nombre, apellido, celular, direccion);
        this.numEmpleado = numEmpleado;
    }

    public String getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    @Override
    public void muestraDatos() {
        JOptionPane.showMessageDialog(null,
                "Numero de empleado: "+numEmpleado+"\n"
                + "Nombre: "+getNombre()+"\n"
                + "Apellido: "+getApellido()+"\n"
                + "Celular: "+getCelular()+"\n"
                + "Direccion: "+getDireccion()+"\n");
    }
    
    public void pedirDatos() {
        String txt;
        txt=JOptionPane.showInputDialog("Ingrese el Nombre de el empleado");
        setNombre(txt);
        txt=JOptionPane.showInputDialog("Ingrese el Apellido de el empleado");
        setApellido(txt);
        txt=JOptionPane.showInputDialog("Ingrese el Celular de el empleado");
        setCelular(txt);
        txt=JOptionPane.showInputDialog("Ingrese la Direccion de el empleado");
        setDireccion(txt);
        txt=JOptionPane.showInputDialog("Ingrese el numero de el empleado");
        setNumEmpleado(txt);
    }
    
}
