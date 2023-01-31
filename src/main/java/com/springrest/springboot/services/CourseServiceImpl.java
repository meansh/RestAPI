package com.springrest.springboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springboot.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Course(145, "Java Core", "this course contains basics of Java"));
	}
	
	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
		
	}

}
