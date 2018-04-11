
//********************************************************************
//  StringMutation.java       Java Foundations
//
//  Demonstrates the use of the String class and its methods.
//********************************************************************

public class Lab4a
{
   //-----------------------------------------------------------------
   //  Prints a string and various mutations of it.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      String change = "Change is inevitable";
      String change1, change2, change3, change4;

      System.out.println ("Original string: \"" + change + "\"");
      System.out.println ("Length of string: " + change.length());

      change1 = change.concat (", except from vending machines.");
      change2 = change1.toUpperCase();
      change3 = change2.replace ('E', 'X');
      change4 = change3.substring (3, 30);

      // Print each mutated string
      System.out.println ("Mutation #1: " + change1);
      System.out.println ("Mutation #2: " + change2);
      System.out.println ("Mutation #3: " + change3);
     
   }
}
