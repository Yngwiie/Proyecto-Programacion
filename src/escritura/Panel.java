
package escritura;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import javafx.scene.paint.Color;
import javax.swing.JPanel;


public class Panel extends JPanel{
    
    public ArrayList <String> palabra;
    private int i; 
    private int X;
    
    public Panel(){
        this.setPreferredSize(new Dimension(800,625));
        this.setBackground(java.awt.Color.white);
        palabra = new ArrayList<String>();
        this.X = 0;
        i=0;

    }
    
    @Override
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        BasicStroke stroke = new BasicStroke(4.0f); 
        g2.setStroke(stroke);

/*
        QuadCurve2D curva_a1 = new QuadCurve2D.Float(470,170,495,170,490,155);//a
        QuadCurve2D curva_a2 = new QuadCurve2D.Float(540,130,527,190,550,160);//a
        CubicCurve2D curva_a3 = new CubicCurve2D.Float(535,160,470,200,480,120,540,130);//a
        
        QuadCurve2D curva_o1 = new QuadCurve2D.Float(550,160,555,130,555,145);//o
        CubicCurve2D curva_o2 = new CubicCurve2D.Float(555,145,550,120,590,120,590,150);
        CubicCurve2D curva_o3 = new CubicCurve2D.Float(555,145,550,180,580,180,590,150);
        QuadCurve2D curva_o4 = new QuadCurve2D.Float(590,145,600,170,610,170);//o
        QuadCurve2D curva_o5 = new QuadCurve2D.Float(560,135,575,145,600,135);//o
        
        QuadCurve2D curva_x1 = new QuadCurve2D.Float(610,170,625,150,650,130);//x
        QuadCurve2D curva_x2 = new QuadCurve2D.Float(610,130,630,170,650,170);//x
        
        CubicCurve2D curva_m1 = new CubicCurve2D.Float(650,170,655,170,665,130,670,130);
        QuadCurve2D curva_m2 = new QuadCurve2D.Float(670,130,680,150,685,170);//m
        QuadCurve2D curva_m3 = new QuadCurve2D.Float(685,170,680,150,695,130);//m
        QuadCurve2D curva_m4 = new QuadCurve2D.Float(695,130,700,130,710,170);//m
        QuadCurve2D curva_m5 = new QuadCurve2D.Float(710,170,710,150,725,130);//m
        QuadCurve2D curva_m6 = new QuadCurve2D.Float(725,130,730,130,740,170);//m
        
        QuadCurve2D curva_w1 = new QuadCurve2D.Float(740,170,750,180,750,130);//w
        QuadCurve2D curva_w2 = new QuadCurve2D.Float(750,130,760,210,770,130);//w
        QuadCurve2D curva_w3 = new QuadCurve2D.Float(770,130,780,210,790,130);//w
        QuadCurve2D curva_w4 = new QuadCurve2D.Float(790,130,795,190,810,160);//w
        
        
        
        QuadCurve2D curva_p1 = new QuadCurve2D.Float(810,160,815,155,820,130);//p
        QuadCurve2D curva_p2 = new QuadCurve2D.Float(820,130,820,150,820,210);//p
    //    QuadCurve2D curva_p3 = new QuadCurve2D.Float(820,130,870,150,820,170);//p
        CubicCurve2D curva_p3 = new CubicCurve2D.Float(820,140,830,110,855,160,820,170);//p 
        QuadCurve2D curva_p4 = new QuadCurve2D.Float(820,170,840,175,855,170);//p
        
        QuadCurve2D curva_h1 = new QuadCurve2D.Float(855,170,870,150,870,120);//h
        QuadCurve2D curva_h2 = new QuadCurve2D.Float(870,120,850,130,860,170);//h
        QuadCurve2D curva_h3 = new QuadCurve2D.Float(860,170,870,125,880,170);//h
        QuadCurve2D curva_h4 = new QuadCurve2D.Float(880,170,885,175,890,170);//h
        
        QuadCurve2D curva_k1 = new QuadCurve2D.Float(890,170,890,170,890,120);//k
        CubicCurve2D curva_k2 = new CubicCurve2D.Float(890,120,900,125,900,140,885,150);//k
        QuadCurve2D curva_k3 = new QuadCurve2D.Float(890,155,890,160,910,140);//k
        CubicCurve2D curva_k4 = new CubicCurve2D.Float(890,155,900,155,905,180,915,170);//k
        
        QuadCurve2D curva_f1 = new QuadCurve2D.Float(915,170,920,170,920,120);//f
        CubicCurve2D curva_f2 = new CubicCurve2D.Float(920,120,933,125,933,140,915,160);//f
        CubicCurve2D curva_f3 = new CubicCurve2D.Float(920,160,940,220,910,220,920,160);//f
        QuadCurve2D curva_f4 = new QuadCurve2D.Float(920,170,925,175,930,165);//f
        
        
        QuadCurve2D curva_A1 = new QuadCurve2D.Float(470,400,495,400,490,370);//a
        QuadCurve2D curva_A2 = new QuadCurve2D.Float(540,330,527,418,550,400);//a
        CubicCurve2D curva_A3 = new CubicCurve2D.Float(538,400,470,400,480,330,540,330);
        
        QuadCurve2D curva_O1 = new QuadCurve2D.Float(550,400,555,370,555,385);//o
        CubicCurve2D curva_O2 = new CubicCurve2D.Float(555,360,550,420,595,420,590,350);
        QuadCurve2D curva_O3 = new QuadCurve2D.Float(590,385,600,410,610,400);//o
        CubicCurve2D curva_O4 = new CubicCurve2D.Float(565,370,550,310,575,310,590,350);
        
        QuadCurve2D curva_X1 = new QuadCurve2D.Float(610,400,625,370,650,330);//x
        QuadCurve2D curva_X2 = new QuadCurve2D.Float(610,330,630,400,650,400);//x
        
        CubicCurve2D curva_M1 = new CubicCurve2D.Float(650,400,680,400,680,400,680,400);
        CubicCurve2D curva_M2 = new CubicCurve2D.Float(660,330,680,315,680,330,680,400);
        QuadCurve2D curva_M3 = new QuadCurve2D.Float(680,400,680,330,695,330);//m
        QuadCurve2D curva_M4 = new QuadCurve2D.Float(695,330,700,330,710,400);//m
        QuadCurve2D curva_M5 = new QuadCurve2D.Float(710,400,710,330,725,330);//m
        QuadCurve2D curva_M6 = new QuadCurve2D.Float(725,330,730,330,740,400);//m
        
        QuadCurve2D curva_v1 = new QuadCurve2D.Float(930,165,940,180,945,130);//v
        CubicCurve2D curva_v2 = new CubicCurve2D.Float(945,130,950,180,960,180,965,130);//v
        CubicCurve2D curva_v3 = new CubicCurve2D.Float(965,130,950,130,950,140,980,130);//v
        QuadCurve2D curva_v4 = new QuadCurve2D.Float(960,160,975,175,980,165);//v
        
        */
 
