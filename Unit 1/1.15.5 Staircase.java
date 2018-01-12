/*---------------------------------------------------------*\
|                Created by Tannre Overly - 2018            |
|-----------------------------------------------------------|
|   WARNING -   WARNING -   WARNING -   WARNING -   WARNING |
|-----------------------------------------------------------|
|   It is highly recommended that you attempt to solve your |
| problems before using work provided here in order to      |
| actually learn from your mistakes. Try to use this only to|
| review or compare your own work.                          |
|_______________________Good_Luck___________________________|*/


public class Staircase extends SuperKarel
{    
    public void run()
    {
        putBall();
        while(frontIsClear())
        {
            turnLeft();
            while (ballsPresent()) 
            {
                move();
            }

            turnRight();
            move();
            createStep();
        }
    }

    private void createStep()
    {
        turnRight();
        putBall();
        while (frontIsClear())
        {
            move();
            putBall();
        }
        turnLeft();
    }
}
