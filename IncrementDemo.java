//Filename is IncrementDemo.java
//Written by Erica Peharda
//Written on August, 27th, 2013

public class IncrementDemo
{
   public static void main(String[] args)
   {
      int myNumber, answer;
      myNumber = 17;
      System.out.println("Before incrementing, myNumber is " + 
         myNumber);
      answer = ++myNumber;
      System.out.println("After prefix increment, myNumber is " + 
         myNumber);
      System.out.println(" and answer is " + answer);
      myNumber = 17;
      System.out.println("Before incrementing, myNumber is " +
         myNumber);
      answer = myNumber++;
      System.out.println("After postfix increment, myNumber is " +
         myNumber);
      System.out.println(" and answer is " + answer);
   }
}