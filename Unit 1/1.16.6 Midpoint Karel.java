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


public class MidpointKarel extends SuperKarel
{
	public void run()
{
    for(int i = 0; i < 1000; i++)
    {
        if (frontIsClear())
        {
            move();
        }
        else
        {
            turnAround();
            for (int j = i/2; j > 0; j--)
            {
                move();
            }
            turnAround();
            break;
        }
    }
    putBall();
}

}
