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
    private int width;
    private int height;
    
    public Triangle(int iwidth, int iheight){
        width = iwidth;
        height = iheight;
    }
    
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
    
    public double getArea()
    {
        return (1.0/2.0)*width * height;
    }
    
    public String toString()
    {
        return "Triangle: getArea "+getArea();
    }
    

}
