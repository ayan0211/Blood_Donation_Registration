import java.util.Scanner;
public class main 
{
    public static void main(String[] args) 
    {
        Registration user = new Registration();
        user.personal_details();
        R_check user_check = new R_check(user);
        Scanner sc = new Scanner(System.in);
        String slot_confirm;
        if(user_check.flag==0 && user_check.proceed.equals("y"))
        {
            Health_check hc = new Health_check();
            Health_details hd = new Health_details();
            hc.last_donation();
            if(hc.ld.equals("y"))
            {
                hd.last_donation();
            }
            hc.symptoms();
            if(hc.sym.equals("y"))
            {
                hd.symptoms();
            }
            hc.allergies();
            if(hc.all.equals("y"))
            {
                hd.allergies();
            }
            hc.vaccine();
            if(hc.va.equals("y"))
            {
                hd.vaccine();
            }
            hc.medication();
            if(hc.me.equals("y"))
            {
                hd.medication();
            }
        }
        System.out.print("Book a slot?(y/n): ");
        slot_confirm = sc.nextLine();
        if(slot_confirm.equals("y"))
        {
            Book_Slot bs = new Book_Slot();
            bs.display_slots();
            bs.book();
        }
    }
}
