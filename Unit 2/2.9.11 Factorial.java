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

public class Factorial extends ConsoleProgram
{
    public void run()
    {
        int in = readInt("What number would you like to compute the factorial for? ");
        
        int i,fact=1;
 
        for(i=1;i<=in;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
        
}
    
