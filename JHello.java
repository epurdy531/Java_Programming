import javax.swing.*;
import java.awt.*;
public class JHello extends JApplet
{
   JLabel greeting = new JLabel("Hello.  Who are you?");
   public void init()
   {
      add(greeting);
   }
}