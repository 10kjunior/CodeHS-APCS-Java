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

public boolean bracketsMatch(String brackets)
{
    int count = 0;
    for (char ch : brackets.toCharArray()) {
        switch (ch) {
        case '{': count++; break;
        case '}': if (--count < 0) return false;
        }
    }
    return count == 0;
}
