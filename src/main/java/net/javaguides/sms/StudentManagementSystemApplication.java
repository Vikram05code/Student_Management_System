package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.Entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
     
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1 = new Student("Vikram", "Sharma", "vikram@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Rahul", "Kumar", "rahul@gmail.com" );
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("Monu", "Kumar", "monu@gmail.com" );
		 * studentRepository.save(student3);
		 * 
		 * Student student4 = new Student("Vikash", "Kumar", "vikash@gmail.com" );
		 * studentRepository.save(student4);
		 */
		
	}

}
