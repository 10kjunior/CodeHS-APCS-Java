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


// Karel should put a ball on the first spot
// if there isn't one already there and then move.
public class IsThereABallKarel extends SuperKarel
{
    public void run()
    {
        if(ballsPresent())
        {
            move();
        }
        else if(noBallsPresent())
        {
            putBall();
            move();
        }
        // your code here
    }
}
