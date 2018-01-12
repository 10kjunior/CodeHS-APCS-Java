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


public class SuperCleanupKarel extends SuperKarel
{
    public void run()
    {
        for(int i = 0; i<1000;i++)
        {
            check()
            if(facingSouth())
            {
                break
            }
            
        }
    }
    private void check()
    {
        if(noBallsPresent())
        {
            if(frontIsClear())
            {
                move();
            }
            
        }
        if(ballsPresent())
        {
            takeBall();
            
        }
        if(frontIsBlocked())
            {
                if(facingEast())
                {
                    if(frontIsBlocked())
                    {
                        if(leftIsBlocked())
                        {
                            turnAround()
                        }
                        if(leftIsClear())
                        {
                            turnLeft();
                            move();
                            turnLeft();    
                        }
                        
                        
                    }
                    
                }
                else if(facingWest())
                {
                    if(rightIsBlocked())
                    {
                        turnLeft();
                        while(frontIsClear())
                        {
                            move();
                        }
                        
                        
                    }
                    if(leftIsClear())
                    {
                        if(rightIsClear())
                        {
                            turnRight();
                            move();
                            turnRight();
                        }
                    }
                    
                    
                }
            }
    }
    
}
