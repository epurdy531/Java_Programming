   import java.io.*;

   public class FileReadWrite
   {
      public static void main(String[] args)
      {
         File myFile = new File("SomeData.txt");
         if (myFile.exists())
         {
            System.out.println(myFile.getName() + " exists");
            System.out.println("The file is " + myFile.length() + " bytes long.");
         
            if (myFile.canRead())
               System.out.println("Ok to read");
            else
               System.out.println("Not ok to read");
         	
            if (myFile.canWrite())
               System.out.println("Ok to write");
            else
               System.out.println("Not ok to write");
         }
         else
            System.out.println("File does not exist");
      }
   }
