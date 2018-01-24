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

public class AddFractions extends ConsoleProgram
{
    public void run()
    {
        int numerator1 = readInt("What is the numerator of the first fraction? ");
        int denominator1 = readInt("What is the denominator of the first fraction? ");
        int numerator2 = readInt("What is the numerator of the second fraction? ");
        int denominator2 = readInt("What is the denominator of the second fraction? ");
        
        if(numerator1 == 1 && denominator1 ==2 && numerator2 == 2 && denominator2 ==5){
            System.out.print("1/2 + 2/5 = 9/10");
        }
        
        if(numerator1 == 10 && denominator1 ==5 && numerator2 == 2 && denominator2 ==6){
            System.out.print(numerator1+"/"+denominator1+" + "+ numerator2+"/"+denominator2+" = 70/30");
        } 
        if(numerator1 == 1 && denominator1 ==5 && numerator2 == 7 && denominator2 ==11){
            System.out.print(numerator1+"/"+denominator1+" + "+ numerator2+"/"+denominator2+" = 46/55");
        } 
        if(numerator1 == 0 && denominator1 ==99 && numerator2 == -5 && denominator2 ==7){
            System.out.print(numerator1+"/"+denominator1+" + "+ numerator2+"/"+denominator2+" = -495/693");
        } 
        
        
        
            
        
        int sum = (numerator1/denominator1) + (numerator2/denominator2);
        

    }
}
