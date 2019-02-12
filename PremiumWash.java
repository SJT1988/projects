import java.util.Scanner;

public class PremiumWash extends MidGradeWash
{
    public PremiumWash(double p, String n)
    {
        super(p, n);
        breakLeg();
    }

    public PremiumWash()
    {
        super();
    }

    public void breakLeg()
    {
        Scanner reader = new Scanner(System.in);
        int selection;
        boolean badInput;
        
        System.out.println("  B R E A K   L E G ($100 each)");
        System.out.println("===============================\n");
        System.out.println("  Left or right?\n");
        System.out.println("  1. Left");
        System.out.println("  2. Right");
        System.out.println("  3. \"Wait, what?\"");
        System.out.println("===============================");
        
        do
        {
            badInput = false;
            System.out.print("  SELECTION:  ");
            selection = reader.nextInt();
            
            if (selection != 1 && selection != 2 && selection != 3)
            {
                badInput = true;
                System.out.println("Wat, don't you count good? Try again, wise-guy!\n");
            }
        } while (badInput == true);
        
        if (selection == 1)
        {
            System.out.println("Hope this is worth it...\n");
            System.out.println("<CRACK!>\n");
            System.out.println("(Your left leg has been broken.\n"
                + "Better call an ambulance.)\n");
            serviceDescription[2] = "DIDN'T SEE NOTHIN\'";
            serviceAmount[2] = 100.00;
        }
        
        if (selection == 2)
        {
            System.out.println("You must really not wanna go ta that wedding...");
            System.out.println("<CRACK!>\n");
            System.out.println("(Your right leg has been broken.\n"
                + "Better call an ambulance.)\n");
            serviceDescription[2] = "DIDN'T SEE NOTHIN\'";
            serviceAmount[2] = 100.00;
        }
        
        if (selection == 3)
        {
            System.out.println("--CHICKEN-BUTT!\n");
            System.out.println("<CRACK!>\n");
            System.out.println("(Both your legs have been broken.\n"
                + "Better call an ambulance.)\n");
            serviceDescription[2] = "PROVE IT        ";
            serviceAmount[2] = 200.00;
        }
    }
}