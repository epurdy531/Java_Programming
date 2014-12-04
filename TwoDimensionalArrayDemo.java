import java.util.Scanner;
class TwoDimensionalArrayDemo
{
   public static void main(String[] args)
   {
      //declaring a 3 x 3 array of integers
      int[][] count = new int[3][3];
      //declaring a scanner object for input, variables to hold
      //a row and column, and a constant that can indicate quit
      Scanner input = new Scanner(System.in);
      int row, column;
      final int QUIT = 99;
      
      //prompt user to enter a row or to "quit"
      System.out.print("Enter a row or " + QUIT + 
         " to quit > ");
      row = input.nextInt();
      
      //while the user hasn't entered quit, prompt user for column, if both are
      //within appropriate ranges, add 1 to the element in the selected position
      
      while(row != QUIT)
      {
         System.out.print("Enter a column > ");
         column = input.nextInt();
         if(row < count.length && column < count[row].length)
         {
            count[row][column]++;
            
            //within if statement that checks valid row/column
            //add a nested loop that displays each row adn column of newly 
            //incremented array.  Elements in each row are displayed on the same 
            //line and a new line is started at the end of each row.
            
            for(int r = 0; r < count.length; ++r)
            {
               for(int c = 0; c < count[r].length; ++c)
                  System.out.print(count[r][c] + " ");
               System.out.println();
            }
         }
         
         else
            System.out.println("Invalid position selected");
            
               System.out.print("Enter a row or " + QUIT + 
                  " to quit > ");
               row = input.nextInt();         
      }
   }
}