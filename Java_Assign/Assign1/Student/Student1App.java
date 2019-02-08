package com.cg.dp.App;

import com.cg.dto.Student1;

public class Student1App {

	public static void main(String[] args) {
	    Student1 s = new Student1("Vidya", "vsp");
	    System.out.println(s);  // toString()

	  
	    s.setAddress("vsp");
	    System.out.println(s);  
	    System.out.println(s.getName());
	    System.out.println(s.getAddress());
	    s.addCourseGrade("java", 9);
	    s.addCourseGrade("oracle", 8);
	    s.addCourseGrade("dotnet", 6);
	    s.printGrades();
	    System.out.printf("The average grade is %.2f%n", s.getAverageGrade());
	 }

	}


