/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;
import javax.swing.*;
/**
 *
 * @author Notebook
 */
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input int
        // guardamos el numero ingresado en la variable numero
        // int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        // lo mostramos por consola
        //System.out.println(numero);
        
        // input String
        String nombre;
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        JOptionPane.showMessageDialog(null,"El nombre ingreado" + nombre);
       
    }
    
}
