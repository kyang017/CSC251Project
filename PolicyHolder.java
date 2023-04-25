import java.util.ArrayList;

public class PolicyHolder
{
   /**
      Fields for holding policyholder's
      first and last name, policyholder's age, policyholder's smoking status,
      policyholder's weight (in pounds) and height (in inches)
   */
   private String firstName;
   private String lastName;
   private int policyAge;
   
   public boolean smokingStatus;
   
   private double height;
   private double weight;
   private double bmi;
   
   public PolicyHolder(String fName, String lName, int age, boolean status, double h, double w)
   {
        firstName = fName;
        lastName = lName;
        policyAge = age;
        smokingStatus = status;
        height = h;
        weight = w;
        bmi = getPolicyHolderBMI();
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
   public void setSmokingStatus(boolean status)
   {
      smokingStatus = status;
   }
   
   /**
      Accessor (getter) method
      @return The policyholder's smoking status
   */    
   public boolean getSmokingStatus()
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

    public String toString()
    {
        return "Policyholder's First Name: " + firstName + "\n" +
                "Policyholder's Last Name: " + lastName + "\n" +
                "Policyholder's Age: " + policyAge + "\n" +
                "Policyholder's Smoking Status (Y/N): " + (smokingStatus ? "smoker" : "non-smoker") + "\n" +
                "Policyholder's Height: " + height + " inches" + "\n" +
                "Policyholder's Weight: " + weight + " pounds" + "\n" +
                "Policyholder's BMI: " + bmi;
    }

}