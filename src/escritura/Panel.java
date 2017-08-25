
package escritura;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import javafx.scene.paint.Color;
import javax.swing.JPanel;


public class Panel extends JPanel{
    
    public Panel(){
        this.setPreferredSize(new Dimension(800,625));
        this.setBackground(java.awt.Color.white);
    }
    
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        
        QuadCurve2D quadcurve = new QuadCurve2D.Float(50,700,200,1000,700,50);//A
        QuadCurve2D quadcurve2 = new QuadCurve2D.Float(700,50,750,200,1366,800);//A
        QuadCurve2D quadcurve3 = new QuadCurve2D.Float(350,350,500,270,1000,350);//A
        QuadCurve2D quadcurve4 = new QuadCurve2D.Float(0,350,360,270,60,40);//D
        QuadCurve2D quadcurve5 = new QuadCurve2D.Float(40,350,160,250,60,40);//D
        QuadCurve2D quadcurve6 = new QuadCurve2D.Float(500,200,380,240,500,50);//a
        QuadCurve2D quadcurve7 = new QuadCurve2D.Float(500,200,150,230,500,50);//a
        QuadCurve2D quadcurve8 = new QuadCurve2D.Float(1150,250,850,240,1150,80);//C
                                                 //    x  y   c   c  xf yf 
                
        g2.draw(quadcurve);
        g2.draw(quadcurve2);
        g2.draw(quadcurve3);
        g2.draw(quadcurve4);
        g2.draw(quadcurve5);
        g2.draw(quadcurve6);
        g2.draw(quadcurve7);
        g2.draw(quadcurve8);
        
    }
}
