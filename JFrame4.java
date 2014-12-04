import javax.swing.*;
import java.awt.*;
public class JFrame4
{
   public static void main(String[] args)
   {
      //sets frame width and height values
      final int FRAME_WIDTH = 250;
      final int FRAME_HEIGHT = 100;
      Font headlineFont = new Font("Arial", Font.BOLD, 30);
      
      //declares a jframe object- our 3rd one in practice
      JFrame aFrame = new JFrame("Fourth frame");
      
      //sets size of frame
      aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      
      //makes frame visible- remember this is a boolean object
      aFrame.setVisible(true);
      
      //this is a useful command otherwise the process isn't exited on close
      //unless you hit control + c
      aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //SETS the greeting in the jframe object
      JLabel greeting = new JLabel("Good day");
      //uses the greeting
      aFrame.add(greeting);
      greeting.setFont(headlineFont);
   }
}