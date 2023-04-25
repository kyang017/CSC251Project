import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project_Kasumi_Yang
{
    public static void main(String[] args) throws IOException
    {   
        //Declare variables
        String testNum;
        String testProName;
        String testFName;
        String testLName;
        int testAge;
        String testStatus;
        double testHeight;
        double testWeight;
        
        int smokerTotal = 0;
        
        //ArrayList to store Policy objects
        ArrayList<Policy> policyList = new ArrayList<Policy>();
        
        PolicyHolder policyHolder = new PolicyHolder();
      
        //create and open the file
        File file = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);     
           
        //while loop
        while(inputFile.hasNext())
        {
            testNum = inputFile.nextLine();
            inputFile.nextLine();
            testProName = inputFile.nextLine();
            testFName = inputFile.nextLine();
            testLName = inputFile.nextLine();
            
            if (inputFile.hasNextLine())
            {
                testAge = inputFile.nextInt();
                inputFile.nextLine(); //the newline character
            }
            
            testStatus = inputFile.nextLine();
            testHeight = inputFile.nextDouble();
            testWeight = inputFile.nextDouble();
               
            if(inputFile.hasNext())
               inputFile.nextLine();
            if(inputFile.hasNext())
               inputFile.nextLine();
                        
            //create a Policy object and add it to our ArrayList
            Policy policy = new Policy(testNum, testProName, testFName, testLName, testAge, testStatus, testHeight, testWeight);
            policyList.add(policy);
            
        } //end of while loop
        
         //print out information about each Policy object
         for(Policy policy : policyList)
         { 
            //display information about the Policy
            System.out.print(policy.toString() );
            System.out.println();
            System.out.print(policyHolder.toString() );             
         }
         
         //the number of policies, smokers and non-smokers
         System.out.println("The number of policies with a smoker is: " + smokerTotal);
         System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - smokerTotal) );        
    }
    
}
