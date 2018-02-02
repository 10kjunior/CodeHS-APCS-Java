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

public int findMin(int[] arr)
{
    int min = arr[0];
    int mini = 0;
    for(int i = 0; i < arr.length; i++)
    {
        if(arr[i] < min)
        {
            min = arr[i];
            mini = i;
            
        }
    }
    return mini;
}
