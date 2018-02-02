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

public class PrintArray extends ConsoleProgram
{
    public void run()
    {
        String[] arr = new String[]{"a", "b", "c"};
        printArr(arr);
    }
    
    public void printArr(String[] arr)
    {
        
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
