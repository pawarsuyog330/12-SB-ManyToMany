package com.ashokit.jpa.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="COURSES")
public class CourseEntity {
	@Id
	private Integer courseId;
	
	@Column(length=25)
	private String courseName;
	
	//@ManyToMany(cascade = CascadeType.ALL, mappedBy = "courseList")
	//private List<StudentEntity> studentList;
	

}
