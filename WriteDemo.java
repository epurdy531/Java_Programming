   import java.io.*;
   import java.util.Scanner;

   public class WriteDemo
   {
      public static void main(String[] args)
      {
      // In this exercise, the program will ask you for your
      // favorite quote and will write it to a text file.
      
         try
         {
            File myFile = new File("MyQuote.txt");							// The file to write it to.
            FileOutputStream out = new FileOutputStream(myFile);		// Open the file for writing.
         
            System.out.print("Enter your favorite quote: "); 
            Scanner input = new Scanner(System.in);
            String answer = input.nextLine();
         
         // Now, let's send this quote to the file,
         // character-by-character via the FileOutputStream.
         
            for (int x=0; x < answer.length(); ++x)
               out.write(answer.charAt(x));
               
            out.close();
         }
            catch (IOException exc)
            {
               System.out.println(exc.getMessage());
            }
      }
   }