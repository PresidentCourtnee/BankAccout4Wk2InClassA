
/**
 * @author Courtnee Sullivan
 * @version (a version number or a date)
 */
public class BankAccount
{
    private int acctNum;
    private int acctBal;
    private int intRate;
    
    public BankAccount (int acctNum,int intRate,int acctBal){
        this.acctNum = acctNum;
        this.intRate = intRate;
        this.acctBal = acctBal;
    }
    
    public void accureInterest()
    {
    acctBal +=acctBal * intRate;     
    }
    
    public int getCourtnee()
    {
      return acctBal;
    }
    
    public void accountInfo()
    { System.out.println("Your account number is: " +acctNum);
        System.out.println("Your account balance is: "+acctBal);
        System.out.println("Your current interest rate is: "+intRate);
               
    }
}
