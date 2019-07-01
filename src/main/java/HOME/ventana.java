package HOME;

import javax.swing.*;
import java.awt.*;

public class ventana extends JFrame{
 public ventana() {
        setTitle("ARPA SOFTWARE");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        add(new diseño());
        setVisible(true);
		
	}   
}
