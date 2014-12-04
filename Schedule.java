//Filename is Schedule.java
//Written by Erica Peharda
//Written on September 29th, 2013

import javax.swing.*;
public class Schedule
{
   public static void main(String[] args)
   {
      String[][] classSchedule = { {"MTH 300", "W T F",  "9-10:30am"},
                                   {"PSY 300", "Tu Th",   "8-9:30am"},
                                   {"ENG 101", "Tu Th", "11-12:30am"},
                                   {"SCI 200", "W T F",   "4-5:30pm"} };
      
      String course;
      String day;
      String time;
      
      course = JOptionPane.showInputDialog(null,
         "Please enter one of the following courses: "
         + "\nMTH 300, PSY 300, ENG 101, or SCI 200");
         

      if(course.equals("MTH 300"))
         JOptionPane.showMessageDialog(null,
            "Course meets: " + classSchedule[0][1] + " " + classSchedule[0][2] + ".");
      else if (course.equals("PSY 300"))
         JOptionPane.showMessageDialog(null,
            "Course meets: " + classSchedule[1][1] + " " + classSchedule[1][2] + ".");
      else if (course.equals("ENG 101"))
         JOptionPane.showMessageDialog(null,
            "Course meets: " + classSchedule[2][1] + " " + classSchedule[2][2] + ".");
      else if (course.equals("SCI 200"))
         JOptionPane.showMessageDialog(null,
            "Course meets: " + classSchedule[3][1] + " " + classSchedule[3][2] + ".");             
      else
            JOptionPane.showMessageDialog(null,
               "I'm sorry, you entered an invalid course.");
   }
}