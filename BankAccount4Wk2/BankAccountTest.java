import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The Unit test BankAccount Class.
 *
 * @author Courtnee Sullivan
 * @version (a version number or a date)
 */
public class BankAccountTest
{
   int[] accIntVals = (42,882,18522,388962,8168202)
   
   @Test
   public void testSavings()
   {
       BankAccount savings = new BankAccount(123, 20, 2);
       
       for(int i=0; i<=4; i++)
            {
               System.out.println("Year: " + i);
               savings.accureInterest();
               assert(saving.getCourtnee()==accIntVals[i]);
            }
   }
  
}
