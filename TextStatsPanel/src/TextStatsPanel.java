//********************************************************************
//  TextStatsPanel.java       Java Foundations
//
//  Solution to Programming Project 6.15
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TextStatsPanel extends JPanel
{
   private JTextArea textArea;
   private JLabel wordsLabel, lengthLabel;
   private JButton button;

   //-----------------------------------------------------------------
   //  Sets up this panel with a text area and a statistics box.
   //-----------------------------------------------------------------
   public TextStatsPanel()
   {
      textArea = new JTextArea("Enter text here", 10, 40);
      textArea.setLineWrap(true);

      JPanel statsBox = new JPanel();
      statsBox.setBorder (BorderFactory.createTitledBorder("Statistics"));
      statsBox.setPreferredSize (new Dimension(300, 150));

      wordsLabel = new JLabel("Number of words: xxx");
      lengthLabel = new JLabel("Average word length: xxx");

      button = new JButton("Compute Statistics");
      button.addActionListener (new StatsListener());

      statsBox.add(wordsLabel);
      statsBox.add(lengthLabel);
      statsBox.add(button);

      add (textArea);
      add (statsBox);

      setBackground (Color.cyan);
      setPreferredSize (new Dimension(500, 350));
   }

   //*****************************************************************
   //  Represents the listener for the statistics button.
   //*****************************************************************
   private class StatsListener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
         String word;
         int wordCount = 0, wordLengthSum = 0;
         Scanner scan = new Scanner(textArea.getText());
         DecimalFormat fmt = new DecimalFormat("0.###");

         while (scan.hasNext())
         {
            word = scan.next();
            wordCount++;
            wordLengthSum += word.length();
         }

         double averageSize = (double)wordLengthSum / wordCount;
         wordsLabel.setText("Number of words: " + wordCount);
         lengthLabel.setText("Average word length: " + fmt.format(averageSize));
      }
   }
}
