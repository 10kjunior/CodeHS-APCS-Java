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


public class HurdlesKarel extends SuperKarel
{
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            jumpHurdle();
        }
        private void jumpHurdle()
        {
            move();
            move();
            turnLeft();
            move();
            turnRight();
            move();
            turnRight();
            move();
            turnLeft();
            
        }
        private void turnRight()
        {
            turnLeft();
            turnLeft();
            turnLeft();
        }
    }
}
