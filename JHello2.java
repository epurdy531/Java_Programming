import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JHello2 extends JApplet implements ActionListener
{
   JLabel greeting = new JLabel("Hello. Who are you?");
   Font font1 = new Font("Teen", Font.BOLD, 36);
   Font font2 = new Font("Teen", Font.ITALIC, 48);
   JTextField answer = new JTextField(10);
   JButton pressMe = new JButton("Press Me");
   JLabel personalGreeting = new JLabel(" ");
   Container con = getContentPane();
   public void init()
   {
      greeting.setFont(font1);
      personalGreeting.setFont(font2);
      con.add(greeting);
      con.add(answer);
      con.add(pressMe);
      con.setLayout(new FlowLayout());
      con.setBackground(Color.YELLOW);
      pressMe.addActionListener(this);
      answer.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {
      String name = answer.getText();
      con.remove(greeting);
      con.remove(pressMe);
      con.remove(answer);
      personalGreeting.setText("Hello, " + name + "!  ");
      con.add(personalGreeting);
      con.setBackground(Color.MAGENTA);
      validate();
   }
}