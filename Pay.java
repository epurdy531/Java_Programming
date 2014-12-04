//Filename is Pay.java
//Written by Erica Peharda
//Written on October 6th, 2013

//Course Number: CIS 163AA
//Section Number: 11133
//MEID:  ERI2203192

import javax.swing.*;
public class Pay
{
   public static void main(String[] args)
   {
      int employeeSkill;
      double overtimePay;
      double hoursWorked;
      double deductions = 0.0;
      boolean medicalInsurance = false, dentalInsurance = false, disabilityInsurance = false;
      boolean retirementPlan = false;
      boolean overtime = false;
                         //option:         1,     2,     3
      double [] skillset  =       {    17.00, 20.00, 22.00};
      double [] insuranceCost =       {32.50, 20.00, 10.00};
                              // Ins. Type    Med,   Den,   Dis
                           
      do
      {     
         String input = JOptionPane.showInputDialog(null, "What skill level are you at (enter 1, 2, or 3) >>");    
         employeeSkill = Integer.parseInt(input);
      } while (employeeSkill < 1 || employeeSkill > 3);
   
      if( employeeSkill == 2 || employeeSkill ==3)
      {
         int entry;
      
         entry = JOptionPane.showConfirmDialog(null, "Would you like Medical Insurance?" +
            "\nPlease enter Y for yes or N for no >>");        
         medicalInsurance = (entry == JOptionPane.YES_OPTION);
      
         entry = JOptionPane.showConfirmDialog(null, "Would you like Dental Insurance?" +
            "\nPlease enter Y for yes or N for no >>");        
         dentalInsurance = (entry == JOptionPane.YES_OPTION);
            
         entry = JOptionPane.showConfirmDialog(null, "Would you like Long-term Disability Insurance?" +
            "\nPlease enter Y for yes or N for no >>");
         disabilityInsurance = (entry == JOptionPane.YES_OPTION);
      }
      
      int entry;
      entry = JOptionPane.showConfirmDialog(null, "Would you like a retirement plan?");
      retirementPlan = (entry == JOptionPane.YES_OPTION);
      
      String input2 = JOptionPane.showInputDialog(null, "How many hours did you work this week?");
      hoursWorked = Integer.parseInt(input2);
      
      if(hoursWorked > 40)
         overtime = true;
         
      if(overtime == true)
         overtimePay = 1.5*(hoursWorked - 40)*skillset[employeeSkill - 1];
      else
         overtimePay = 0;
         
      double totalPay = (40*skillset[employeeSkill - 1]) + overtimePay;
         
      JOptionPane.showMessageDialog(null, "You worked for " + hoursWorked + " hours." +
         "\nYour hourly payrate is $" + skillset[employeeSkill - 1] + "." +
         "\nYour regular pay for 40 hours is $" + 40 * skillset[employeeSkill - 1] + "." +
         "\nYour overtime pay is $" + overtimePay + "." + 
         "\nYour total pay (without deductions) is $" + totalPay + ".");
         
      if(medicalInsurance == true || dentalInsurance == true || disabilityInsurance == true)
      {
         if(medicalInsurance == true)
            deductions = ++ insuranceCost[0];
         if(dentalInsurance == true)
            deductions = ++ insuranceCost[1];
         if(disabilityInsurance == true)
            deductions = ++ insuranceCost[2];  
      } 
      else if (retirementPlan == true)
         deductions = 0.03 * totalPay;
      else
         deductions = 0.0;
         
         
      if(deductions > totalPay)
         JOptionPane.showMessageDialog(null, "Error: your deductions exceeded your gross pay!");
      else 
         JOptionPane.showMessageDialog(null, "Itemized deductions total to $" + deductions + "."
            + "\nNet pay after deductions is $" + (totalPay - deductions) );      
   }
}