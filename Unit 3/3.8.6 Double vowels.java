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

public String doubleVowel(String str)
{
    str = str.replaceAll("a", "aa");
    str = str.replaceAll("e", "ee");
    str = str.replaceAll("i", "ii");
    str = str.replaceAll("o", "oo");
    str = str.replaceAll("u", "uu");
    return str;
    
    
}
