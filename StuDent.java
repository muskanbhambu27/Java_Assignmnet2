package AssIgn2;
//Question Number 8
public class StuDent {
	    private String rollNo;
	    private String name;
	    private String course;
	    private int mark;
	    private char grade;
	    private String result;

	    public void assignValues(String rollNo, String name, String course, int mark) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.course = course;
	        this.mark = mark;
	    }

	    public void calculateGrade() {
	        if (mark > 90) {
	            grade = 'A';
	        } else if (mark >= 80) {
	            grade = 'B';
	        } else if (mark >= 70) {
	            grade = 'C';
	        } else if (mark >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }
	    }

	    public void calculateResult() {
	        if (mark > 60) {
	            result = "Pass";
	        } else {
	            result = "Fail";
	        }
	    }

	    public void printDetails() {
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Name: " + name);
	        System.out.println("Course: " + course);
	        System.out.println("Mark: " + mark);
	        System.out.println("Grade: " + grade);
	        System.out.println("Result: " + result);
	    }

	    public static void main(String[] args) {
	        StuDent student1 = new StuDent();
	        student1.assignValues("101", "Bhai", "JAVA", 13);
	        student1.calculateGrade();
	        student1.calculateResult();
	        student1.printDetails();
	    }
	}

