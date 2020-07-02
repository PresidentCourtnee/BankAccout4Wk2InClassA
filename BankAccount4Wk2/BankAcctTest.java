/**
 * class BankAccountTEst here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAcctTest
{
        private static BankAccount savings;
        private static BankAccount checking;
        private static BankAccount moneyMarket;
        
        public static void main(String[] args)
        {testSavings();
            testSavings();
            
        }
        
        private static void testSavings()
        { savings = new BankAccount (123, 20, 2);
            for(int i=0; i<=4; i++)
            {
                System.out.println("Year: " + i);
                savings.accureInterest();
                System.out.println(savings.getCourtnee());
                savings.accountInfo();
            }
        }
     
}

