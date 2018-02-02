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

public double median(int[] arr)
{
    Arrays.sort(arr);
    if(arr.length % 2 != 0)
    {
        return arr[arr.length/2];
    }
    else
    {
        int half = arr.length/2;
        double first = arr[half-1];
        double second = arr[half];
        return (first + second)/2; 
    }
}
