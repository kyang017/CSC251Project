import java.io.*;
import java.util.Scanner;

public class Project_Kasumi_Yang
{
    public static void main(String[] args) throws IOException
    {
        
        File file = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);
        
        //Declare variables
        int testNum;
        String testProName;
        String testFName;
        String testLName;
        int testAge;
        String testStatus;
        double testHeight;
        double testWeight;
        double bmi;
        double policyPrice = 600.00;
        
        int smokerTotal = 0;
        int nonSmokerTotal = 0;
        
        //while loop
        while(inputFile.hasNext())
        {
            testNum = inputFile.nextInt();
            inputFile.nextLine();
            testProName = inputFile.nextLine();
            testFName = inputFile.nextLine();
            testLName = inputFile.nextLine();
            testAge = inputFile.nextInt();
            inputFile.nextLine();
            testStatus = inputFile.nextLine();
            testHeight = inputFile.nextDouble();
            testWeight = inputFile.nextDouble();
            bmi = getPolicyHolderBMI(testHeight, testWeight);
            
            //if else statement for finding how many are non-smokers or smokers
            if (testStatus.equalsIgnoreCase("smoker"))
            {
                smokerTotal++;
            }
            else
            {
                nonSmokerTotal++;
            }
            
            //display information
            System.out.println("\nPolicy Number: " + testNum);
            System.out.println("Provider Name: " + testProName);
            System.out.println("Policyholder's First Name: " + testFName);
            System.out.println("Policyholder's Last Name: " + testLName);
            System.out.println("Policyholder's Age: " + testAge);
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + testStatus);
            System.out.println("Policyholder's Height: " + testHeight + " inches");
            System.out.println("Policyholder's Weight: " + testWeight + " pounds");
            System.out.printf("Policyholder's BMI: %.2f%n", bmi);
            System.out.printf("Policy Price: $%.2f%n", policyPrice); 
        } //end of while loop

        inputFile.close();

        System.out.println("\nThe number of policies with a smoker is: " + smokerTotal);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerTotal);
    }
    
    public static double getPolicyHolderBMI(double height, double weight)
    {
        return (weight * 703) / Math.pow(height, 2);
    }
}
