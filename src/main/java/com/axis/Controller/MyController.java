package com.axis.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.Repository.StudentRepository;
import com.axis.models.Student;

@RestController
@RequestMapping("/student")
public class MyController {
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/")
	public ResponseEntity<?> addStudent(@RequestBody Student student)
	{
		Student save = this.studentRepository.save(student);
		return ResponseEntity.ok(save);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getStudents()
	{
		//Student save = this.studentRepository.save(student);
		return ResponseEntity.ok(this.studentRepository.findAll());
		
	

}
}
