//Filename is DemoBook.java
//Written by Erica Peharda
//Written on October 31st, 2013

public class DemoBook
{
   public static void main(String[] args)
   {
      Book book1 = new Book();
      book1.setBookTitle("The Human Brain");
      book1.setBookPages(345);
      System.out.println("When using the super class to instantiate an object called book1.\n" +
         "The book title is: " + book1.getBookTitle() + ".\n" +
         "The number of pages in the book is: " + book1.getBookPages() + ".");
         
      TextBook TextBook1 = new TextBook();
      TextBook1.setBookTitle("Infant Pscyhological Developement");
      TextBook1.setBookPages(453);
      TextBook1.setGradeLevel(12);
      TextBook1.setCourseName("Psychology");
      System.out.println("\n\nWhen using the subclass to instantiate an object called TextBook1.\n" +
         "The book title is: " + TextBook1.getBookTitle() + ".\n" +
         "The number of pages is in the book is: " + TextBook1.getBookPages() + ".\n" +
         "The grade level for the book is: " + TextBook1.getGradeLevel() + ".\n" +
         "The course name is: " + TextBook1.getCourseName() + ".");
   }
}