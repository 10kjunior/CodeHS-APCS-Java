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

public class Triangle
{
    private double height;
    private double width;
    
    // Write your constructor here!
    public Triangle(double iheight, double iwidth)
    {
        height = iheight;
        width = iwidth;
    }

    public String toString()
    {
        return "Triangle with width: " + width + " and height: " + height;
    }

}
