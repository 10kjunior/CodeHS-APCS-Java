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

public class BugHunter extends ConsoleProgram
{
    public void run()
    {
        String test1 = "Debug";
        String test2 = "bugs bunny";
        String test3 = "boogie";
        String test4 = "baby buggie";
        
        int index1 = findBug(test1);
        int index2 = findBug(test2);
        int index3 = findBug(test3);
        int index4 = findBug(test4);
        
        printBug(test1, index1);
        printBug(test2, index2);
        printBug(test3, index3);
        printBug(test4, index4);
    }
    
    // Returns the index of the String "bug" inside the String str
    // If str does not contain the String "bug", returns -1
    public int findBug(String str)
    {
        return str.indexOf("bug");
    }
    
    public void printBug(String test, int index)
    {
        if(index != -1)
        {
            System.out.println(test + " has a bug at index " + index);
        }
        else
        {
            System.out.println(test + " has no bugs");
        }
    }
}
