import java.awt.*;
import javax.swing.*;

/**
  The NonRoutinePanel class for use with 
  the Joe's Automotive programming challenge.
*/

public class NonRoutinePanel extends JPanel
{
   // Constant for hourly pay rate
   private final double HOURLY_RATE = 20.0;
   
   private JTextField parts;  // Parts charges
   private JTextField hours;  // Hours of labor
      
   /**
      Constructor
   */
   
   public NonRoutinePanel()
   {
      // Create the labels and text fields.
      JLabel partsMsg = new JLabel("Parts Charges:");
      JLabel hoursMsg = new JLabel("Hours of Labor:");
      parts = new JTextField(10);
      hours = new JTextField(10);
      
      // Initialize the text fields to "0".
      parts.setText("0");
      hours.setText("0");
            
      // Create a GridLayout manager.
      setLayout(new GridLayout(2, 2));
      
      // Create a border.
      setBorder(BorderFactory.createTitledBorder("Nonroutine Services"));
      
      // Add the labels and text fields to this panel.
      add(partsMsg);
      add(parts);
      add(hoursMsg);
      add(hours);
   }
   
   /**
      The getCharges method calculates the nonroutine charges.
      @return The amount of nonroutine charges.
   */
   
   public double getCharges()
   {
      double charges = Double.parseDouble(parts.getText()) +
         (Double.parseDouble(hours.getText()) * HOURLY_RATE);
      return charges;
   }
}
