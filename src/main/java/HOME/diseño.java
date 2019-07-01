package HOME;

import ABONO.diseño2;
import ABONO.ventana2;
import REGISTRO.diseño3;
import REGISTRO.ventana3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class diseño extends JPanel {

    public Image fondo;
    public JLabel texto1, texto2;
    public JButton registrar;
    public JButton abonar;
    public JPanel lista1, lista2;

    public diseño() {

        setLayout(null); //asigno un layout null para poder colorar los componentes en mi ventana

        //En este bloque instancio los componentes
        texto1 = new JLabel("PRODUCTOS VENDIDOS");
        texto2 = new JLabel("¿QUIÉNES SOMOS?");
        registrar = new JButton("REGISTRAR");
        abonar = new JButton("ABONAR");
        JPanel lista1 = new JPanel();
        JPanel lista2= new JPanel();

        //agregamos tamaño,posicion y color a los componentes
        //texto PRODUCTOS VENDIDOS//
        texto1.setBounds(1100, 20, 300, 40);
        texto1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        texto1.setForeground(Color.WHITE);

        //LISTA DE PRODUCTOS VENDIDOS//
        lista1.setBounds(990, 65, 500, 600);
        lista1.setBackground(Color.BLACK);

        //BOTON REGISTRAR//
        registrar.setBounds(850, 695, 200, 50);
        registrar.setFont(new Font("Times New Roman", Font.BOLD, 15));
        registrar.setForeground(Color.BLACK);

        //BOTON ABONAR//
        abonar.setBounds(450, 695, 200, 50);
        abonar.setFont(new Font("Times New Roman", Font.BOLD, 15));
        abonar.setForeground(Color.BLACK);
        
        //texto ¿QUÉ ES ARPA SOFTWARE?
        texto2.setBounds(175, 20, 450, 40);
        texto2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        texto2.setForeground(Color.WHITE);

        //LISTA ¿QUIENES SOMOS?
        lista2.setBounds(45, 65, 500, 600);
        lista2.setBackground(Color.BLACK);

        //AGREGAMOS A LA VENTANA
        add(texto1);
        add(lista1);
        add(texto2);
        add(lista2);
        add(registrar);
        add(abonar);
        
        
        
        registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ventana3 v3 = new ventana3(); 
            }
        });
        
        abonar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ventana2 v2 = new ventana2(); 
            }
        });
        


    }

    //El metodo paintComponent agrega el fondo de pantalla
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            fondo = ImageIO.read(new File("src\\IMG\\img.png"));
        } catch (IOException e) {

            e.printStackTrace();
        }
        g.drawImage(fondo, 0, 0, null);
    }
}
