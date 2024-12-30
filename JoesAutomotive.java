import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   Joe�s Automotive programming challenge.
*/

public class JoesAutomotive extends JFrame
{
   private RoutinePanel routine;       // A panel for routine charge checkboxes
   private NonRoutinePanel nonRoutine; // A panel for non-routine charges
   private JPanel buttonPanel;         // A panel for the buttons
   private JButton calcButton;         // Calculates everything
   private JButton exitButton;         // Exits the application

   /**
      Constructor
   */

   public JoesAutomotive()
   {
      // Display a title.
      setTitle("Joe's Automotive");

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a RoutinePanel object.
      routine = new RoutinePanel();

      // Create a NonRoutinePanel object.
      nonRoutine = new NonRoutinePanel();

      // Build the panel that contains the buttons.
      buildButtonPanel();

      // Add the panels to the content pane.
      add(routine, BorderLayout.NORTH);
      add(nonRoutine, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);

      // Pack and display the window.
      pack();
      setVisible(true);
   }

   /**
      The buildButtonPanel method creates a panel containing
      buttons.
   */

   private void buildButtonPanel()
   {
      // Create a button to calculate the charges.
      calcButton = new JButton("Calculate Charges");

      // Add an action listener to the button.
      calcButton.addActionListener(new CalcButtonListener());

      // Create a button to exit the application.
      exitButton = new JButton("Exit");

      // Add an action listener to the button.
      exitButton.addActionListener(new ExitButtonListener());

      // Put the buttons in their own panel.
      buttonPanel = new JPanel();
      buttonPanel.add(calcButton);
      buttonPanel.add(exitButton);
   }

   /**
      CalcButtonListener is an action listener class for the
      calcButton component.
   */

   private class CalcButtonListener implements ActionListener
   {
      /**
         actionPerformed method
         @param e An ActionEvent object.
      */

      public void actionPerformed(ActionEvent e)
      {
         double totalCharges; // Total charges

         // Calculate the total charges
         totalCharges = routine.getCharges() + nonRoutine.getCharges();

         // Display the message.
         JOptionPane.showMessageDialog(null, String.format(
                                       "Total Charges: $%,.2f",
                                       totalCharges));
      }
   } // End of inner class

   /**
      ExitButtonListener is an action listener class for the
      exitButton component.
   */

   private class ExitButtonListener implements ActionListener
   {
      /**
         actionPerformed method
         @param e An ActionEvent object.
      */

      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   } // End of inner class


}
