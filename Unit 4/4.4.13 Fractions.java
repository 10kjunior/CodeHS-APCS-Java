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

public class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction(int inumerator, int idenominator)
    {
        numerator = inumerator;
        denominator = idenominator;
    }
    
    public String toString()
    {
        return numerator + "/" + denominator;
    }
       
}