        if(palabra.size()>0){
            while(i<palabra.size()){
                String letra = palabra.get(i);
                switch(letra){
                case "a":
                    QuadCurve2D curva_a1 = new QuadCurve2D.Float(0+X,60,15+X,70,20+X,60);//a
                    QuadCurve2D curva_a2 = new QuadCurve2D.Float(60+X,20,45+X,80,70+X,60);//a
                    CubicCurve2D curva_a3 = new CubicCurve2D.Float(55+X,60,0+X,85,10+X,5,60+X,20);//a
                    X+=70;// aqui aumenta la X dependiendo de donde termina cada letra
                    g2.draw(curva_a1);
                    g2.draw(curva_a2);
                    g2.draw(curva_a3);
                    break;
                case "o":

                    QuadCurve2D curva_o1 = new QuadCurve2D.Float(0+X,60,0+X,60,10+X,45);//o
                    CubicCurve2D curva_o2 = new CubicCurve2D.Float(10+X,45,10+X,10,45+X,10,50+X,40);
                    CubicCurve2D curva_o3 = new CubicCurve2D.Float(10+X,45,10+X,70,45+X,70,50+X,40);
                    CubicCurve2D curva_o4 = new CubicCurve2D.Float(15+X,30,25+X,45,60+X,20,65+X,60);
                    X+=65;// aqui aumenta la X dependiendo de donde termina cada letra
                    g2.draw(curva_o1);
                    g2.draw(curva_o2);
                    g2.draw(curva_o3);
                    g2.draw(curva_o4);
                    break;
                case "x":
                    QuadCurve2D curva_x1 = new QuadCurve2D.Float(15+X,60,30+X,60,50+X,20);//x
                    CubicCurve2D curva_x3 = new CubicCurve2D.Float(0+X,60,5+X,-15,50+X,50,60+X,60);
                    X+=60;
                    g2.draw(curva_x1);
                    g2.draw(curva_x3);
                    break;
                case "f":

                    QuadCurve2D curva_f1 = new QuadCurve2D.Float(10+X,60,10+X,60,10+X,5);//f
                    CubicCurve2D curva_f2 = new CubicCurve2D.Float(10+X,5,27+X,25,13+X,30,0+X,60);//f
                    CubicCurve2D curva_f3 = new CubicCurve2D.Float(10+X,50,40+X,120,0+X,120,10+X,50);//f
                    QuadCurve2D curva_f4 = new QuadCurve2D.Float(10+X,60,15+X,65,30+X,60);//f
                    X+=30;
                    g2.draw(curva_f1);
                    g2.draw(curva_f2);
                    g2.draw(curva_f3);
                    g2.draw(curva_f4);         
                    break;
                case "k":
                    QuadCurve2D curva_k1 = new QuadCurve2D.Float(5+X,60,5+X,60,5+X,10);//k
                    CubicCurve2D curva_k2 = new CubicCurve2D.Float(5+X,10,15+X,15,15+X,30,0+X,40);//k
                    QuadCurve2D curva_k3 = new QuadCurve2D.Float(5+X,45,5+X,50,25+X,30);//k
                    CubicCurve2D curva_k4 = new CubicCurve2D.Float(5+X,45,15+X,45,20+X,70,30+X,60);//k
                    X+=30;
                    g2.draw(curva_k1);
                    g2.draw(curva_k2);
                    g2.draw(curva_k3);
                    g2.draw(curva_k4);
                    break;
                case "h":
                    QuadCurve2D curva_h1 = new QuadCurve2D.Float(5+X,60,20+X,40,20+X,10);//h
                    QuadCurve2D curva_h2 = new QuadCurve2D.Float(20+X,10,0+X,20,10+X,60);//h 850
                    QuadCurve2D curva_h3 = new QuadCurve2D.Float(10+X,60,20+X,15,30+X,60);//h
                    QuadCurve2D curva_h4 = new QuadCurve2D.Float(30+X,60,35+X,65,40+X,60);//h
                    X+=40;
                    g2.draw(curva_h1);
                    g2.draw(curva_h2);
                    g2.draw(curva_h3);
                    g2.draw(curva_h4);
                    break;
                case " ":
                     X+=60;
                    break;
                case "m":
                    CubicCurve2D curva_m1 = new CubicCurve2D.Float(0+X,60,5+X,20,15+X,20,20+X,20);//650
                    QuadCurve2D curva_m2 = new QuadCurve2D.Float(20+X,20,30+X,20,35+X,60);//m
                    QuadCurve2D curva_m3 = new QuadCurve2D.Float(35+X,60,30+X,20,45+X,20);//m
                    QuadCurve2D curva_m4 = new QuadCurve2D.Float(45+X,20,60+X,25,60+X,60);//m
                    QuadCurve2D curva_m5 = new QuadCurve2D.Float(60+X,60,60+X,20,75+X,20);//m
                    QuadCurve2D curva_m6 = new QuadCurve2D.Float(75+X,20,85+X,20,90+X,60);//m
                    X+=90;
                    g2.draw(curva_m1);
                    g2.draw(curva_m2);
                    g2.draw(curva_m3);
                    g2.draw(curva_m4);
                    g2.draw(curva_m5);
                    g2.draw(curva_m6);
                    
                    break;
                case "w":
                    QuadCurve2D curva_w1 = new QuadCurve2D.Float(0+X,60,10+X,80,10+X,20);//w 740
                    QuadCurve2D curva_w2 = new QuadCurve2D.Float(10+X,30,20+X,105,30+X,20);//w
                    QuadCurve2D curva_w3 = new QuadCurve2D.Float(30+X,30,40+X,105,50+X,20);//w
                    CubicCurve2D curva_w4 = new CubicCurve2D.Float(50+X,20,60+X,30,60+X,10,65+X,30);//650
                    QuadCurve2D curva_w5 = new QuadCurve2D.Float(65+X,30,67+X,45,70+X,60);//v
                    X+=70;
                    g2.draw(curva_w1);
                    g2.draw(curva_w2);
                    g2.draw(curva_w3);
                    g2.draw(curva_w4);
                    g2.draw(curva_w5);
                  
                }
                
                i++;
            }
            this.X=0;
        }
    }    

    public ArrayList<String> getPalabra() {
        return palabra;
    }
    
    
}
