import java.util.Scanner;

public class Project_Kasumi_Yang
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in); //Create scanner object
      
      int testNum; //To hold policy number
      String testProName; //To hold provider name
      String testFName; //Policyholder first name
      String testLName; //Policyholder last name
      int testAge; //Hold Policyholder age
      String testStatus; //Policyholder smoking status
      double testWeight; //Policyholder's weight
      double testHeight; //Policyholder's height
      
      //Get policy number from user
      System.out.print("Please enter the Policy Number: ");
      testNum = keyboard.nextInt();
      
      keyboard.nextLine();
      
      //Get provider name from user
      System.out.print("Please enter the Provider Name: ");
      testProName = keyboard.nextLine();
      
      //Get policyholder's first name
      System.out.print("Please enter the Policyholder's First Name: ");
      testFName = keyboard.nextLine();
      
      //Get policyholder's last name
      System.out.print("Please enter the Policyholder's Last Name: ");
      testLName = keyboard.nextLine();
      
      //Get policyholder's age
      System.out.print("Please enter the Policyholder's Age: ");
      testAge = keyboard.nextInt();
      
      keyboard.nextLine();
                  
      //Get policyholder's smoking status
      System.out.print("Please enter the Policyholder's Smoking"
                           + " Status (smoker/non-smoker): ");
      testStatus = keyboard.nextLine();
      
      //Get policyholder's height
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      testHeight = keyboard.nextDouble();
      
      //Get policyholder's weight
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      testWeight = keyboard.nextDouble();
      
      /**
         Create an instance of the Policy class,
         passing the data entered as arguments
         to the constructor
      */     
      Policy p = new Policy(testNum, testProName, testFName, testLName,
                           testAge, testStatus, testHeight, testWeight);
                                 
      //Get data and display it
      System.out.println();
      System.out.print("\nPolicy Number: " + p.getPolicyNumber());
      System.out.print("\nProvider Name: " + p.getProvidersName());
      System.out.print("\nPolicyholder's First Name: " + p.getFirstName());
      System.out.print("\nPolicyholder's Last Name: " + p.getLastName());
      System.out.print("\nPolicyholder's Age: " + p.getPolicyAge());
      System.out.print("\nPolicyholder's Smoking Status: " + p.getSmokingStatus());
      System.out.print("\nPolicyholder's Height: " + p.getHeight() + " inches");
      System.out.print("\nPolicyholder's Weight: " + p.getWeight() + " pounds");
      System.out.printf("\nPolicyholder's BMI: %,.2f", p.getPolicyHolderBMI());
      System.out.printf("\nPolicy Price: $%,.2f", p.getInsurancePrice());
   }
}
