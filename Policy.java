import java.util.ArrayList;

public class Policy
{
   /**
      Fields for holding policy number, provider name, policyholder's
      first and last name, policyholder's age, policyholder's smoking status,
      policyholder's weight (in pounds) and height (in inches)
   */
   private String policyNum;
   private String providerName;
   private PolicyHolder policyHolder;
   private String smokingStatus;
   private double height;
   private double weight;
   private double insurancePrice;
   
   private static int numPolicy = 0;
   private static int totalSmokers = 0;
   private static int totalNonSmokers = 0;
   
   /**
      Constructor that accepts arguments for policy
      @param num The policy number
      @param proName The provider's name
      @param policyHolder The policy holder
      @param insurancePrice The insurance price
   */ 
     
   public Policy(int policyNum, String providerName, PolicyHolder policyHolder, double insurancePrice)
   {
      policyNum = policyNum;
      providerName = providerName;
      policyHolder = policyHolder;
      insurancePrice = insurancePrice;
      
      numPolicy++;
      
      if (policyHolder.smokingStatus)
      {
         totalSmokers++;
      }
      else
      {
         totalNonSmokers++;
      }     
   } 
   
   /**
      Mutator (setter) method
      @param num The policy number
   */
   public void setPolicyNumber(String num)
   {
      policyNum = num;
   }
   
   /**
      Accessor (getter) method
      @return The policy number
   */    
   public String getPolicyNumber()
   {
      return policyNum;
   } 
   
   /**
      Mutator (setter) method
      @param proName The provider's name
   */
   public void setProvidersName(String proName)
   {
      providerName = proName;
   }
   
   /**
      Accessor (getter) method
      @return The provider's name
   */    
   public String getProvidersName()
   {
      return providerName;
   }   
   
    /**
      Mutator (setter) method
      @param policyHolder The policy holder
   */
   public void setPolicyHolder()
   {
      PolicyHolder policyHolder;
   }
   
   /**
      Accessor (getter) method
      @return The policy holder
   */    
   public PolicyHolder getPolicyHolder()
   {
      return policyHolder;
   }   
    
   /**
      Mutator (setter) method
      @param numPolicy The number of policies
   */
   public static void setNumPolicy(int numPolicy)
   {
      Policy.numPolicy = numPolicy;
   }
   
   /**
      Accessor (getter) method
      @return The number of policies
   */    
   public static int getNumPolicy()
   {
      return numPolicy;
   }    
   
   /**
      Mutator (setter) method
      @param totalSmokers The number of smokers
   */
   public static void setTotalSmokers(int totalSmokers)
   {
      totalSmokers = totalSmokers;
   }
   
   /**
      Accessor (getter) method
      @return The number of smokers
   */    
   public static int getTotalSmokers()
   {
      return totalSmokers;
   }    
   
   /**
      Mutator (setter) method
      @param totalNonSmokers The number of non-smokers
   */
   public static void setTotalNonSmokers(String totalNonSmokers)
   {
      totalNonSmokers = totalNonSmokers;
   }
   
   /**
      Accessor (getter) method
      @return The number of non-smokers
   */    
   public static int getTotalNonSmokers()
   {
      return totalNonSmokers;
   }  
   
    public String toString()
    {
        return "Policy Number: " + policyNum + "\n" +
                "Provider Name: " + providerName + "\n" +
                policyHolder.toString() + "\n" +
                "Policy Price: $" + insurancePrice;
    }   
      
} //End of public class