package main;

import services.CCourse;

public class CourseEra {

	private CCourse course;
	
	public CourseEra(CCourse course) {
		
		this.course = course;
	}

	public void setCourse(CCourse course) {
		this.course = course;
	}
	
	public CourseEra() {
		
		super();
	}
	
	public boolean getTheCourses(double amount) {
		
		return course.getCourse(amount);
	}
	
	
}
