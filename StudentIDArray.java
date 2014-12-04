//Filename StudentIDArray.java
//Written by Erica Peharda
//Written on September 17th, 2013

import javax.swing.*;
public class StudentIDArray
{
   public static void main(String[] args)
   {
      String studentFirstName = "";
      String stringId = "";
      int studentIdInput;
      double studentGpa = 0.0; 
      boolean validId = false;

      int[] studentId = {        1111,    2222,   3333,       4444};
      String[] firstName = {"Matthew", "Erica", "Nora", "Nicholas"};
      double[] gpa =       {     4.24,    4.13,   3.82,       3.63};
          
      stringId = JOptionPane.showInputDialog(null, 
         "Please enter a four digit student ID number");
      studentIdInput = Integer.parseInt(stringId);


      while( studentIdInput != studentId[0] && studentIdInput != studentId[1] && 
            studentIdInput != studentId[2] && studentIdInput != studentId[3])
      {
            JOptionPane.showMessageDialog(null,
               "You entered an invalid student ID of: " + studentIdInput); 
            stringId = JOptionPane.showInputDialog(null, 
               "Please enter a four digit student ID number");
            studentIdInput = Integer.parseInt(stringId);        
      }
                  
      for(int x = 0; x < studentId.length; ++x)
      {
         if(studentIdInput == studentId[x])
         {
            studentFirstName = firstName[x];
            studentGpa = gpa[x];
            JOptionPane.showMessageDialog(null,
               "Student's first name is: " + studentFirstName +
               "\nStudent's GPA is: " + studentGpa); 
         }
      }               
   }
}