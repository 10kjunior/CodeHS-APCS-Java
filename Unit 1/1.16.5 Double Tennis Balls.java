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


public class DoubleTennisBallsKarel extends SuperKarel
{
    
    // WILL COME BACK TO REDUCE UNECESARY CODE!!! -TANNER 9/13/17
    public void run()
    {
        move();
        for(int i = 0; i < 21; i++)
        {
            check()
        }
        for(int i = 0; i <21; i++)
        {
            moveStack()
            
        }
        for(int i = 0; i <42; i++)
        {
            secondStack()
        }
        turnAround()
        move();
        turnAround()
    }
    public void check()
    {
        
        if(ballsPresent())
        {
            doubleStack()
        }
        if(noBallsPresent())
        {
            turnAround()
            turnAround()
        }
    }
    
    private void moveStack()
    {
        if(ballsPresent())
        {
            takeBall();
            turnAround()
            move();
            putBall();
            turnAround()
        }
        
    }
    private void secondStack()
    {
        
        move();
        if(ballsPresent())
        {
        takeBall();
        turnAround()
        move()
        putBall()
        turnAround()
        }
        if(noBallsPresent())
        {
            turnAround()
            move();
            turnAround()
        }
        
    }
    private void doubleStack()
    {
        takeBall();
        move();
        putBall();
        putBall();
        turnAround()
        move();
        turnAround()
    }
    
    
    
    
    
    
    
    
    private void turnAround()
    {
        turnLeft();
        turnLeft();
    }
    
 
    
}
