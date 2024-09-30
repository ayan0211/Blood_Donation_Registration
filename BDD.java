import java.util.Scanner;

class Volunteer {
    private String name, email, bloodgroup;
    private int rollno, age, weight;
    private long mobile;

    public void set_name(String n) {
        this.name = n;
    }

    public String get_name() {
        return this.name;
    }

    public void set_email(String e) {
        this.email = e;
    }

    public String get_email() {
        return this.email;
    }

    public void set_rollno(int roll) {
        this.rollno = roll;
    }

    public int get_rollno() {
        return this.rollno;
    }

    public void set_age(int age) {
        this.age = age;
    }

    public int get_age() {
        return this.age;
    }

    public void set_mobile(long mob) {
        this.mobile = mob;
    }

    public long get_mobile() {
        return this.mobile;
    }

    public void set_bloodgroup(String bg) {
        this.bloodgroup = bg;
    }

    public String get_bloodgroup() {
        return this.bloodgroup;
    }

    public void set_weight(int w) {
        this.weight = w;
    }

    public int get_weight() {
        return this.weight;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\tWELCOME TO OUR BLOOD DONATION DRIVE!");
        System.out.println("Enter your following registration details...");

        System.out.print("Enter name: ");
        String N = sc.nextLine();
        set_name(N);

        System.out.print("Enter email id: ");
        String E = sc.nextLine();
        while (!E.contains("@") || !E.endsWith(".com")) {
            System.out.print("Invalid email id, Please enter again: ");
            E = sc.nextLine();
        }
        set_email(E);

        System.out.print("Enter rollno (5 digits): ");
        String R = sc.nextLine();
        while (R.length() != 5) {
            System.out.print("Invalid roll no (must be of 5 digits), Please enter again: ");
            R = sc.nextLine();
        }
        int Rollno = Integer.parseInt(R);
        set_rollno(Rollno);

        System.out.print("Enter age (Note: only candidates of age 18 or above will be allowed to donate blood): ");
        int A = sc.nextInt();
        set_age(A);

        sc.nextLine(); 

        System.out.print("Enter mobile no: ");
        String mob = sc.nextLine();
        while (mob.length() != 9) {
            System.out.print("Invalid mobile no (must be of 9 digits), Please enter again: ");
            mob = sc.nextLine();
        }
        long Mobile = Long.parseLong(mob);
        set_mobile(Mobile);

        System.out.print("Enter weight (in kgs) (Note: only candidates weighing at least 45 kg can donate blood): ");
        int wt = sc.nextInt();
        set_weight(wt);

        sc.nextLine(); 

        System.out.print("Enter blood group: ");
        String BG = sc.nextLine();
        set_bloodgroup(BG);
    }
}

public class BDD {
    public static void main(String[] args) {
        Volunteer v = new Volunteer();
        v.input();

        
        System.out.println("Volunteer Name: " + v.get_name());
        System.out.println("Volunteer Email: " + v.get_email());
        System.out.println("Volunteer Roll No: " + v.get_rollno());
        System.out.println("Volunteer Age: " + v.get_age());
        System.out.println("Volunteer Mobile: " + v.get_mobile());
        System.out.println("Volunteer Weight: " + v.get_weight());
        System.out.println("Volunteer Blood Group: " + v.get_bloodgroup());
    }
}
