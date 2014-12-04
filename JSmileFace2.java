//Course: CIS 263AA
//Section Number: 33254
//Filename is JSmileFace2.java
//Written by Erica Peharda
//Written on December 15th, 2013
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.geom.*;
public class JSmileFace2 extends JFrame implements ActionListener
{
   JButton smileChange = new JButton("Click Me!");
   boolean buttonClicked = false;
   public JSmileFace2()
   {
      setTitle("Smile or Frown");
      setLayout(new FlowLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      add(smileChange);

      smileChange.addActionListener(this);
   }
   public void paint(Graphics gr)
   {
      super.paint(gr);
      Graphics2D gr2D = (Graphics2D)gr;
      gr2D.setColor(Color.YELLOW);
      Ellipse2D.Float ellipse = new 
         Ellipse2D.Float(40F, 80F, 150F, 150F);
      gr2D.fill(ellipse);
      
      gr2D.setColor(Color.BLACK);
      Ellipse2D.Float eye1 = new   
         Ellipse2D.Float(90F, 120F, 10F, 10F);
      gr2D.fill(eye1);

      Ellipse2D.Float eye2 = new 
         Ellipse2D.Float(130F, 120F, 10F, 10F);
      gr2D.fill(eye2); 
      
      Ellipse2D.Float smile = new
         Ellipse2D.Float(70F, 160F, 90F, 50F);
      gr2D.draw(smile);
      
      gr2D.setColor(Color.YELLOW);
      Rectangle2D.Float smileBlock = new
         Rectangle2D.Float(70F, 160F, 90F, 25F);
      gr2D.fill(smileBlock); 
      
      if(buttonClicked == true)
      {

               gr2D.setColor(Color.BLACK);
               Ellipse2D.Float smile2 = new
                  Ellipse2D.Float(70F, 160F, 90F, 50F);
               gr2D.draw(smile2);
               
               gr2D.setColor(Color.YELLOW);
               Rectangle2D.Float frownBlock = new
                  Rectangle2D.Float(70F, 185F, 90F, 30F);
               gr2D.fill(frownBlock);
      }    
   }
   
   public void actionPerformed(ActionEvent e)
   {
      buttonClicked = true;
      repaint();
   }
   
   public static void main(String[] args)
   {
      JSmileFace2 smile = new JSmileFace2();
      smile.setSize(250, 250);
      smile.setVisible(true);
   }
}