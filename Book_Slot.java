import java.io.*;
import java.util.Scanner;

class Book_Slot 
{
    public void display_slots()
    {   
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("slots.txt"));
            String line;
            System.out.println("Displaying available time slots:");
            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }
            br.close();
        }
        catch(Exception e)
        {
            System.out.println("An error occured while displaying the time slots: "+e);
            e.printStackTrace();
        }
        
    }
    public int search(int n)
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("slots.txt"));
            String line;
            while((line=br.readLine())!=null)
            {
                String[] data = line.split("\\.");
                if(data.length>1)
                {
                    int num = Integer.parseInt(data[0].trim());
                    if(num==n)
                    {
                        br.close();
                        return 1;
                    }
                }

            }
            br.close();
            
        }
        catch(Exception e)
        {
            System.out.println("An error occurred while searching the time slot: "+e);
            e.printStackTrace();
        }
        return -1;
    }
    public void copy()
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("temp.txt"));
            FileWriter fw = new FileWriter("slots.txt");
            fw.write("");
            fw.close();
            FileWriter aw = new FileWriter("slots.txt",true);
            String line;
            while((line=br.readLine())!=null)
            {
                aw.append(line+"/n");
            }
            fw.close();
            br.close();
            FileWriter tw = new FileWriter("temp.txt");
            tw.write("");
            tw.close();
        }
        catch(Exception e)
        {
            System.out.println("An error occurred while copying the contents into slots file: "+e);
            e.printStackTrace();
        }
    }
    public void book()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter slot number from the available slots which you want to book: ");
        int bslot = sc.nextInt();
        while(search(bslot)==-1)
        {
            System.out.print("Invalid slot number, please enter again: ");
            bslot = sc.nextInt();
        }
        try
        {
            FileWriter fw = new FileWriter("temp.txt",true);
            BufferedReader br = new BufferedReader(new FileReader("slots.txt"));
            String line="";
            while ((line = br.readLine()) != null)
            {
                String[] data = line.split("\\.");
                if(data.length>1)
                {
                    int i = Integer.parseInt(data[0].trim());
                    if(i!=bslot)
                    {
                        fw.append(line+"\n");
                    }    
                }
            }
            br.close();
            fw.close();
            copy();

        }
        catch(Exception e)
        {
            System.out.println("An exception occured while booking the slot: "+e);
            e.printStackTrace();
        }
    }
        
}
    

