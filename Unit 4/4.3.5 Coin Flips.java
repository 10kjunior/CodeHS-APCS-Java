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

import java.util.*;

public class Randomizer{

	public static Random theInstance = null;
	
	public Randomizer(){
		
	}
	
	public static Random getInstance(){
		if(theInstance == null){
			theInstance = new Random();
		}
		return theInstance;
	}
	
	public static boolean nextBoolean(){
		return Randomizer.getInstance().nextBoolean();
	}

	public static boolean nextBoolean(double probability){
		return Randomizer.nextDouble() < probability;
	}
	
	public static int nextInt(){
		return Randomizer.getInstance().nextInt();
	}

	public static int nextInt(int n){
		return Randomizer.getInstance().nextInt(n);
	}

	/* Return a nubmer between min and max, inclusive. */
	public static int nextInt(int min, int max){
		return min + Randomizer.nextInt(max - min + 1);
	}

	public static double nextDouble(){
		return Randomizer.getInstance().nextDouble();
	}

	public static double nextDouble(double min, double max){
		return min + (max - min) * Randomizer.nextDouble();
	}

	
}
