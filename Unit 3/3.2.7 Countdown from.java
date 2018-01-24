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

public class Countdown extends ConsoleProgram
{
    public void run()
    {
        countdownFrom(5);
    }
    
    private void countdownFrom(int x)
    {
        for (int i = 0; i <= x+3; i++){
            System.out.println(x);
            x -= 1;
            
        }
    }
}
