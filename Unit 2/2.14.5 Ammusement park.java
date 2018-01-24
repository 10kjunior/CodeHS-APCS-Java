/*---------------------------------------------------------*|
|                Created by Tannre Overly - 2018            |
|-----------------------------------------------------------|
|   WARNING -   WARNING -   WARNING -   WARNING -   WARNING |
|-----------------------------------------------------------|
|   It is highly recommended that you attempt to solve your |
| problems before using work provided here in order to      |
| actually learn from your mistakes. Try to use this only to|
| review or compare your own work.                          |
|_______________________Good_Luck___________________________|*/

public class AmusementPark extends ConsoleProgram
{
    int AGE_LIMIT = 12;
    int HEIGHT_LIMIT = 48;
    
    public void run()
    {
        int age = readInt("Enter your age: ");
        int height = readInt("Enter your height in inches: ");
        
        boolean oldEnough = age >= AGE_LIMIT;
        boolean tallEnough = height >= HEIGHT_LIMIT;
        
        // CHANGE THIS LINE
        // Convert this boolean expression into its De Morgan equivalent
        boolean cannotRide = !(oldEnough && tallEnough);
        
        if(cannotRide)
        {
            System.out.println("You may not ride the rollercoasters.");
        }
        else
        {
            System.out.println("You may ride the rollercoasters!");
        }
        
        boolean canSwim = readBoolean("Can you swim? ");
        boolean hasLifeJacket = readBoolean("Do you have a life jacket? ");
        
        // CHANGE THIS LINE
        // Convert this boolean expression into its De Morgan equivalent
        boolean cannotSwim = !(canSwim || hasLifeJacket);
        
        if(cannotSwim)
        {
            System.out.println("You may not swim in the pool.");
        }
        else
        {
            System.out.println("You may swim in the pool!");
        }
    }
}
