
package escritura;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Escritura extends JFrame{
    private JMenuBar barramenu;
    private JMenuItem item1;
    private JPanel label1;
    private JButton boton;
    private Panel panel;
    private TextField texto;

    public static void main(String[] args) {
       
       Escritura escri = new Escritura();
       
    }
    
    public Escritura(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new Panel();
        this.setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        CrearVentana();
        
    }
    public void CrearVentana(){
                
        this.barramenu = new JMenuBar();
        this.label1 = new JPanel();
        this.boton = new JButton("GO");
        boton.setBackground(Color.white);
        texto = new TextField();
        texto.setPreferredSize(new Dimension(300,24));
        label1.setBackground(Color.gray);
        this.setSize(1366,760);
        label1.add(texto);
        label1.add(boton);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x = texto.getText();;
                String[] palabra =x.split("");
                
                if ("".equals(palabra[0])) 
                {
                        
                    JOptionPane.showMessageDialog(null,"NO HA INGRESADO NINGUNA PALABRA");
                } 
                else {

                    int i=0;
                    String aux;
                    while(i<palabra.length){
                        aux = palabra[i];
                        panel.getPalabra().add(aux);
                        i++;
                    }
                    actualizarpantalla();
                }
            }
        });
        add(label1);
        add(panel);
        
 
        this.setVisible(true);
    }
    public void actualizarpantalla(){ 
        Container temp = this.getContentPane();
        SwingUtilities.updateComponentTreeUI(temp);
        temp.validate();
        requestFocusInWindow();
    }
}
