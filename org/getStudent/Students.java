package org.getStudent;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student ID No = " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student name = " + name + " & ID No = " + id );
	}
	
	public void getStudentInfo(String email, long phoneNo) {
		System.out.println("Student Email = " + email + " & phone No = " + phoneNo);
	}
	
	public static void main(String[] args) {
		
		Students obj = new Students();
		obj.getStudentInfo(3036);
		obj.getStudentInfo(3036, "Muveen");
		obj.getStudentInfo("muveen@gmail.com", 9840250054l);
		
		
		
		
	}
	
	
}
