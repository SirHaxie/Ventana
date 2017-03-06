
package ventana;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Ventana {
 
    public static void main(String []args){
 
        JFrame ventanaM = new JFrame("Ventana Creada");   
        ventanaM.setSize(400, 400); 
        ventanaM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da click en la X
        ventanaM.setResizable(false);//para configurar si se redimensiona la ventan
        ventanaM.setVisible(true);//configurando visualización de la ventana        
        ventanaM.setLayout(new FlowLayout());
        
        JTextField text = new JTextField();
        text.setText(" Escribe aquí");
        text.setBounds(100, 100, 20, 100);
        ventanaM.add(text);
        JButton boton = new JButton();
        boton.setText("Pusheale");
        boton.setBounds(135, 150, 130, 50);
        ventanaM.add(boton);
    }   
}
