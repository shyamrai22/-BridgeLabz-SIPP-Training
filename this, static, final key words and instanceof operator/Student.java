package oops_day_03_package;

public class Student {
	
	   // Static variable
	   private static String universityName;
	   private static int totalStudents = 0;
	   
	   // Instance variable
	   private final int rollNumber; // Final variable
	   
	   private String name;
	   private char grade;
	   
	   // Constructor 
	   public Student(String name, int rollNumber, char grade) {
	       this.name = name;
	       this.rollNumber = rollNumber;
	       this.grade = grade;
	       totalStudents++;
	   }
	   
	   // Static method to set the university name
	   public static void setUniversityName(String name) {
	       universityName = name;
	   }
	   
	   // Static method to display the total number of students enrolled
	   public static void displayTotalStudents() {
	       System.out.println("Total Students Enrolled: " + totalStudents);
	   }
	   
	   // Method to display student details
	   public void displayStudentDetails() {
	       if (this instanceof Student) {
	           System.out.println("University Name: " + universityName);
	           System.out.println("Roll Number: " + rollNumber);
	           System.out.println("Name: " + name);
	           System.out.println("Grade: " + grade);
	       } else {
	           System.out.println("The object is not an instance of the Student class.");
	       }
	   }
	   
	   // Method to update the student grade
	   public void updateGrade(char newGrade) {
	       // Using 'instanceof' to verify the object's type before updating grade
	       if (this instanceof Student) {
	           this.grade = newGrade;
	           System.out.println("Grade updated to: " + newGrade);
	       } else {
	           System.out.println("The object is not an instance of the Student class");
	       }
	   }
	   
	   // Getters for instance variable
	   public String getName() {
	       return name;
	   }
	   public int getRollNumber() {
	       return rollNumber;
	   }
	   public char getGrade() {
	       return grade;
	   }
	   
	   //Main Method
	   public static void main(String[] args) {
	       Student.setUniversityName("GLA University");
	       
	       Student student1 = new Student("Ravi Singh", 1, 'A');
	       Student student2 = new Student("Rohit Sharma", 2, 'C');
	       
	       Student.displayTotalStudents();
	       
	       student1.displayStudentDetails();
	       System.out.println();
	       student2.displayStudentDetails();
	       
	       student2.updateGrade('B');
	       System.out.println();
	       
	       student2.displayStudentDetails();
	   }
	}

