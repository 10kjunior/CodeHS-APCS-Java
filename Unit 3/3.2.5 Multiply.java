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

public class Multiply extends ConsoleProgram
{
    public void run()
    {
        multiply(2, 20);
        multiply(5, 19);
        multiply(100, 15);
        
    }
    
    private void multiply(int a, int b)
    {
        int c = a * b;
        System.out.println(c);
    }
}
