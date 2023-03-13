package com.ashokit.jpa.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "STUDENTS")
public class StudentEntity {
	@Id
	private Integer studentId;

	@Column(length = 25)
	private String studentName;

	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_COURSES", joinColumns = @JoinColumn(name = "STUDENTID_FK"), 
										 inverseJoinColumns = @JoinColumn(name = "COURSEID_FK"))
	private List<CourseEntity> courseList;
}
