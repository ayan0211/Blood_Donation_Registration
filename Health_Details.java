import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
class Health_details extends Health_check
{
    Scanner sc = new Scanner(System.in);
    String[] months={"January","February","March","April","May","June","July","August","September",
    "October","November","December"};
    String month,disease,allergies,vaccine,med;
    Health_details()
    {
        month = "None";
        disease = "None";
        allergies = "None";
        vaccine = "None";
        med = "None";
    }
    @Override
    public void last_donation()
    {
        System.out.print("Enter the month of previous donation(Eg:January,February,etc.): ");
        month = sc.nextLine();
        while(!Arrays.asList(months).contains(month))
        {
            System.out.print("Please enter valid month: ");
            month = sc.nextLine();
        }
    }
    @Override
    public void symptoms()
    {
        System.out.print("Please mention the specific disease you are facing: ");
        disease = sc.nextLine();
    }
    @Override
    public void allergies()
    {
        System.out.print("Please mention the allergies you are facing: ");
        allergies = sc.nextLine();
    }
    @Override
    public void vaccine()
    {
        System.out.print("Please mention the vaccine you have taken: ");
        vaccine = sc.nextLine();
    }
    @Override
    public void medication()
    {
        System.out.print("Please mention the medications you are currently taking: ");
        med = sc.nextLine();
    }
    public void saveDetailsToFile()
    {
        try
        {
            FileWriter fw = new FileWriter("registration.txt",true);
            fw.write("Health Details:\n");
            fw.write("Last Donation Month: "+this.month+"\t|\t"+"Symptoms: "+this.disease+"\t|\t"+"Allergies: "+this.allergies+"\t|\t"+"Past Vaccine: "+this.vaccine+"\t|\t"+"Medication: "+this.med+"\n");
            fw.write("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("An exception has occured while storing registration details.");
            e.printStackTrace();
        }
    }

}
