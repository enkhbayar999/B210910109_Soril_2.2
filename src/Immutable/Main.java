package Immutable;

public class Main {
	public static void main(String[] args) {
		Course course = new Course("Software Construction"); 
		course.setCourseName("Software Construction");
		
//		System.out.println(course1.courseName); Uuchlaarai bagshaa <3
		//Turshilt 0.0.1
		System.out.println(course.getCourseName());
		
		course.setCourseName("Программ хангамжийн бүтээлт"); 
		System.out.println(course.getCourseName()); }
}