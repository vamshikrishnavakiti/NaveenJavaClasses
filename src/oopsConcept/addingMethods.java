package oopsConcept;

public class addingMethods {


	public static void main(String[] args) {
		String grade;

		String name ="Vamshi";


		grade =findGrades(65);
		displayGrades(name, grade);
		String name1 ="Nani";
		grade= findGrades(90);
		displayGrades(name1, grade);
		String name2 ="Sangeetha";
		grade= findGrades(30);
		displayGrades(name2, grade);
	}
	public static String findGrades(int score) {

		String grade = null ;

		if (score >=90 && score <=100) {
			grade = "A";
		}
		else if (score >=70 && score <=90) {
			grade = "B";

		}
		else if (score>35 && score <= 70) {
			grade = "C";
		}
		else if (score < 35) {
			grade ="Fail";
		}
		return grade;

	}
	public static void displayGrades(String name , String grade) {
		System.out.println("*********************************");
		System.out.println("Grade of: "+ name +  " is = " +  grade);
		System.out.println("*********************************");

	}
}


