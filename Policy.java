public class Policy
{
   /**
      Fields for holding policy number, provider name, policyholder's
      first and last name, policyholder's age, policyholder's smoking status,
      policyholder's weight (in pounds) and height (in inches)
   */
   private String policyNum;
   private String providerName;
   private String firstName;
   private String lastName;
   private int policyAge;
   private String smokingStatus;
   private double height;
   private double weight;
   
   //no-arg constructors
   public Policy()
   {
      policyNum = " ";
      providerName = " ";
      firstName = " ";
      lastName = " ";
      policyAge = 0;
      smokingStatus = " ";
      height = 0.0;
      weight = 0.0;
   }
   
   /**
      Constructor that accepts arguments for policy
      @param num The policy number
      @param proName The provider's name
      @param fName The policyholder's first name
      @param lName The policyholder's last name
      @param age The policyholder's age
      @param status The policyholder's smoking status
      @param h The policyholder's height
      @param w The policyholder's weight
   */
   public Policy(String num, String proName, String fName, String lName, int age,
                 String status, double h, double w)
   {
      policyNum = num;
      providerName = proName;
      firstName = fName;
      lastName = lName;
      policyAge = age;
      smokingStatus = status;
      height = h;
      weight = w;
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
      @param fName The policyholder's first name
   */
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   
   /**
      Accessor (getter) method
      @return The policyholder's first name
   */    
   public String getFirstName()
   {
      return firstName;
   }      
   
   /**
      Mutator (setter) method
      @param lName The policyholder's last name
   */
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   
   /**
      Accessor (getter) method
      @return The policyholder's last name
   */    
   public String getLastName()
   {
      return lastName;
   }     
   
   /**
      Mutator (setter) method
      @param age The policyholder's age
   */
   public void setPolicyAge(int age)
   {
      policyAge = age;
   }
   
   /**
      Accessor (getter) method
      @return The policyholder's age
   */    
   public int getPolicyAge()
   {
      return policyAge;
   } 
   
   /**
      Mutator (setter) method
      @param status The policyholder's smoking status
   */
   public void setSmokingStatus(String status)
   {
      smokingStatus = status;
   }
   
   /**
      Accessor (getter) method
      @return The policyholder's smoking status
   */    
   public String getSmokingStatus()
   {
      return smokingStatus;
   }     
      
   /**
      Mutator (setter) method
      @param h The policyholder's height
   */
   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
      Accessor (getter) method
      @return The policyholder's height
   */    
   public double getHeight()
   {
      return height;
   }  
   
   /**
      Mutator (setter) method
      @param w The policyholder's weight
   */
   public void setWeight(double w)
   {
      weight = w;
   }
   
   /**
      Accessor (getter) method
      @return The policyholder's weight
   */    
   public double getWeight()
   {
      return weight;
   } 
     
   /**
      Method for calculating BMI of policyholder
      @return The policyholder's BMI
   */
   public double getPolicyHolderBMI()
   {
      return (getWeight() * 703) / Math.pow(getHeight(), 2);
   }
   
   /**
      Method for calculating price of insurance policy
      @return The price of insurance policy
   */
   
   public double getInsurancePrice()
   {
      final double BASE_FEE = 600.00; //Use CONSTANTS for base fee
      double totalPrice = 0.00; //Declare and initialize
      double additionalFee1 = 0.00;
      double additionalFee2 = 0.00;
      double additionalFee3 = 0.00;
      
      //if statement for policy age fee
      if (getPolicyAge() > 50)
      {
         additionalFee1 = 75.00;
      }
      
      //if statement for smoking status fee
      if (getSmokingStatus().equalsIgnoreCase("smoker"))
      {  
         additionalFee2 = 100.00;
      }
      
      //if statement for bmi fee
      if (getPolicyHolderBMI() > 35)
      {
         additionalFee3 = (getPolicyHolderBMI() - 35) * 20;
      }
      
      //Calculate total
      totalPrice = BASE_FEE + additionalFee1 + additionalFee2 + additionalFee3;
      
      return totalPrice;    
   }

} //End of public class
