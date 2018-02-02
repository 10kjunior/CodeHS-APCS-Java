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



//!!!!!!!!!!!!!!! NOTE THIS EXERCISE IS INCOMPLETE !!!!!!!!!!!!!!!!!\\

//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
//Student.java--------------------------------------------------------
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//

public class Student
{
    private static final int NUM_EXAMS = 4;
    
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;
    
    private int[] exams;
    private int numExamsTaken;

    /**
     * This is a constructor.  A constructor is a method
     * that creates an object -- it creates an instance
     * of the class. What that means is it takes the input
     * parameters and sets the instance variables (or fields)
     * to the proper values.
     * 
     * Check out StudentTester.java for an example of how to use
     * this constructor. 
     */
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        exams = new int[NUM_EXAMS];
        numExamsTaken = 0;
    }
    
    public double getAverageScore()
    {
        double sum = 0;
        double x = 0.0;
        for(int i = 0; i < exams.length; i++)
        {
            sum += exams[i];
            x = i;
        }
        
        return sum/x;
    }
    
    public String getName()
    {
        return firstName + " " + lastName;
    }
    
    public void addExamScore(int score)
    {
        exams[numExamsTaken] = score;
        numExamsTaken++;
    }
    
    // This is a setter method to set the GPA for the Student.
    public void setGPA(double theGPA)
    {
        gpa = theGPA;
    }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}



//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
//Classroom.java------------------------------------------------------
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
public class Classroom
{
    Student[] students;
    int numStudentsAdded;
    
    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }
    
    public Student getTopStudent()
    {
        Student top = students[0];
        
        
        for(int i = 0; i < numStudentsAdded; i++)
        {
            if(top.getAverageScore() < students[i].getAverageScore())
            {
                top = students[i];
            }
        }
        return top;
    }
    
    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }
    
    public void printStudents()
    {
        for(int i = 0; i < numStudentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}


//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
//Randomizer.java----------------------------------------------------
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
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


