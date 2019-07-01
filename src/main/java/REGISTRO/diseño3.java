package REGISTRO;

import javax.swing.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import HOME.diseño;
import java.awt.Graphics;

public class diseño3 extends JPanel {
      public Image fondo1;
    
    public diseño3(){
         setLayout(null);
        
    }
    
    
    
    //El metodo paintComponent agrega el fondo de pantalla
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            fondo1 = ImageIO.read(new File("src\\IMG\\img1.png"));
        } catch (IOException e) {

            e.printStackTrace();
        }
        g.drawImage(fondo1, 0, 0, null);
    }
    
}
