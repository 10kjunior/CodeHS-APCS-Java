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

public class PrintOdd extends ConsoleProgram
{
    public void run()
    {
        int[] oddIndexArray = new int[] {1, 2, 3, 4, 5};
    }
    
    public void printOddIndices(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
