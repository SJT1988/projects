import java.util.Scanner;

public class MidGradeWash extends CarWash
{
    public MidGradeWash(double p, String n)
    {
	super(p, n);
        applyMud();
    }

    public MidGradeWash()
    {
	super();
    }
    
    public void applyMud()
    {
        Scanner reader = new Scanner(System.in);
        int selection;
        boolean badInput;
        
        System.out.println("  ii. A P P L Y   M U D ($50)");
        System.out.println("=============================\n");
        System.out.print("  You want the good stuff?\n");
        System.out.println("  1. \"Yes?\"");
        System.out.println("  2. \"No?\"");
        System.out.println("=============================");
        
        do
        {
            badInput = false;
            System.out.print("  SELECTION:  ");
            selection = reader.nextInt();
            
            if (selection != 1 && selection != 2)
            {
                badInput = true;
                System.out.println("Wat, don't you count good? Try again, wise-guy!\n");
            }
        } while (badInput == true);
        
        // regardless of choice:
        System.out.println("We gave you the good stuff. Fo'get about it!\n");
        serviceDescription[1] = "THE GOOD STUFF    ";
        serviceAmount[1] = 50.00;
    }
}