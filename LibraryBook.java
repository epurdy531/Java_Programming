//Filename is LibraryBook.java
//Written by Erica Peharda
//Written on September 29th, 2013
public class LibraryBook
{
   String title;
   String author;
   int pages;
   
   public LibraryBook(String t, String a, int p)
   {
      title = t;
      author = a;
      pages = p;
   }
   
   public String getTitle()
   {
      return title;
   }

   public String getAuthor()
   {
      return author;
   } 

   public int getPages()
   {
      return pages;
   }

}