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


// Add comments to each of your methods
public class TwoTowersKarel extends Karel
{ 
    //Program begins here
    //Karol will move to determined locations and build two towers
	public void run()
	{
    	move();
        buildTower();
        comeDown();
        move();
        move();
        buildTower();
        move();
        turnRight();
	}
    //used to make karol turn right
    private void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    //used to make karol turn around
    private void turnAround()
    {
        turnLeft();
        turnLeft();
    }
    //returns karol to the floor
    private void comeDown()
    {
        turnAround();
        move();
        move();
        turnLeft();
    }
    //builds a tower of 3 balls heighth
    private void buildTower()
    {
        turnLeft();
        putBall();
        move();
        putBall();
        move();
        putBall();
    }
}
