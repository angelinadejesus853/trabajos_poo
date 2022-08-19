package class_practica;

import javax.swing.*;


public class class_Swing {

    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = JOptionPane.showInputDialog("Anota tu nombre:");
        String apellido = JOptionPane.showInputDialog("Anota tu apellido:");
        
        JOptionPane.showMessageDialog(null,"tu nombre y apellido es ["+( nombre + apellido )+"]:"); 
    }
    
}
