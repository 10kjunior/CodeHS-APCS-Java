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


public class TowerBuilderKarel extends SuperKarel
{
    public void run()
    {
        for(int i = 0; i<10; i++)
        {
            
            if(noBallsPresent())
            {
                buildTower();
            }
            if(frontIsClear())
            {
                move();
                if(frontIsBlocked())
                {
                    break;
                }
                move();
            }
            if(ballsPresent())
            {
                break;
            }
        }
        
        
    
    }
    
    private void buildTower()
    {
        turnLeft();
        for(int i = 0; i<3; i++)
        {
            putBall();
            move();
        }
        turnAround()
        move();
        move();
        move();
        turnLeft();
    }
}
