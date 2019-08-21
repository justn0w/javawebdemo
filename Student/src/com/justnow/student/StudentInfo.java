package com.justnow.student;


public class StudentInfo {
	
	
	public static void main(String args[]) {
		int year = 100;
		Date testdate = new Date(year);
		StudentTest test = new StudentTest(testdate, year);
	}
}

class StudentTest{
	private Date Mine;
	public StudentTest() {
	}
	public StudentTest(Date Mine, int y) {
		this.Mine = new Date(y);
		this.Mine.Print();
	}

}

class Date{
	private int year;
	public Date(int y) {
		this.year = y;
	}
	public void Print(){
		System.out.println(this.year);
	}
}