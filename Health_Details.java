import java.util.Scanner;
import java.util.Arrays;
class Health_details extends Health_check
{
    Scanner sc = new Scanner(System.in);
    String[] months={"January","February","March","April","May","June","July","August","September",
    "October","November","December"};
    String month,disease,allergies,vaccine,med;
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

}
