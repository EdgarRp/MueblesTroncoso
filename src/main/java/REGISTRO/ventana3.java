package REGISTRO;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

import HOME.diseño;

public class ventana3 extends JFrame {
    
    public ventana3(){
        setTitle("REGISTRO DE CLIENTES");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        add(new diseño3());
        setVisible(true);
    }
    
}
