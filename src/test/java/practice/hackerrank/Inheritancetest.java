package practice.hackerrank;
import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
class Student extends Person{
	private int[] testScores;

   Student(String firstName, String lastName, int identification,int[] testScores){
       super(firstName,lastName,identification);
       this.testScores = testScores;
   }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public char calculate(){
        int Average =0 ;
        int length =testScores.length;
        for(int i=0;i<length;i++){
             Average = Average + testScores[i];
                   }
                      Average = Average/length;
        if(Average>=90){
            return 'O';
        }else if(Average>=80){
            return 'E';}
            else if(Average>=70){
            return 'A';}
            else if(Average>=55){
            return 'P';}
            else if(Average>=40){
            return 'D';}
            else 
            return 'T';   
    }
}

class Inheritancetest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		s.calculate();
		System.out.println("Grade: " + s.calculate());
	}
}
