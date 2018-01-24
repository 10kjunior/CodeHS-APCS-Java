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

public class Add10 extends ConsoleProgram
{
    public void run()
    {
        add10(1);
        add10(100);
        add10(-50);
    }
    
    private void add10(int a)
    {
        int b = a+10;
        System.out.println(b);
    }
}
