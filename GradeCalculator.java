import java.util.Scanner;

public class GradeCalculator{
	public static void main(String[] args) {
    	int studentScore = getStudentScore();
    	calculateGrade(studentScore);
	}
	
	public static int getStudentScore() {
	    Scanner scoreInput = new Scanner (System.in);
	    System.out.print("Enter your score: ");
	    int studentScore = scoreInput.nextInt();
	    return studentScore;
	}
	
	public static void calculateGrade(int score){
	    if (score >= 90) {
	        System.out.print ("Your Grade is: A");
	    } else if  (score >= 80) {
	        System.out.print ("Your Grade is: B");
	} else if (score >= 70) {
	        System.out.print ("Your Grade is: C");
	} else if  (score >= 60) {
	        System.out.print ("Your Grade is: D");
	} else {
	    System.out.print( "Your Grade is: F");
	}
}
}
