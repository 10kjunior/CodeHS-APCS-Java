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

public class Pizza
{
    private String theType;
    private String theToppings;
    private int theSize;
    
    public Pizza(String itheType, String itheToppings, int itheSize)
    {
        theType = itheType;
        theToppings = itheToppings;
        theSize = itheSize;
    }
    
    public String toString()
    {
        return theSize + " inch " + theType + " pizza with " + theToppings + " toppings";
    }
}
