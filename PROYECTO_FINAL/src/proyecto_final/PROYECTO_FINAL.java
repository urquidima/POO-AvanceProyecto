/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_final;
import javax.swing.*;
import personas.*;
import vehiculos.*;
/**
 *
 * @author alox1
 */
public class PROYECTO_FINAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int tamArr=1000;
        Vendedor[] vendedor=new Vendedor[tamArr];
        Comprador[] comprador=new Comprador[tamArr];
        Empleado[] empleado=new Empleado[tamArr];
        Carro[] carro=new Carro[tamArr];
        Moto[] moto=new Moto[tamArr];
        Troca[] troca=new Troca[tamArr];
        int op=0;
        String txt="";
        int j=0;
        int pref=0;
        String selecc="";
        
        do{
            comprador[j]=new Comprador();
            vendedor[j]=new Vendedor();
            carro[j]=new Carro();   
            troca[j]=new Troca();
            moto[j]=new Moto();
            empleado[j]=new Empleado();
            
            op=Integer.parseInt(JOptionPane.showInputDialog("""
                                           Ingrese el numero con la accion deseada
                                           1: Vender vehiculo
                                           2: Registrar Vehiculo
                                           3: Añadir un empleado
                                           4: Ver lista de autos
                                           5: Salir"""));
            switch(op){
                case 1:
                    comprador[j].pedirDatos();
                    
                    pref=Integer.parseInt(JOptionPane.showInputDialog("""
                                                Seleccione el tipo de vehiculo que busca
                                                1: Carro
                                                2: Moto
                                                3: Troca
                                                """));
                    switch(pref){
                        case 1:
                            for (int i = 0; i <= j; i++) {
                                carro[i].muestraDatos();
                            }
                            break;
                        case 2:
                            for (int i = 0; i <= j; i++) {
                                moto[i].muestraDatos();
                            }
                            break;
                        case 3:
                            for (int i = 0; i <= j; i++) {
                                troca[i].muestraDatos();
                            }
                            break;
                    }
                    
                    selecc=JOptionPane.showInputDialog("Ingrese las placas del carro que quiere comprar, si no quiere comprar, ingrese cualquier otra cosa");
                    
                    switch(pref){
                        case 1:
                            carro[j]=null;
                            break;
                        case 2:
                            moto[j]=null;
                            break;
                        case 3:
                            troca[j]=null;
                            break;
                    }
                    JOptionPane.showMessageDialog(null,"FELICIDADES POR SU COMPRA");
                    break;
                    
                case 2:
                    pref=Integer.parseInt(JOptionPane.showInputDialog("""
                                                Seleccione el tipo de vehiculo que se registrara
                                                1: Carro
                                                2: Moto
                                                3: Troca
                                                """));
                    
                    switch(pref){
                        case 1:                                                     
                            carro[j].pedirDatos();
                            vendedor[j].pedirDatos();
                            break;
                        case 2:
                            moto[j].pedirDatos();
                            vendedor[j].pedirDatos();
                            break;
                        case 3:
                            troca[j].pedirDatos();
                            vendedor[j].pedirDatos();
                            break;
                    }
                    j++;
                    break;
                    
                case 3:
                    empleado[j].pedirDatos();
                    break;
                    
                case 4:
                    for (int i = 0; i <= j; i++) {    
                        carro[i].muestraDatos();
                        moto[i].muestraDatos();
                        troca[i].muestraDatos();
                    }
            }
            
        }while(op!=5);
    }
    
}