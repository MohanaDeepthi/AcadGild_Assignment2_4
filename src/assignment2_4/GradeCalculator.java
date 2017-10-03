package assignment2_4;//package name
//scanner package
import java.util.Scanner;
//class subjects
class Subjects{
	double mathsMarks;//Maths marks attribute
	double physicsMarks;//Physics Marks attribute
	double chemistryMarks; //Chemistry marks attribute
	
	//getter methods for above attributes
	public double getMathsMarks() {
		return mathsMarks;
	}

	public double getPhysicsMarks() {
		return physicsMarks;
	}
	
	public double getChemistryMarks() {
		return chemistryMarks;
	}
	
	
}//end of class

//Class to implement the grading logic
public class GradeCalculator {
	
	//main method
	public static void main(String args[]){
		//Instantiating Scanner object
		Scanner inputScan = new Scanner(System.in);
		//Instantiating Subjects class Object
		Subjects subObj=new Subjects();
		System.out.println("Please enter 3 Maths Physics and Chemistry subject marks");
		//Taking input from user
		subObj.mathsMarks=inputScan.nextDouble();
		subObj.physicsMarks=inputScan.nextDouble();
		subObj.chemistryMarks=inputScan.nextDouble();
		//validation if any of the user input is greater than 100
		if((subObj.mathsMarks>100) || (subObj.chemistryMarks>100)||(subObj.physicsMarks)>100){
			System.out.println("Please enter marks below 100");
		}
		
		else {
			//Calculating Average of the 3 subjects
			double avg=(subObj.getChemistryMarks()+subObj.getMathsMarks()+subObj.getPhysicsMarks())/3;
			//calling method to calculate the grade based on average
			char result=computeGrade((int)avg);//converting average to integer and passing as parameter
			//printing grade
			System.out.println("Grade "+result);
		}
		//closing the scanner
		inputScan.close();
		
	}//end of main method
	//method to compute grade
	public static char computeGrade(int score){
	       //declare result variable	
		   char result;
		   //Returns A if score is > 70
		   if (score>70) { result = 'A'; }
		   //Returns B if score is between 61 and 70
		   else if (score>60 && score<=70) { result = 'B'; }
		   //Returns c if score is <=60
		   else  { result = 'C'; }
		  
		   //return grade
		   return result;   		
	}  //end of method          		

}//end of class
