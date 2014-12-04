//Course: CIS 263AA
//Section Number: 33254
//Filename is JLottery2.java
//Written by Erica Peharda
//MEID: ERI2203192
//Written on December 18th, 2013


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JLottery2 extends JFrame implements ItemListener, ActionListener
{
   int userPick1, userPick2, userPick3, userPick4, userPick5, userPick6;
   int matchCount = 0;
   int pickedNumbers;
   int y = 1;  
   //below is where I'm generating three random integers from 0 to 30
   int compPick1 = (int)(Math.random()*31);
   int compPick2 = (int)(Math.random()*31);
   int compPick3 = (int)(Math.random()*31);
   int compPick4 = (int)(Math.random()*31);
   int compPick5 = (int)(Math.random()*31);
   int compPick6 = (int)(Math.random()*31);
   //JLabels for the directions and results
   JLabel label = new JLabel("Please choose six numbers!");
   JLabel results1 = new JLabel();
   JLabel results2 = new JLabel();
   JLabel results3 = new JLabel();
   FlowLayout flow = new FlowLayout(); 
   //below are the items for the menubar
   private JMenuBar mainBar = new JMenuBar();
   private JMenu menu = new JMenu("File");
   private JMenuItem about = new JMenuItem("About");
   //below is the array of check boxes from 0 to 30- it's nice b/c their position
   //matches the number!  
   JCheckBox[] numbersBox = {new JCheckBox("0"), new JCheckBox("1"), new JCheckBox("2"), 
      new JCheckBox("3"), new JCheckBox("4"), new JCheckBox("5"), new JCheckBox("6"), 
      new JCheckBox("7"), new JCheckBox("8"), new JCheckBox("9"), new JCheckBox("10"), 
      new JCheckBox("11"), new JCheckBox("12"), new JCheckBox("13"), new JCheckBox("14"), 
      new JCheckBox("15"), new JCheckBox("16"), new JCheckBox("17"), new JCheckBox("18"), 
      new JCheckBox("19"), new JCheckBox("20"), new JCheckBox("21"), new JCheckBox("22"), 
      new JCheckBox("23"), new JCheckBox("24"), new JCheckBox("25"), new JCheckBox("26"), 
      new JCheckBox("27"), new JCheckBox("28"), new JCheckBox("29"), new JCheckBox("30")};
      


   
   public JLottery2()
   {
      super("Lottery!");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      setJMenuBar(mainBar);
      mainBar.add(menu);
      menu.add(about);
      about.addActionListener(this);
      label.setFont(new Font("Arial", Font.ITALIC, 18));
      add(label);
      for(int x = 0; x < 31;++ x)
      {
         add(numbersBox[x]);
         numbersBox[x].addItemListener(this);
      }     
   }
   
   public void itemStateChanged(ItemEvent check)
   {
      for(int x = 0; x < 31; ++x)
      {
         //in each piece below, I first assigned the button pressed to the user's number choice
         //then I added one to the number of attempts (which I represent with y)
         //then I matched it with the correct values to see if the user is correct
         if(numbersBox[x] == check.getSource() && y == 1)
         {
            userPick1 = x;
            ++y;
               if(x == compPick1)
                  ++matchCount;
               if(x == compPick2)
                  ++matchCount;
               if(x == compPick3)
                  ++matchCount;
               if(x == compPick4)
                  ++matchCount;
               if(x == compPick5)
                  ++matchCount;
               if(x == compPick6)
                  ++matchCount;
         }
         else if(numbersBox[x] == check.getSource() && y == 2)
         {
            userPick2 = x;
            ++y;
               if(x == compPick1)
                  ++matchCount;
               if(x == compPick2)
                  ++matchCount;
               if(x == compPick3)
                  ++matchCount;
               if(x == compPick4)
                  ++matchCount;
               if(x == compPick5)
                  ++matchCount;
               if(x == compPick6)
                  ++matchCount;
            
         }
         else if(numbersBox[x] == check.getSource() && y == 3)
         {
            userPick3 = x;
            ++y;
               if(x == compPick1)
                  ++matchCount;
               if(x == compPick2)
                  ++matchCount;
               if(x == compPick3)
                  ++matchCount;
               if(x == compPick4)
                  ++matchCount;
               if(x == compPick5)
                  ++matchCount;
               if(x == compPick6)
                  ++matchCount;
         }
         else if(numbersBox[x] == check.getSource() && y == 4)
         {
            userPick4 = x;
            ++y;
               if(x == compPick1)
                  ++matchCount;
               if(x == compPick2)
                  ++matchCount;
               if(x == compPick3)
                  ++matchCount;
               if(x == compPick4)
                  ++matchCount;
               if(x == compPick5)
                  ++matchCount;
               if(x == compPick6)
                  ++matchCount;
         }
         else if(numbersBox[x] == check.getSource() && y == 5)
         {
            userPick5 = x;
            ++y;
               if(x == compPick1)
                  ++matchCount;
               if(x == compPick2)
                  ++matchCount;
               if(x == compPick3)
                  ++matchCount;
               if(x == compPick4)
                  ++matchCount;
               if(x == compPick5)
                  ++matchCount;
               if(x == compPick6)
                  ++matchCount;
         }
         else if(numbersBox[x] == check.getSource() && y == 6)
         {
            userPick6 = x;
               if(x == compPick1)
                  ++matchCount;
               if(x == compPick2)
                  ++matchCount;
               if(x == compPick3)
                  ++matchCount;
               if(x == compPick4)
                  ++matchCount;
               if(x == compPick5)
                  ++matchCount;
               if(x == compPick6)
                  ++matchCount;
         }         
      }
      
      if(y == 6)
      {
          //below is a display of results
            results1.setText("Computer Picked: " + compPick1 + ", " + compPick2 + ", " + compPick3 + ", "
               + compPick4 + ", " + compPick5 + ", " + compPick6 + ".");
            add(results1);
            
            results2.setText("You Picked: " + userPick1 + ", " + userPick2 + ", " + userPick3 + ", "
               + userPick4 + ", " + userPick5 + ", " + userPick6 + ".");
            add(results2);
         //below is the output which is dependent on how many matches there are!
         if(matchCount == 0 || matchCount == 1 || matchCount == 2)
            results3.setText("You win $0.");
         else if(matchCount == 3)
            results3.setText("You win $100!");
         else if(matchCount == 4)
            results3.setText("You win $10,000!");
         else if(matchCount == 5)
            results3.setText("You win $50,000!");
         else if(matchCount == 6)
            results3.setText("You win $1,000,000!");
         
         add(results3);           
      }      
   }   
   //below is the action taken when about is selected from the menu!
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if(source == about)
         JOptionPane.showMessageDialog(null, "Author: Erica Peharda" + "\nCourse: CIS 263AA" +
            "\nSection Number: 33254" + "\nMEID: ERI2203192");
   }
   public static void main(String[] args)
   {
      final int WIDTH = 550;
      final int HEIGHT = 250;
      JLottery2 lottery = new JLottery2();
      lottery.setSize(WIDTH, HEIGHT);
      lottery.setVisible(true);
   }
}