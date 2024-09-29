import java.util.ArrayList;
class R_check extends Registration
{
    private int a,wt;
    public int flag=0;
    public String proceed;
    ArrayList<String> str = new ArrayList<>();
    R_check()
    {
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

    }
}
