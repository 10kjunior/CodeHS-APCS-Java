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

public String altCase(String text)
{
    
    String replace = "";

    for(int i = 0; i < text.length(); i++)
    {
        if(i % 2 == 0) {
            
            replace += Character.toString(text.charAt(i)).toUpperCase();
        }
        else
        {
            replace += Character.toString(text.charAt(i)).toLowerCase();
        }
    }

    return replace;
    
}
