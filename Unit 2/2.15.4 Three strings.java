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

public class ThreeStrings extends ConsoleProgram
{
    public void run()
    {
        // Ask the user for three strings.
        String s1 = readLine("First string? ");
        String s2 = readLine("Second string? ");
        String s3 = readLine("Third string? ");
        // remember to use the readLine() method.
        if(s3.contains(s1) && s3.contains(s2)) {
            System.out.print(s1 + " + " + s2 + " is equal to " + s3 + "!");
        }
        else {
            System.out.print(s1 + " + " + s2 + " is not equal to " + s3 + "!");
        }
    }
}
