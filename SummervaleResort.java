//Course: CIS 263AA
//Section Number: 33254
//Filename is SummervaleResort.java
//Written by Erica Peharda
//Written on December 8th, 2013

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class SummervaleResort extends JFrame implements ActionListener
{
   //these will all be on the main menu bar
   private JMenuBar mainBar = new JMenuBar();
   private JMenu file = new JMenu("File");
   private JMenu rooms = new JMenu("Rooms");
   private JMenu dining = new JMenu("Dining");
   private JMenu activities = new JMenu("Activities");
   
   //these options will all extend from the above options
   
   //under file
   private JMenuItem exit = new JMenuItem("Exit");
   //under rooms
   private JMenuItem suite = new JMenuItem("Suite");
   private JMenuItem single = new JMenuItem("Single");
   //under dining
   private JMenuItem mainHall = new JMenuItem("Main Hall");
   private JMenuItem privateEscape = new JMenuItem("Private Escape");
   private JMenuItem cafe = new JMenuItem("Cafe");
   //under activities
   private JMenuItem kayaking = new JMenuItem("Kayaking");
   private JMenuItem scubaDiving = new JMenuItem("Scuba Diving");
   private JMenuItem dinnerCruise = new JMenuItem("Dinner Cruise");
   //adding labels
   private JLabel title = new JLabel("Summervale Resort");
   private JLabel divider = new JLabel("----------------");
   private JLabel info = new JLabel("");
   
   private JPanel panel01 = new JPanel();
   private JPanel panel02 = new JPanel();
   private JPanel panel03 = new JPanel();
   
   public SummervaleResort()
   {
      setTitle("Summervale Resort");
      setLayout(new BorderLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      composeMenus();
      addActionListeners();  
      
      add(panel01, BorderLayout.NORTH);
      add(panel02, BorderLayout.CENTER);
      add(panel03, BorderLayout.SOUTH);
      
      panel01.add(title);
      title.setLayout(new FlowLayout());
      title.setFont(new Font("Arial", Font.BOLD, 32));            
      panel02.add(divider);
      divider.setLayout(new FlowLayout());      
      panel03.add(info);
      info.setLayout(new FlowLayout());
      info.setFont(new Font("Arial", Font.ITALIC, 16));        
   }
   
   public void composeMenus()
   {
      setJMenuBar(mainBar);
      mainBar.add(file);
      mainBar.add(rooms);
      mainBar.add(dining);
      mainBar.add(activities);  
      file.add(exit);
      rooms.add(suite);
      rooms.add(single);
      dining.add(mainHall);
      dining.add(privateEscape);
      dining.add(cafe);
      activities.add(kayaking);
      activities.add(scubaDiving);
      activities.add(dinnerCruise);
   }
   
   public void addActionListeners()
   {
      exit.addActionListener(this);
      suite.addActionListener(this);
      single.addActionListener(this);
      mainHall.addActionListener(this);
      privateEscape.addActionListener(this);
      cafe.addActionListener(this);
      kayaking.addActionListener(this);
      scubaDiving.addActionListener(this);
      dinnerCruise.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      Container con = getContentPane();
      if(source == exit)
         System.exit(0);
      else if(source == suite)
         info.setText("3 Bedroom Suites including a fully loaded kitchen @ $219/night");
      else if(source == single)
         info.setText("2 Bedroom Singles include King and Sofa Bed @ $169/night");
      else if(source == mainHall)
         info.setText("Our main hall dining features breakfast, lunch and dinner available 24 hours");
      else if(source == privateEscape)
         info.setText("Our private escape is an elegant italian restaurant serving only dinner by reservation");
      else if(source == cafe)
         info.setText("Our cafe is open for breakfast and lunch and serves coffee, bagels, and sandwiches");
      else if(source == kayaking)
         info.setText("Enjoy a 3 hour kayaking tour for $120/person");
      else if(source == scubaDiving)
         info.setText("Cerified Scuba instructors train and take you on an adventure under seas for $350");
      else if(source == dinnerCruise)
         info.setText("Enjoy a 4-hr dinner cruise with tropical bar at a low rate of $80/person");
   }
   
   public static void main(String[] args)
   {
      SummervaleResort svr = new SummervaleResort();
      final int WIDTH = 700;
      final int HEIGHT = 150;
      svr.setSize(WIDTH, HEIGHT);
      svr.setVisible(true);
   }   
}