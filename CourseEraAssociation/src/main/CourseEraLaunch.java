package main;

import services.DataScience;
import services.MetaWeb;

public class CourseEraLaunch {

	public static void main(String[] args) {
		
		CourseEra ce = new CourseEra(new MetaWeb());
		
		ce.setCourse(new DataScience());
		
		boolean status = ce.getTheCourses(5000.00);

		if(status) {
			System.out.println("Course purchased sucessufully");
		}
		else
			System.out.println("Failed to get the course");
	}

}
