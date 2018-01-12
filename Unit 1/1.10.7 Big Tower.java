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


/* This program draws a big tower from Karel's starting spot */
public class BigTowerKarel extends SuperKarel
{
    public void run()
    {
        while(notFacingNorth())
        {
            turnLeft();
        }
        while(frontIsClear())
        {
            putBall();
            move();
        }
        putBall();
    }
}
