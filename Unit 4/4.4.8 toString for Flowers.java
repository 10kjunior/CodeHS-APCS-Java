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

public class Flower
{

    private String name;
    private String color;
    private String genus;
    private String species;

    public Flower(String theName, String theColor, String theGenus, String theSpecies)
    {
        name = theName;
        color = theColor;
        genus = theGenus;
        species = theSpecies;
    }
    public String toString()
    {
        return color + " " + name + " (" + genus + " " + species + ")";
    }
}
