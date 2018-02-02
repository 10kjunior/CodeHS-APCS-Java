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

import java.util.ArrayList;

public class MyProgram extends ConsoleProgram
{
    public void run()
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // Add 5 numbers to `numbers`
        
        for(int i = 0; i < 5; i++)
        {
            numbers.add(i+1);
        }
        
        System.out.println(numbers.get(0));
        // Print out the first element in `numbers`
    }
}
