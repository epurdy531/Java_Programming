public class BubbleSort
{
   public static void main(String[] args)
   {
      int[] someNums = {88, 33, 99, 22, 54};
      System.out.println("Before the sorting, the array is:");
      for(int sub = 0; sub < someNums.length; ++sub)
      {
         System.out.println(someNums[sub]);
      }
      int a;
      int b;
      int temp;
      int comparisonsToMake = someNums.length - 1;
      for(a = 0; a < someNums.length - 1; ++a)
      {
         for(b = 0; b < comparisonsToMake; ++b)
         {
            if(someNums[b] > someNums[b + 1])
            {
               temp = someNums[b];
               someNums[b] = someNums[b + 1];
               someNums[b + 1] = temp;
            }
         }
      } 
      System.out.println("After the sorting, the array is:");     
      for(int sub = 0; sub < someNums.length; ++sub)
      {
         System.out.println(someNums[sub]);
      }
   }
}