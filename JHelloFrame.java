import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//I think JFrame is built into the system...
public class JHelloFrame extends JFrame implements ActionListener
{
   //wording inside the box- the label is inside your  frame
   JLabel question = new JLabel("What is your name?");
   //creating a font declaration
   Font bigFont = new Font("Arial", Font.BOLD, 16);
   //creating a text field for the user to imput 10 characters
   JTextField answer = new JTextField(10);
   //creating a button for user to click
   JButton pressMe = new JButton("Press me");
   JLabel greeting = new JLabel("");
   final int WIDTH = 175;
   final int HEIGHT = 225;
   
   public JHelloFrame()
   {
      //declares title of this frame 
      super("Hello Frame");
      //sets all of the specifications
      setSize(WIDTH, HEIGHT);
      setLayout(new FlowLayout());
      question.setFont(bigFont);
      greeting.setFont(bigFont);
      //adds them to this class
      add(question);
      add(answer);
      add(pressMe);
      add(greeting);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pressMe.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      String name = answer.getText();
      String greet = "Hello, " + name;
      greeting.setText(greet);
   }
}