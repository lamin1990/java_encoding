//********************************************************************
//  StringMutation.java       Java Foundations
//
//  Demonstrates the use of the String class and its methods.
//********************************************************************

public class StringMutation
{
   //-----------------------------------------------------------------
   //  Prints a string and various mutations of it.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      String phrase = "Change is inevitable";
      String change1, change2, change3, change4;

      System.out.println ("Original string: \"" + phrase + "\"");
      System.out.println ("Length of string: " + phrase.length());

      change1 = phrase.concat (", except from vending machines.");
      change2 = change1.toUpperCase();
      change3 = change2.replace ('E', 'X');
      change4 = change3.substring (3, 30);

      // Print each mutated string
      System.out.println ("Mutation #1: " + change1);
      System.out.println ("Mutation #2: " + change2);
      System.out.println ("Mutation #3: " + change3);
      System.out.println ("Mutation #4: " + change4);

      System.out.println ("Mutated length: " + change4.length());
   }
}
