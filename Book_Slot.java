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
            while ((line = br.readLine()) != null) 
            {
                System.out.println(line);
            }
            br.close();
        } 
        catch (Exception e) 
        {
            System.out.println("An error occurred while displaying the time slots: " + e);
            e.printStackTrace();
        }
    }

    
    public int search(int n) 
    {
        try 
        {
            BufferedReader br = new BufferedReader(new FileReader("slots.txt"));
            String line;
            while ((line = br.readLine()) != null) 
            {
                String[] data = line.split("\\. ", 2); 
                if (data.length > 1) 
                {
                    int num = Integer.parseInt(data[0].trim()); 
                    if (num == n) 
                    {
                        String[] parts = data[1].split(" - "); 
                        if (parts.length > 1) 
                        {
                            int availableSlots = Integer.parseInt(parts[1].split(" ")[0]); 
                            if (availableSlots > 0) 
                            {
                                br.close();
                                return availableSlots;
                            }
                            else 
                            {
                                return -1;
                            }
                        }
                    }
                }
            }
            br.close();
        }
        catch (Exception e) 
        {
            System.out.println("An error occurred while searching the time slot: " + e);
            e.printStackTrace();
        }
        return -1;
    }

    
    public void copy() 
    {
        try 
        {
            BufferedReader br = new BufferedReader(new FileReader("temp.txt"));
            FileWriter aw = new FileWriter("slots.txt");
            String line;
            while ((line = br.readLine()) != null)
            {
                aw.write(line + "\n");
            }
            aw.close();
            br.close();
            FileWriter tw = new FileWriter("temp.txt");
            tw.write("");
            tw.close();
        } 
        catch (Exception e) 
        {
            System.out.println("An error occurred while copying the contents into slots file: " + e);
            e.printStackTrace();
        }
    }

    
    public void book() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter slot number from the available slots which you want to book: ");
        int bslot = sc.nextInt();
        int availableSlots = search(bslot);
        while (availableSlots == -1)
        {
            System.out.print("Invalid slot number or no slots available, please enter again: ");
            bslot = sc.nextInt();
            availableSlots = search(bslot);
        }

        try 
        {
            FileWriter fw = new FileWriter("temp.txt", true);
            BufferedReader br = new BufferedReader(new FileReader("slots.txt"));
            String line;
            while ((line = br.readLine()) != null) 
            {
                String[] data = line.split("\\. ", 2);
                if (data.length > 1) 
                {
                    int num = Integer.parseInt(data[0].trim());
                    if (num == bslot) 
                    {
                        String[] parts = data[1].split(" - ");
                        int slotsLeft = Integer.parseInt(parts[1].split(" ")[0]) - 1; // Decrease slots by 1
                        fw.append(num + ". " + parts[0] + " - " + slotsLeft + " slots available\n");
                    } 
                    else 
                    {
                        fw.append(line + "\n"); 
                    }
                }
            }
            br.close();
            fw.close();
            copy();

        } 
        catch (Exception e) 
        {
            System.out.println("An exception occurred while booking the slot: " + e);
            e.printStackTrace();
        }
    }

}
