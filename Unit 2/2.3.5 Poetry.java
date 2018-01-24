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

public class Poetry extends ConsoleProgram
{
    public void run()
    {
        System.out.println("This is a haiku");
        System.out.println("I am writing one");
        System.out.println("To learn java");
        
        System.out.println("This is an acrostic poem");
        System.out.println("I dont really know why");
        System.out.println("But this serves beneficial");
        System.out.println("I guess in one way or");
        System.out.println("another. Here is the fifth line");
        
        String line1 = readLine("Enter first line: ");
        String line2 = readLine("Enter second line: ");
        String line3 = readLine("Enter third line: ");
        
        String poem = line1 + line2 + line3;
        System.out.println(poem);

    }
}
