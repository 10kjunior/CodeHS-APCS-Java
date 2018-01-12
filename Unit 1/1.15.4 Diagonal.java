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


/* This program has karel lay a diagonal row of tennis balls. 
 * However, the indenting is all wrong. Can you properly 
 * indent this program? */
public class Diagonal extends SuperKarel
{
    public void run(){
        while(frontIsClear())
        {
           putBall();
            move();
            turnLeft();
            move();
            for(int i = 0; i < 3; i++)
            {
                turnLeft();
            }
        }
        putBall();
    }
}
