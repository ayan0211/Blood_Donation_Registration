import java.util.ArrayList;
import java.util.Scanner;
class R_check extends Registration
{
    private int a,wt;
    public int flag=0;
    public String proceed;
    Scanner sc = new Scanner(System.in);
    ArrayList<String> str = new ArrayList<>();
    R_check()
    {   
        super.personal_details();
        a = super.get_age();
        wt = super.get_weight();
        if(a<18)
        {
            str.add("Your age is under 18 yrs.");
            flag++;
        }
        if(wt<45)
        {
            str.add("You are underweight.");
            flag++;
        }
        if(flag!=0)
        {
            System.out.println("Sorry! You are not permitted to donate blood because:");
            for(int i=0;i<str.size();i++)
            {
                System.out.println((i+1)+". "+str.get(i));
            }
        }
        else 
        {
            System.out.print("Your personal details have been recorded, would you like to proceed?(y/n)");
            proceed = sc.nextLine();
            while(!proceed.equals("y") && !proceed.equals("n"))
            {
                System.out.print("Please enter valid response: ");
                proceed = sc.nextLine();
            }
        }

    }
}
