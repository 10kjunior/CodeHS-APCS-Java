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

// NEEDS WORK NEEDS WORK NEEDS WORK NEEDS WORK NEEDS WORK \\
public class Divisibility extends ConsoleProgram
{
    public void run()
    {
        int dividend = readInt("Enter the dividend: ");
        int divisor = readInt("Enter the divisor: ");
        if(divisor != 0){
            System.out.println(dividend +" is not divisible by " + divisor + "!");
        }
        else{
            if(dividend / divisor == (double) dividend / divisor)
        {
            System.out.println(dividend + " is divisible by " + divisor + "!");
        }
        else
        {
            System.out.println(dividend + " is not divisible by " + divisor);
        }
        }
        
    }
}
