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

public class CastingToDouble extends ConsoleProgram
{
    public void run()
    {
        int firstInt = readInt("First Int: ");
        int secondInt = readInt("Second Int: ");
        
        double firstD = (double)firstInt;
        double secondD = (double)secondInt;
        System.out.print(firstD/secondD);
    }
}
