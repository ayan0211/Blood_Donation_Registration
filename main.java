public class main 
{
    public static void main(String[] args) 
    {
        Registration user = new Registration();
        user.personal_details();
        R_check user_check = new R_check();
        if(user_check.flag==0 && user_check.proceed=="y")
        {
            Health_check hc = new Health_check();
            Health_details hd = new Health_details();
            hc.last_donation();
            if(hc.ld=="y")
            {
                hd.last_donation();
            }
            hc.symptoms();
            if(hc.sym=="y")
            {
                hd.symptoms();
            }
            hc.allergies();
            if(hc.all=="y")
            {
                hd.allergies();
            }
            hc.vaccine();
            if(hc.va=="y")
            {
                hd.vaccine();
            }
            hc.medication();
            if(hc.me=="y")
            {
                hd.medication();
            }
        }
    }
}
