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

public class Area extends ConsoleProgram
{
    public void run()
    {
        int width = readInt("What is the width of the rectangle? ");
        int height = readInt("What is the height of the rectangle? ");
        double area = width * height;
        System.out.print("The area of the rectangle is "+area+" units squared.");
    }
}
