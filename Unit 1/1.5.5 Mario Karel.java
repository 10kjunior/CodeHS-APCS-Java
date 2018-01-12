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


public class MarioKarel extends Karel
{
    public void run()
    {
        move();
        turnLeft();
        move();
        move();
        move();
        takeTwo();
        moveAroundRight();
        takeTwo();
        moveAroundLeft();
        takeTwo();
        moveAroundRight();
        takeTwo();
        move();
        move();
        move();
        turnLeft();
    }
    public void takeTwo()
    {
        takeBall();
        takeBall();
    }
    public void moveAroundRight()
    {
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
    }
    public void moveAroundLeft()
    {
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
    }
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
