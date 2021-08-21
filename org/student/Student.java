package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name = Muveen");
	}
	
	public void studentDept() {
		System.out.println("Student Dept = Civil");
	}
	
	public void studentID() {
		System.out.println("Student ID = 2010310");
}
	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.studentName();
		obj.studentDept();
		obj.studentID();
		obj.deptName();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		
		
		
		
		
		
	}
	
}
