package ABONO;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

import HOME.diseño;

public class ventana2 extends JFrame {
    
    public ventana2() {
        setTitle("ABONAR");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        add(new diseño2());
        setVisible(true);
    }
    
}
