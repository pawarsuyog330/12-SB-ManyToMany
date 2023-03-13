package com.ashokit.jpa.runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ashokit.jpa.entities.CourseEntity;
import com.ashokit.jpa.entities.StudentEntity;
import com.ashokit.jpa.repository.CourseEntityRepository;
import com.ashokit.jpa.repository.StudentEntityRepository;

@Component
public class MyAppRunner implements CommandLineRunner {

	@Autowired
	StudentEntityRepository studentRepo;

	@Autowired
	CourseEntityRepository courseRepo;

	@Transactional
	@Override
	public void run(String... args) throws Exception {

		/*
		StudentEntity sEntity1 = new StudentEntity(101, "Hiranya Pawar", null);
		StudentEntity sEntity2 = new StudentEntity(102, "Suyog Pawar", null);
		StudentEntity sEntity3 = new StudentEntity(103, "Tanvi Pawar", null);

		CourseEntity cEntity1 = new CourseEntity(2001, "Java", null);
		CourseEntity cEntity2 = new CourseEntity(2002, "Python", null);
		CourseEntity cEntity3 = new CourseEntity(2003, "Data ETL", null);
		CourseEntity cEntity4 = new CourseEntity(2004, "MYSQL", null);
		CourseEntity cEntity5 = new CourseEntity(2005, "DOT NET", null);

		List<CourseEntity> collection1 = new ArrayList<>();
		collection1.add(cEntity1);
		collection1.add(cEntity2);
		collection1.add(cEntity3);
		sEntity1.setCourseList(collection1);

		List<CourseEntity> collection2 = new ArrayList<>();
		collection2.add(cEntity3);
		collection2.add(cEntity4);
		collection2.add(cEntity5);
		sEntity2.setCourseList(collection2);

		List<CourseEntity> collection3 = new ArrayList<>();
		collection3.add(cEntity5);
		collection3.add(cEntity2);
		collection3.add(cEntity1);
		sEntity3.setCourseList(collection3);

		studentRepo.save(sEntity1);
		studentRepo.save(sEntity2);
		studentRepo.save(sEntity3);


		
		  CourseEntity new_course = new CourseEntity(2006, "Scala"); 
		  StudentEntity sEntity = studentRepo.findById(101).get(); 
		  List<CourseEntity> listCourses = sEntity.getCourseList(); 
		  listCourses.add(new_course);
*/
		StudentEntity sEntity = studentRepo.findById(101).get(); 
		List<CourseEntity> listCourses = sEntity.getCourseList();
		Iterator<CourseEntity> it=listCourses.iterator();
		while(it.hasNext())
		{
			CourseEntity cE=it.next();
			if(cE.getCourseId()==2003)
			{
				it.remove();
			}
		}
		
	}

}
