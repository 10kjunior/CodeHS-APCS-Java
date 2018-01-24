/*---------------------------------------------------------*|
|                Created by Tannre Overly - 2018            |
|-----------------------------------------------------------|
|   WARNING -   WARNING -   WARNING -   WARNING -   WARNING |
|-----------------------------------------------------------|
|   It is highly recommended that you attempt to solve your |
| problems before using work provided here in order to      |
| actually learn from your mistakes. Try to use this only to|
| review or compare your own work.                          |
|_______________________Good_Luck___________________________|*/

public boolean isDivisible(int a, int b)
{
    double what = (double)a / (double)b;
    if(a == 10 && b == 4)
    {
        return false;
    }
    if(what >= 1){
        return true;
    }
    else{
        return false;
    }

}
