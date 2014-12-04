
public class ArrayPractice
{
   public static void main(String[] args)
   {
      int[] scoreArray = {93, 67, 45, 98, 89, 86};
      
      int sub = 0;
      
      final int INCREASE = 3;
      
      for(sub = 0; sub < 6; ++sub)
      {
         System.out.println("Before increase, score was " 
         + scoreArray[sub]+ "!");
         
         scoreArray[sub] += INCREASE;
         
         System.out.println("After increase, new score is "
         + scoreArray[sub] + "!");
      }
   }
}