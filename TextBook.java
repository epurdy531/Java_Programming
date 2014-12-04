//Filename is Textbook.java
//Written by Erica Peharda
//Written on October 31st, 2013

public class TextBook extends Book
{
   private int gradeLevel;
   private String courseName;
   
   public int getGradeLevel()
   {
      return gradeLevel;
   }
   public String getCourseName()
   {
      return courseName;
   }
   
   public void setGradeLevel(int grade)
   {
      gradeLevel = grade;
   }
   public void setCourseName(String name)
   {
      courseName = name;
   }
}