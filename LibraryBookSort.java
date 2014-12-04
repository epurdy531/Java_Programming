//Filename is LibraryBookSort.java
//Written by Erica Peharda
//Written on September 29th, 2013

import java.util.Scanner;
public class LibraryBookSort
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String title, author;
      int pages;
      LibraryBook temp;
      
      LibraryBook[] someBook = new LibraryBook[5];
      
      for(int x = 0; x < someBook.length; ++x)
      {
         System.out.print("Please enter a title for your book > ");
         title = input.nextLine();
         
         System.out.print("Please enter an author for your book > ");
         author = input.nextLine();
         
         System.out.print("Please enter the number of pages for your book > ");
         pages = input.nextInt();
         input.nextLine();
         
         someBook[x] = new LibraryBook (title, author, pages);
      }
      
      System.out.print("How would you like LibraryBooks to be sorted?" +
         "\nPlease type 1 for title, 2 for author, or 3 for pages > ");
      
      int sort = input.nextInt();
      
      if(sort == 1)
      {
         for (int x = 0; x < someBook.length - 1; ++x)
            for (int y = 0; y < someBook.length - 1; ++y)
            {
               if(someBook[y].getTitle().charAt(0) > someBook[y + 1].getTitle().charAt(0))
               {
                  temp = someBook[y];
                  someBook[y] = someBook[y + 1];
                  someBook[y + 1] = temp;
               }
            }
         
      }
      else if(sort == 2)
      {
         for (int x = 0; x < someBook.length - 1; ++x)
            for (int y = 0; y < someBook.length - 1; ++y)
            {
               if(someBook[y].getAuthor().charAt(0) > someBook[y + 1].getAuthor().charAt(0))
               {
                  temp = someBook[y];
                  someBook[y] = someBook[y + 1];
                  someBook[y + 1] = temp;
               }
            }
      }
      else if(sort == 3)
      {
         for (int x = 0; x < someBook.length - 1; ++x)
            for (int y = 0; y < someBook.length - 1; ++y)
            {
               if(someBook[y].getPages() > someBook[y + 1].getPages())
               {
                  temp = someBook[y];
                  someBook[y] = someBook[y + 1];
                  someBook[y + 1] = temp;
               }
            }
      }
      

      System.out.print("After sorting, the result of the LibraryBook array is:");      
      for(int x = 0; x < someBook.length; ++x)
      {
         System.out.print("\nTitle:" +someBook[x].getTitle() + " By:" + someBook[x].getAuthor() + " " +
            + someBook[x].getPages() + "pgs.");
      }      
   }
}
