package com.learn.springBoot.springBootPractice.Controller;



import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springBoot.springPractice.models.Course;

@RestController
public class CourcesController {
	
	// /courses api end-point.
	@RequestMapping("/getCourseList")
	public List<Course> getCourseList(){
		return Arrays.asList(
				new Course(1,"Java Basics","udemy"),
				new Course(2,"Python Basics","Edex")
				);
				
	}

}
