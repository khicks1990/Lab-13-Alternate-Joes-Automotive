import java.awt.*;
import javax.swing.*;

/**
  The RoutinePanel class for use with
  the Joe's Automotive programming challenge.
*/

public class RoutinePanel extends JPanel
{
   // Named constants for charges
   private final double OIL_CHANGE_CHARGE = 26.0;
   private final double LUBE_JOB_CHARGE = 18.0;
   private final double RADIATOR_FLUSH_CHARGE = 30.0;
   private final double TRANS_FLUSH_CHARGE = 80.0;
   private final double INSPECTION_CHARGE = 15.0;
   private final double MUFFLER_CHARGE = 100.0;
   private final double TIRE_ROTATION_CHARGE = 20.0;

   private JCheckBox oilChange;     // Check box for oil change
   private JCheckBox lubeJob;       // Check box for lube job
   private JCheckBox radiatorFlush; // Check box for radiator flush
   private JCheckBox transFlush;    // Check box for transmission flush
   private JCheckBox inspection;    // Check box for inspection
   private JCheckBox muffler;       // Check box for muffler replacement
   private JCheckBox tireRotation;  // Check box for tire rotation

   /**
      Constructor
   */

   public RoutinePanel()
   {

   }

   /**
      The getCharges method calculates the routine charges.
      @return The amount of routine charges.
   */

   public double getCharges()
   {

   }
}
