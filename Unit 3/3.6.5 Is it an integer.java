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

public boolean isInteger(String str) {
    int len = str.length();

    // an empty string is not an integer
    if (len == 0) {
        return false;
    }

    for (int i = 0; i < len; ++i) {
        if (!Character.isDigit(str.charAt(i))) {
            return false;
        }
    }

    // Went over all the characters, all of them are digits
    return true;
}
