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

public class TripleDouble extends ConsoleProgram
{
    public void run()
    {
        int points = readInt("How many points did you score? ");
        int rebounds = readInt("How many rebounds did you get? ");
        int assists = readInt("How many assists did you have? ");
        
        // Create a boolean called `tripleDouble`
        boolean tripleDouble;
        if(points >= 10 && rebounds >= 10 && assists >= 10)
        {
            tripleDouble = true;
        }
        else{
         tripleDouble = false; // replace this
           
        }
        System.out.println("Got a Triple Double?: " + tripleDouble);
    }
}


