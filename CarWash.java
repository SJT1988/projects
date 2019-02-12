// Programmer: Spencer Trumbore
// Developer: The Disorganization (fictional) 
// Course: CIS 18A
// Assignment: CIS 18A Final Project

/* PREMISE: My original plan for a barista game was having too many problems,
So I reexamined the prompt and thought about which option I could put a new
spin on without being too ambitioius. I settled on a mob-themed car wash that
breaks cars so people have excuses to get out of responsibilities (why not a
repair shop? Because the idea started as a car wash that serves pizza, and I
didn't want to restart again.)

The program is basically a terminal that asks the user a series of questions
about the kind of services they want. The user is presumed by the program to be
in-the-know, but some of the (less-than-stellar) humor comes from options that
indicate the user is confused. The fees for each "car wash" are listed up-front,
but there are additional fees for each service provided that are announced
while the program is upselling.

You don't have to pay the company more than the $10 fee for the regular wash
(try saying 0 at the second prompt) but you may be better off doing so. You
won't have a choice for the other washes.
*/
import java.util.Scanner;

public class CarWash
{
    public static String[] serviceDescription = new String[4];
    public static double[] serviceAmount = new double[4];
    public double price;
    public String name;

    public CarWash(double p, String n)
    {
	price = p;
	name = n;
        popTires();
        serviceDescription[3] = "SERVICE CHARGE    ";
        serviceAmount[3] = price;
        
    }

    public CarWash()
    {
	
    }

    public void popTires()
    {
        int tiresPrice = 10;
        int tiresPopped;
        boolean badInput;
        System.out.println("  i. F L A T T E N   T I R E S ($10 each)");
        System.out.println("=========================================\n");
        System.out.print("  How many tires ya want popped?\n");
        System.out.println("  1. 1");
        System.out.println("  2. 2");
        System.out.println("  3. 3");
        System.out.println("  4. 4");
        System.out.println("=========================================");        
        
        Scanner reader = new Scanner(System.in);
        do
        {
            badInput = false;
            System.out.print("  SELECTION  ");
            tiresPopped = reader.nextInt();
            
            if (tiresPopped < 0 || tiresPopped > 4)
            {
                badInput = true;
                System.out.println("Wat, don't you count good? Try again, wise-guy!\n");
            }
        } while (badInput == true);

        
	if(tiresPopped == 0)
	{
            System.out.println("(Bad choice. All tires have been "
                + "popped. Better call a tow truck.)");
	}
	
        else if(tiresPopped < 0 || tiresPopped > 4)
        {
            
        }
        
        else
        {
            System.out.println("You got it, bub: " + tiresPopped + " tires blown!");
            serviceDescription[0] = Integer.toString(tiresPopped) + " CANOLIS         ";
            serviceAmount[0] = tiresPopped * tiresPrice;
        }
        System.out.println("\n");
    }

    public double getPrice()
    {
        return this.price;
    }

    public String getName()
    {
	return this.name;
    }

    public static int mainMenu()
    {
        Scanner reader = new Scanner(System.in);

        System.out.println("  M A I N   M E N U");
        System.out.println("========================================\n");
        System.out.println("  Hey! Welcome ta Alibi's Car Wash,\n"
            + "  where you pay cash and we don't ask no\n"
            + "  questions! What kinda car wash you wants? \n"
            + "  pick a number from 1 to 4.");
        System.out.println("  1. Regular Car Wash - $10 fee:");
        System.out.println("   \ta. flatten tire(s)");
        System.out.println("  2. Mid-Grade Car Wash - $15 fee:");
        System.out.println("   \ta. flatten tire(s),\n"
                + "   \tb. apply mud");
        System.out.println("  3. Premium Car Wash - $20 fee:");
        System.out.println("   \ta. flatten tire(s),\n"
                + "   \tb. apply mud,\n"
                + "   \tc. break legs");
        System.out.println("  4. \"Err, Sorry, I thought this was an \n"
                + "     illigitimate business!\"");
        System.out.println("========================================");
        System.out.print("  SELECTION:  ");

	return reader.nextInt();
    }
    
    public void printReceipt(String[] serviceDescription, double[] serviceAmount)
    {
        double total = 0;
        
        System.out.println("  R E C I E P T");
        System.out.println("==============================\n");
        System.out.println(getName());
        for(int i = 0; i < 4; i++)
    	{
            System.out.println(serviceDescription[i] + "\t$" + serviceAmount[i]);
            total += serviceAmount[i];
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Total" +"             " + "\t" + "$" + total);
    }

//==============================================================================
// M A I N()
//==============================================================================    
    
    public static void main(String[] args)
    {
    	//String[] serviceDescription = new String[4];
	//double[] serviceAmount = new double[4];
	int selection = mainMenu();
        System.out.println("\n");
        
        switch(selection)
        {
            case 1:
            {
                CarWash obj = new CarWash(10.00, "Basic Wash");
                obj.printReceipt(serviceDescription, serviceAmount);
                break;
            }
            case 2:
            {
                MidGradeWash obj = new MidGradeWash(15.00, "Mid-Grade Wash");
                obj.printReceipt(serviceDescription, serviceAmount);
                break;
            }
            case 3:
            {
                PremiumWash obj = new PremiumWash(20.00, "The Soprano");
                obj.printReceipt(serviceDescription, serviceAmount);
                break;
            }
            default:
            {
                System.out.println("Bad input. \n"
                        + "Come back when you need an alibi.");
            }
        }
    }
}