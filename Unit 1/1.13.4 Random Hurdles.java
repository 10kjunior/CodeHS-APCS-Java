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


public class RandomHurdles extends SuperKarel
{
    public void run()
    {
        
       for(int i = 0; i < 13; i++)
       {
       check();
       }
       
       
       
       private void check()
       {
           if(frontIsBlocked())
           {
               jumpHurdle();
           }
           if(frontIsClear())
           {
               move();
           }
       }
       private void jumpHurdle()
       {
           turnLeft();
           move();
           if(rightIsClear())
           {
               turnRight();
               move();
               turnRight();
               move();
               turnLeft();
           }
           else if(rightIsBlocked())
           {
               turnRight();
               turnRight();
               move();
               turnLeft();
           }
       }
       

       
    }
}
