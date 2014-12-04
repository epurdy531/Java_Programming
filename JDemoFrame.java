import javax.swing.*;
public class JDemoFrame
{
   public static void main(String[] args)
   {
      //declare a jframe with a title
      JFrame aFrame = new JFrame("This is a frame");
      //set its size
      final int WIDTH = 250;
      final int HEIGHT = 250;
      aFrame.setSize(WIDTH, HEIGHT);
      //make it visible
      aFrame.setVisible(true);
   }
}