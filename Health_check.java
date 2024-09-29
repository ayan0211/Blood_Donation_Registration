import java.util.Scanner;
class Health_check extends Registration
{
    Scanner sc = new Scanner(System.in);
    public String ld,sym,all,va,me;
    public void last_donation()
    {
        System.out.print("Have you donated blood earlier?(y/n): ");
        ld = sc.nextLine();
        while(!ld.equals("y") && !ld.equals("n"))
        {
            System.out.print("Please enter valid response: ");
            ld = sc.nextLine();
        }
    }
    public void symptoms()
    {
        System.out.print("Are you facing any chronic or infectious disease?(y/n): ");
        sym = sc.nextLine();
        while(!sym.equals("y") && !sym.equals("n"))
        {
            System.out.print("Please enter valid response: ");
            sym = sc.nextLine();
        }
    }
    public void allergies()
    {
        System.out.print("Do you have any allergies?(y/n): ");
        all = sc.nextLine();
        while(!all.equals("y") && !all.equals("n"))
        {
            System.out.print("Please enter valid response: ");
            all = sc.nextLine();
        }
    }
    public void vaccine()
    {
        System.out.print("Have you taken any vaccine in the last 4 weeks?(y/n): ");
        va = sc.nextLine();
        while(!va.equals("y") && !va.equals("n"))
        {
            System.out.print("Please enter valid response: ");
            va = sc.nextLine();
        }
    }
    public void medication()
    {
        System.out.print("Are you currently taking any medications?(y/n): ");
        me = sc.nextLine();
        while(!me.equals("y") && !me.equals("n"))
        {
            System.out.print("Please enter valid response: ");
            me = sc.nextLine();
        }
    }
}